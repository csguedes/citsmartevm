/**
 * This class is used to make a logical "NOT" operator for the filter
 * expression.
 * 
* Author:: CentralIt (mailto:adenir.gomes@centralit.com.br) Copyright:: Copyright (c)
 * 2014 CentralIt License:: General Public Licence
 * 
* @author Adenir Gomes (mailto:adenir.gomes@gmail.com)
 */
package br.com.centralit.nagios.livestatus.header;

import java.util.List;

/**
 * // // Create a new "Not" operator for the expression. // // Those
 * expressions must be of type Nagios::MkLiveStatus::Filter //
 */
public class LS_Header_Negate extends LS_Header {

    public LS_Header_Negate(LS_Header expr) {

        if (!(expr instanceof LS_Header_Filter)) {
            throw new ClassCastException("The operand for a NEGATE expression must be a filter expression.");
        }

        expression = expr;

        /*
         if not expr.is_a? Nagios::MkLiveStatus::Filter
         raise QueryException.new("The oper} for a NEGATE expression must be a filter expression.")
         }
    
         @expression = expr
         */
    }

    //
    // Return the expression under the "LS_Header_Negate". It's used by 
    // the to_s method in order to remove the overflow of LS_Header_Negate expression.  
    //
    public List<LS_Header> get_expressions() {
        return expressions;
    }

    //
    // Convert the current "LS_Header_Negate" expression into a nagios query string.
    //  Filter: ...
    //  LS_Header_Negate:
    //
    // If the sub expression is also a LS_Header_Negate, it returns the sub-sub expression without negating it.
    //
    public String to_s() {

        String str = "";

        if (expression instanceof LS_Header_Negate) {
            return expression.get_expression().to_s();
        }
        
        str += expression.to_s() + "\n";
        str += "Negate: \n";
        return str;

        /*
         if @expression.is_a? Nagios::MkLiveStatus::Filter::LS_Header_Negate
         return @expression.get_expression.to_s
         else
         negate_arr = []
         negate_arr.push @expression.to_s
         negate_arr.push "LS_Header_Negate: "
         return negate_arr.join("\n")
         }
         */
    }
}
