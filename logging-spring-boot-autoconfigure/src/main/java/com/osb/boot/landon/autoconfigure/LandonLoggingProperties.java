package com.osb.boot.landon.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("landon.logging")
public class LandonLoggingProperties {
    private String loggerName = "LandonAuditLogger";

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }
}
