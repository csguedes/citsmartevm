/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.header;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adenir
 */
public class LS_Header_And extends LS_Header {

    /*
     * Create a new "AND" operator between left and right expressions.
     *
     * Those expressions must be of type Nagios::MkLiveStatus::LS_Header_Filter
     */
    public LS_Header_And(LS_Header left_expr, LS_Header right_expr) {
        if (!(left_expr instanceof LS_Header_Filter && right_expr instanceof LS_Header_Filter)) {
            throw new ClassCastException("The left and the right operand for an AND expression must be filter expressions.");
        }

        expressions = new ArrayList<>();

        if (left_expr instanceof LS_Header_And) {
            for (LS_Header o : left_expr.get_expressions()) {
                addExpression(o);
            }
        } else {
            addExpression(left_expr);
        }

        if (right_expr instanceof LS_Header_And) {
            for (LS_Header o : right_expr.get_expressions()) {
                addExpression(o);
            }
        } else {
            addExpression(right_expr);
        }
    }

    /**
     * Return all the expressions under the "AND". It's used by the new method
     * in order to get all "AND" expressions into the same object.
     */
    public List<LS_Header> get_expressions() {
        return expressions;
    }

    /**
     * Convert the current "AND" expression into a nagios query string LS_Header_Filter:
 ... LS_Header_Filter: ... LS_Header_And: 2
     */
    public String to_s() {
        String str = "";

        for (LS_Header o : expressions) {
            str += o.to_s() + "\n";
        }

        str += String.format("And: %d", expressions.size()) + "\n";

        return str;
    }
}
