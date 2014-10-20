/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.header;

import br.com.centralit.nagios.livestatus.header.LS_Header;
import br.com.centralit.nagios.livestatus.header.LS_Header_Helper;

/**
 *
 * @author adenir
 */
public class LS_Header_Filter extends LS_Header {

    /**
     * Create the unit predicate with the column name, the operator use to
     * compare, and the value [attr_name] name of the column [attr_comp]
     * operator, one of the constant of the class [attr_value] the value to
     * compare to
     */
    private String c_attr_name = "";
    private String c_attr_comp = "";
    private String c_attr_value = "";

    public LS_Header_Filter(String filters) {
        for (String f : filters.split(",")) {
            String[] str_filter = f.split(" ");
            String column_name = str_filter[0];
            String operator = str_filter[1];
            String value = str_filter[2];

            LS_Header_Filter filter = new LS_Header_Filter(column_name, operator, value);
            
            addExpression(filter);
        }

    }

    public LS_Header_Filter(String attr_name, String attr_comp, String attr_value) {

        if (attr_name == null || attr_name.isEmpty()) {
            throw new ClassCastException("The name of the attribute must be set in order to create the filter");
        } else {
            c_attr_name = attr_name;
        }

        if (!LS_Header_Helper.hasComparator(attr_comp)) {
            throw new ClassCastException("The comparator \"*{attr_comp}\" is not recognized.\n Please use one of : *{list_comparator.join(\", \")}");
        } else {
            c_attr_comp = attr_comp;
        }

        c_attr_value = attr_value;
    }

    /**
     * Convert the class into the nagios query string: Filter: name comp value
     *
     * @return String of filter
     *
     */
    @Override
    public String to_s() {
        if (c_attr_name == null || c_attr_name.isEmpty()) {
            throw new ClassCastException("The filter cannot be converted into string because the name of the attribute is not set.");
        }

        if (c_attr_comp == null || c_attr_comp.isEmpty()) {
            throw new ClassCastException("The filter cannot be converted into string because the comparator of the attribute is not set.");
        }

        if (c_attr_value == null || c_attr_value.isEmpty()) {
            return "Filter: " + c_attr_name + " " + c_attr_comp;
        }

        return "Filter: " + c_attr_name + " " + c_attr_comp + " " + c_attr_value;
    }
}
