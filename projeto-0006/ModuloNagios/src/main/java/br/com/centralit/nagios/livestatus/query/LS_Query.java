/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.query;

import br.com.centralit.nagios.livestatus.actions.ParametersQueryNagios;
import br.com.centralit.nagios.util.JSONConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adenir
 */
public final class LS_Query {

  //  protected List<LS_Header> expressions;

    public boolean hasColumns = false;
    public boolean hasColumnHeaders = false;
    public boolean hasFilter = false;
    public boolean hasStats = false;

    public String command = null;
    public String before_wait = null;
    public String after_wait = null;
  //  public List<String> query;
    public List<String> columns = new ArrayList<>();
    public List<Expression> filters = new ArrayList<>();
    public List<Expression> stats = new ArrayList<>();


    public LS_Query(ParametersQueryNagios parametersIncoming){
        parseParametersIncoming(parametersIncoming.getTable(), 
                 parametersIncoming.getColumns(), 
                 parametersIncoming.getFilters(), 
                 parametersIncoming.getStats());
    }
    
    public void parseParametersIncoming(String pBase, String pColumns, String pFilters, String pStats) {
        if (pBase != null && !pBase.isEmpty()) {
            command = pBase;
        }

        for (String c : pColumns.split(" ")) {
            addColumn(c);
        }

        for (String f : pFilters.split(",")) {
            addFilters(f);
        }

        for (String f : pStats.split(",")) {
            addStats(f);
        }
    }

    public LS_Query(String pBase) {	// Add a sum: header to filters in the query for the GET object
        if (pBase != null && !pBase.isEmpty()) {
            command = pBase;
        }
    }

    // Add a field to columns in the query for the GET object
    public void addColumn(String Column_Name) {
        String[] pcols;
        if (!(Column_Name == null || Column_Name.isEmpty())) {
            hasColumns = true;
            pcols = Column_Name.split(" ");
            if (columns == null) {
                columns = new ArrayList<>();
            }

            boolean addAll = columns.addAll(Arrays.asList(pcols));
        }

    }

    // Add a field to filters in the query for the GET object
    public void addFilters(String pName) {
        String[] pfilters;
        if (!(pName == null || pName.isEmpty())) {
            if (filters == null) {
                filters = new ArrayList<>();
            }
            pfilters = pName.split(",");

            for (String f : pfilters) {
                filters.add(new Expression(f, enum_expr.filter));
            }
        }
    }

    // Add a field to stats in the query for the GET object
    public void addStats(String pName) {
        String[] pstats;
        if (!(pName == null || pName.isEmpty())) {
            if (stats == null) {
                stats = new ArrayList<>();
            }
            pstats = pName.split(",");

            for (String f : pstats) {
                stats.add(new Expression(f, enum_expr.stats));
            }
        }
    }

    // Add a And: header to filters in the query for the GET object
    public void addFilterAnd(int and_for_n_last_expression) {
        filters.add(new Expression(and_for_n_last_expression, enum_expr.and));
    }

    // Add a And: header to filters in the query for the GET object
    public void addFilterOr(int or_for_n_last_expression) {
        filters.add(new Expression(or_for_n_last_expression, enum_expr.or));
    }

    // Add a And: header to filters in the query for the GET object
    public void addFilterNegate() {
        filters.add(new Expression(1, enum_expr.negate));
    }

    // Add a And: header to filters in the query for the GET object
    public void addStatsAnd(int and_for_n_last_expression) {
        stats.add(new Expression(and_for_n_last_expression, enum_expr.and));
    }

    // Add a And: header to filters in the query for the GET object
    public void addStatsOr(int or_for_n_last_expression) {
        stats.add(new Expression(or_for_n_last_expression, enum_expr.or));
    }

//	filter, stats, and, or, negate, stats_and, stats_or, stats_negate, sum, min, max, avg, std, suminv, avginv
    // Add a And: header to filters in the query for the GET object
    public void addStatsNegate() {
        stats.add(new Expression(1, enum_expr.negate));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsSum(String expr) {
        stats.add(new Expression(expr, enum_expr.sum));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsMin(String expr) {
        stats.add(new Expression(expr, enum_expr.min));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsMax(String expr) {
        stats.add(new Expression(expr, enum_expr.max));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsAvg(String expr) {
        stats.add(new Expression(expr, enum_expr.avg));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsStd(String expr) {
        stats.add(new Expression(expr, enum_expr.std));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsSuminv(String expr) {
        stats.add(new Expression(expr, enum_expr.suminv));
    }

    // Add a sum: header to filters in the query for the GET object
    public void addStatsAvginv(String expr) {
        stats.add(new Expression(expr, enum_expr.avginv));
    }

    // get as signed int 32 - 4 byte ---------------------- int SIGNED
    public static int getAsInt(String column) throws NumberFormatException {

        try {
            return Integer.parseInt(column);
        } catch (NumberFormatException e) {
            return -1;
        }

    }

    public String to_json(){
        return JSONConverter.toJson(this);
    }
    
    public String to_s(Map<String, String> options) {
        String strQuery;

        if (command == null) {
            return "";
        }
        strQuery = "GET " + command + "\n";

        if (columns != null && columns.size() > 0) {
            strQuery += "Columns: ";
            for (String c : columns) {
                strQuery += c + " ";
            }
            strQuery += "\n";
        }

        // Add a And: header to filters in the query for the GET object
        if (filters != null && filters.size() > 0) {
            hasFilter = true;
            for (Expression f : filters) {
                switch (f.expression_type) {
                    case and:
                        strQuery += "And: " + f.expression + "\n";
                        break;
                    case or:
                        strQuery += "Or: " + f.expression + "\n";
                        break;
                    case negate:
                        strQuery += "Negate: " + "\n";
                        break;
                    case filter:
                        strQuery += "Filter: " + f.expression + "\n";
                        break;
                    default:
                        break;
                }
            }
        }

//	filter, stats, and, or, negate, stats_and, stats_or, stats_negate, sum, min, max, avg, std, suminv, avginv
        if (stats != null && stats.size() > 0) {
            hasStats = true;
            for (Expression f : stats) {
                switch (f.expression_type) {
                    case and:
                        strQuery += "StatsAnd: " + f.expression + "\n";
                        break;
                    case or:
                        strQuery += "StatsOr: " + f.expression + "\n";
                        break;
                    case negate:
                        strQuery += "StatsNegate: " + "\n";
                        break;
                    case sum:
                        strQuery += "Stats: sum " + f.expression + "\n";
                        break;
                    case min:
                        strQuery += "Stats: min " + f.expression + "\n";
                        break;
                    case max:
                        strQuery += "Stats: max " + f.expression + "\n";
                        break;
                    case avg:
                        strQuery += "Stats: avg " + f.expression + "\n";
                        break;
                    case std:
                        strQuery += "Stats: std " + f.expression + "\n";
                        break;
                    case suminv:
                        strQuery += "Stats: suminv " + f.expression + "\n";
                        break;
                    case avginv:
                        strQuery += "Stats: avginv " + f.expression + "\n";
                        break;
                    case stats:
                        strQuery += "Stats: " + f.expression + "\n";
                        break;
                    default:
                        break;
                }
            }
        }

        if (before_wait != null && before_wait.length() > 0) {
            // @before_wait.each do |wait|
            // query += wait.to_s+"\n"
            // }
        }

        if (after_wait != null && after_wait.length() > 0) {
            // @after_wait.each do |wait|
            // query += wait.to_s+"\n"
        }

        // //set column headers
        boolean column_headers = false;
        if (options.containsKey("columns_headers")
                && !options.get("column_headers").isEmpty()) {
            column_headers = true;
        }

        // set user
        String user = null;
        if (options.containsKey("user") && options.get("user").isEmpty()) {
            user = options.get("user");
        }

        // set limit
        int limit = -1;
        if (options.containsKey("limit") && getAsInt(options.get("limit")) > 0) {
            limit = getAsInt(options.get("limit"));
        }

        // set localtime
        int localtime = -1;
        if (options.containsKey("localtime")
                && getAsInt(options.get("localtime")) > 0) {
            localtime = getAsInt(options.get("localtime"));
        }

        // set separator
        String separator = LivestatusSeparator.getSeparators();
        if (options.containsKey("separator")
                && !options.get("separator").isEmpty()) {
            separator = options.get("separator");
        }

        // set output
        String output = "";
        if (options.containsKey("output")
                && !options.get("output").isEmpty()) {
            String s = options.get("output");
            if (s.equals("json") || s.equals("python")) {
                output = options.get("output");
            } else {
                throw new IllegalArgumentException(
                        "Output must be one of 'json' or'python'");
            }
        }

        // the }line must be empty
        if (!strQuery.endsWith("\n")) {
            strQuery += "\n";
        }

        // set user if needed
        if ((user != null)
                && (!user.isEmpty())
                && (strQuery
                .matches("/^GET\\s+(hosts|hostgroups|services|servicegroup|log)\\s*$/"))) {
            strQuery += "AuthUser: " + user + "\n";
        }

        if (localtime != -1) {
            strQuery += "LocalTime: " + localtime + "\n";
        }

        // set columns headers
        if (column_headers) {
            strQuery += "ColumnHeaders: on\n";
            hasColumnHeaders = true;
        } else {
            strQuery += "ColumnHeaders: on\n";
            hasColumnHeaders = false;
        }

        // set the limit
        if (limit > -1) {
            strQuery += "Limit: " + limit + "\n";
        }

        // set the output format
        if (!output.isEmpty()) {
            strQuery += "OutputFormat: " + output + "\n";
        }

        // set the output format
        if (!separator.isEmpty()) {
            strQuery += "Separators: " + separator + "\n";
        }

        // get error message if some are given
        // strQuery += "ResponseHeader: fixed16\n";
        // add wait to query but before filter predicats
        // System.out.println(strQuery);
        return strQuery;
    }
}
