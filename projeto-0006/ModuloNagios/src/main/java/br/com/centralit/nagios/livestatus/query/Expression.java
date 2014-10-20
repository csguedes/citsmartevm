package br.com.centralit.nagios.livestatus.query;

enum enum_expr {

    filter, stats, and, or, negate, stats_and, stats_or, stats_negate, sum, min, max, avg, std, suminv, avginv
};

public class Expression {

    public enum_expr expression_type = enum_expr.filter;
    public String expression = "filter";

    public Expression(String expr, enum_expr type) {
        expression = expr;
        expression_type = type;
    }

    public Expression(int expr, enum_expr type) {
        if (expr > 0) {
            expression = String.format("%d", expr);
            expression_type = type;
        }
    }
}
