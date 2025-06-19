package com.exercismcode.exercismcode.logslogslogs;

public enum LogLevel {

    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4) ,
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int logLevelShort;

    LogLevel(int logLevel) {
        this.logLevelShort = logLevel;
    }

    public int getLogLevel() {
        return this.logLevelShort;
    }
}

