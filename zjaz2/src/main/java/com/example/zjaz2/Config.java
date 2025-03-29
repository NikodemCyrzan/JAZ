package com.example.zjaz2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "custom")
public class Config {
    public String loginUrl;
    public String environment;
    public Credentials credentials;

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
