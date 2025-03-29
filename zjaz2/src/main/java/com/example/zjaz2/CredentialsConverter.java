package com.example.zjaz2;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class CredentialsConverter implements Converter<String, Credentials> {

    @Override
    public Credentials convert(String from) {
        String[] data = from.split(",");
        return new Credentials(data[0], data[1]);
    }
}
