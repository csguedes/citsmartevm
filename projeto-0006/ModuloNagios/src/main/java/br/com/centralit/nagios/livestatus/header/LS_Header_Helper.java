/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralit.nagios.livestatus.header;

/**
 *
 * @author adenir
 */
public class LS_Header_Helper {

    // The  comparators which can be used by stats, wait and filter.
    // equal filter or empty list : =
    public final static String EQUAL = "=";

    // regular expression like /<expr>/ : ~
    public final static String SUBSTR = "~";

    // equal ignore case : =~
    public final static String EQUAL_IGNCASE = "=~";

    // regular expression ignoring case : ~~
    public final static String SUBSTR_IGNCASE = "~~";

    // less than in alphabetical order : <
    public final static String LESSER = "<";

    // greater than in alphabetical order : >
    public final static String GREATER = ">";

    // less or equal to in alphabetical order : <=  
    public final static String LESSER_EQUAL = "<=";

    // less or equal to in alphabetical order or list contains : >=
    public final static String GREATER_EQUAL = ">=";

    // not equals to : !=
    public final static String NOT_EQUAL = "!=";

    // not matching substring : !~
    public final static String NOT_SUBSTR = "!~";

    // not equals to ignoring case : !=~
    public final static String NOT_EQUAL_IGNCASE = "!=~";

    // not matching substring ignoring case : !~~
    public final static String NOT_SUBSTR_IGNCASE = "!~~";

    /**
     * This module contains all the comparators which can be used by stats, wait
     * and filter. It provides a method that helps you to get a list of all
     * operators
     */
    public static String[] allComparator = new String[]{EQUAL, SUBSTR,
        EQUAL_IGNCASE, SUBSTR_IGNCASE, LESSER, GREATER,
        LESSER_EQUAL, GREATER_EQUAL, NOT_EQUAL, NOT_SUBSTR,
        NOT_EQUAL_IGNCASE, NOT_SUBSTR_IGNCASE};

    public static boolean hasComparator(String sig) {
        for (String s : allComparator) {
            if (s.equals(sig)) {
                return true;
            }
        }
        return false;
    }

    // The deviations which can be used by stats.  
    // sum deviation
    public final static String SUM = "sum";

    // suminv deviation
    public final static String SUMINV = "suminv";

    // min deviation
    public final static String MIN = "min";

    // max deviation
    public final static String MAX = "max";

    // avg deviation
    public final static String AVG = "avg";

    // avginv deviation
    public final static String AVGINV = "avginv";

    // std deviation
    public final static String STD = "std";

    /**
     * This contains all the deviations which can be used by stats. It provides
     * a method that helps you to get a list of all operators.
     */
    public static String[] allDeviation = new String[]{SUM, SUMINV, MIN, MAX, AVG, AVGINV, STD};

    public static boolean hasDeviation(String sig) {
        for (String s : allDeviation) {
            if (s.equals(sig)) {
                return true;
            }
        }
        return false;
    }

    // The trigger which can be used by wait.
    // a service or host check has been executed
    public final static String CHECK = "check";

    // the state of a host or service has changed
    public final static String STATE = "state";

    // a new message has been logged into nagios.log
    public final static String LOG = "log";

    // a downtime has been set or removed
    public final static String DOWNTIME = "downtime";

    // a comment has been set or removed
    public final static String COMMENT = "comment";

    // an external command has been executed
    public final static String COMMAND = "command";

    // any of the upper events happen (this is the publicault)
    public final static String ALL = "all";

    /**
     * This contains all the trigger which can be used by wait. It provides a
     * method that helps you to get a list of all triggers.
     */
    public static String[] allTrigger = new String[]{CHECK, STATE, LOG, DOWNTIME, COMMENT, COMMAND, ALL};

    public static boolean hasTrigger(String sig) {
        for (String s : allTrigger) {
            if (s.equals(sig)) {
                return true;
            }
        }
        return false;
    }

}
