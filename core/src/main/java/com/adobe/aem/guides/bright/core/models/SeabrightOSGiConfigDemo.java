package com.adobe.aem.guides.bright.core.models;

import com.adobe.aem.guides.bright.core.services.OSGiFactoryConfig;

import java.util.List;

public interface SeabrightOSGiConfigDemo {
    /*--------Start Tutorial #31--------*/
    public String getServiceName();
    public int getServiceCount();
    public boolean isLiveData();
    public String[] getCountries() ;
    public String getRunModes();
    /*---------End Tutorial #31---------*/

    /*--------Start Tutorial #32--------*/
    public int getServiceId();
    public String getServiceNameModule() ;
    public String getServiceURL() ;
    /*---------End Tutorial #32---------*/

	
	  public List<OSGiFactoryConfig> getAllOSGiConfigs();
}
