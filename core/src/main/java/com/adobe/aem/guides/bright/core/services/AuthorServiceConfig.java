package com.adobe.aem.guides.bright.core.services;


//dont edit this file... this file is use for Author Registration form
import java.util.List;

public interface AuthorServiceConfig {
    public String getCountryCode();
    public String getJsonName();
    public String getJsonPath();
    public String getNodeName();
    public String getNodePath();
    public AuthorServiceConfig getCountryConfig(String countryCode);
    public List<AuthorServiceConfig> getAllConfigs();
}
