/*
 * This class is used to make a logical "OR" operator between two filter expressions.
 *
 * If one of the filter expression is also an "OR", 
 * it takes all the expressions of the operator as its own.
 *
 * Author::    Esco-lan Team  (mailto:team@esco-lan.org)
 * Copyright:: Copyright (c) 2012 GIP RECIA
 * License::   General Public Licence
 */
package br.com.centralit.nagios.livestatus.header;

import java.util.ArrayList;
import java.util.List;

/**
 * // // Create a new "OR" operator between left and right expressions. // //
 * Those expressions must be of type Nagios::MkLiveStatus::Filter //
 */
public class LS_Header_Or extends LS_Header {

    public LS_Header_Or(LS_Header left_expr, LS_Header right_expr) {

        if (!(left_expr instanceof LS_Header_Filter && right_expr instanceof LS_Header_Filter)) {
            throw new ClassCastException("The left and the right operand for an OR expression must be filter expressions.");
        }

        expressions = new ArrayList<>();

        if (left_expr instanceof LS_Header_Or) {
            for (LS_Header o : left_expr.get_expressions()) {
                addExpression(o);
            }
        } else {
            addExpression(left_expr);
        }

        if (right_expr instanceof LS_Header_Or) {
            for (LS_Header o : right_expr.get_expressions()) {
                addExpression(o);
            }
        } else {
            addExpression(right_expr);
        }
    }
    /*

     public initialize(left_expr, right_expr){
     if not left_expr.is_a? Nagios::MkLiveStatus::Filter or not right_expr.is_a? Nagios::MkLiveStatus::Filter
     raise QueryException.new("The left and the right operand for an OR expression must be filter expressions.")
     }
    
     @expressions = Array.new
     if left_expr.is_a? Nagios::MkLiveStatus::Filter::LS_Header_Or
     left_expr.get_expressions.each do |expr|
     @expressions.push expr
     }
     else
     @expressions.push left_expr
     }
    
     if right_expr.is_a? Nagios::MkLiveStatus::Filter::LS_Header_Or
     right_expr.get_expressions.each do |expr|
     @expressions.push expr
     }
     else
     @expressions.push right_expr
     }
     */
        //
    // Return all the expressions under the "OR". It's used by 
    // the new method in order to get all "OR" expressions into the same object.  
    //
    //
    // Return all the expressions under the "AND". It's used by 
    // the new method in order to get all "AND" expressions into the same object.  
    //

    public List<LS_Header> get_expressions() {
        return expressions;
    }

    //
    // Convert the current "OR" expression into a nagios query string
    //  Filter: ...
    //  Filter: ...
    //  LS_Header_Or: 2
    //
    public String to_s() {
        String str = "";

        for (LS_Header o : expressions) {
            str += o.to_s() + "\n";
        }

        str += String.format("Or %d", expressions.size()) + "\n";

        return str;
    }
}
