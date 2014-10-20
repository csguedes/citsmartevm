/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.actions;

import br.com.centralit.nagios.livestatus.query.LS_Query;
import java.util.ArrayList;
import java.util.List;

import br.com.centralit.nagios.livestatus.query.LivestatusSeparator;
//import br.com.centralit.nagios.livestatus.query.LS_Query;
//import br.com.centralit.nagios.livestatus.query.LivestatusSeparator;
import br.com.centralit.nagios.util.JSONConverter;
import java.util.Arrays;

/**
 *
 * @author adenir
 */
public class LS_Response {

    private final List<String> valuesAsStringList;
    private final LS_Query query;
    private int line_count = 0;

    public LS_Response(LS_Query query) {
        valuesAsStringList = new ArrayList<>();
        this.query = query;
    }

//	public String[] getHeadersColumns(){
//		String[] arrayHeadersColumns = new String[query.columns.size()];
//		query.columns.toArray(arrayHeadersColumns);
//		return arrayHeadersColumns;
//	}
    public String asString() {
        String arrayValuesAsString = "";

        for (String s : valuesAsStringList) {
            arrayValuesAsString += s + "\t";
        }

        return arrayValuesAsString;
    }

    public int sizeColumns() {
        return query.columns.size();
    }

    public String getHeadersColumnsAt(int index) {
        return query.columns.get(index);
    }

    public String getColumnsAndValueAsJson(LS_TablesBase obj) {
        int qdlines = size();

        for (int k = 0; k < qdlines; k++) {
            String[] cols = valuesAsStringList.get(k).split(LivestatusSeparator.SEP2());
            for (int i = 0; i < cols.length; i++) {
                obj.set_attribute(cols[i], getHeadersColumnsAt(i), obj.getClass());
            }
        }

        obj.createObjects();

        return JSONConverter.toJson(obj);
    }

    public void add(String line) {
        boolean hasColumns = (query.hasColumns && query.hasColumnHeaders) || (!query.hasColumns);
        if (hasColumns && line_count == 0) {
            query.columns.clear();
            query.columns.addAll(Arrays.asList(line.split(LivestatusSeparator.SEP2())));
        } else {
            valuesAsStringList.add(line);
        }
        line_count += 1;
    }

    public int size() {
        return valuesAsStringList.size();
    }

}
