package com.adobe.aem.guides.bright.core.services;

public interface SeabrightOSGiConfig {
    public String getServiceName();
    public int getServiceCount();
    public boolean isLiveData();
    public String[] getCountries() ;
    public String getRunModes();
}
