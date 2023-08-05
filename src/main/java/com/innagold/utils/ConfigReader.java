package com.innagold.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties properties;
    public ConfigReader(){
         properties = new Properties();
    }
    
    public String getProperty(String key){
        String value = null;
        try {
            FileInputStream configFile = new FileInputStream("config.properties");
            properties.load(configFile);
            configFile.close();
            value = properties.getProperty(key);
        } catch (IOException e) {
            System.err.println("Error reading configuration: " + e.getMessage());
        }
        return value;
    }
}
