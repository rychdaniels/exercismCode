package com.exercismcode.exercismcode.loglevels;

public class LogLevels {

    public static String message(String logLine) {
        // LogLevels.message("[ERROR]: Invalid operation")
        // => "Invalid operation"
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        // LogLevels.logLevel("[ERROR]: Invalid operation")
        // => "error"
        return logLine.split("]")[0].replace("[", "").toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        //LogLevels.reformat("[INFO]: Operation completed")
        // => "Operation completed (info)"
        return message(logLine).concat(" ").concat("(").concat(logLevel(logLine)).concat(")");
    }
}
