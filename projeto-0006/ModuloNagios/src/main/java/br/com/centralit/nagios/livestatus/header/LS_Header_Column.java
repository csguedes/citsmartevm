/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.header;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author adenir
 */
public class LS_Header_Column extends LS_Header {

    private final List<String> cols;

    public LS_Header_Column(String cols_sep_branco) {
        cols = new ArrayList<>();
        add(cols_sep_branco);
    }

    public void add(String cols_sep_branco) {
        cols.addAll(Arrays.asList(cols_sep_branco.split(" ")));
    }

    @Override
    public String to_s() {
        String resp = "Columns: ";

        for (String s : cols) {
            s = s.trim();
            if (s.equals(cols.get(cols.size() - 1))) {
                resp += s + "\n";
            } else {
                resp += s + " ";
            }
        }

        return resp;
    }
}
