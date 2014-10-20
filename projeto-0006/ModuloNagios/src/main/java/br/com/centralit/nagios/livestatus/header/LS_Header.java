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
public class LS_Header {

    protected List<LS_Header> expressions;
    protected LS_Header expression;

    public LS_Header(){
        expressions = new ArrayList<>();
    }
    public List<LS_Header> get_expressions() {
        return expressions;
    }
    
    public LS_Header get_expression() {
        return expression;
    }
    
    public String to_String() {
        String resp = "";
        
        for (LS_Header exp : expressions){
            resp += exp.to_s();            
        }
            
        return resp;
    }
    
    public String to_s() {
        return "";
    }
    
    public void addExpression(LS_Header expression){
        expressions.add(expression);
    }

}
