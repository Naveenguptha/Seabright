package com.adobe.aem.guides.bright.core.models.impl;

import com.adobe.aem.guides.bright.core.models.SeabrightServiceDemo;
import com.adobe.aem.guides.bright.core.services.SebrightDemoService;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

import java.util.Iterator;

@Model(adaptables = SlingHttpServletRequest.class,
adapters = SeabrightServiceDemo.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SeabrightServiceDemoImpl  implements SeabrightServiceDemo {
    private static final Logger LOG= LoggerFactory.getLogger(SeabrightServiceDemoImpl.class);

    /*--------Start Tutorial #29--------*/
    @OSGiService
    SebrightDemoService SebrightdemoService;

    

    @Override
    public Iterator<Page> getPagesList(){
        return SebrightdemoService.getPages();
    }
    
    @PostConstruct
    protected void init() {
        
        
        
        
    }

    
}
