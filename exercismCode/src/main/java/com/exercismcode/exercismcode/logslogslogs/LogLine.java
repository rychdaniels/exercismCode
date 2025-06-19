package com.exercismcode.exercismcode.logslogslogs;

public class LogLine {
    String logLine;
    String shortLogLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String log = logLine.substring(1, 4).toUpperCase();
        switch (log) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;

        }
    }

    public String getOutputForShortLog() {
        shortLogLine = logLine.split(":")[1].replaceFirst(" ", "");
        return getLogLevel().getLogLevel() + ":" + shortLogLine;
    }
}
