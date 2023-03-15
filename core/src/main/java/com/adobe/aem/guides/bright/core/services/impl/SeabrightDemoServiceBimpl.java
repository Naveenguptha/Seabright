package com.adobe.aem.guides.bright.core.services.impl;





import  com.adobe.aem.guides.bright.core.services.SebrightDemoService;
import com.adobe.aem.guides.bright.core.services.SeabrightDemoServiceB;
import com.adobe.aem.guides.bright.core.utils.ResolverUtil;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(service = SeabrightDemoServiceB.class,immediate = true)
public class SeabrightDemoServiceBimpl implements SeabrightDemoServiceB {
    private static final Logger LOG= LoggerFactory.getLogger(SeabrightDemoServiceBimpl.class);

// hear am getting pages list without help of Service User

    @Reference
    SebrightDemoService SeabrightdemoService;

    @Override
    public List<String> getPages(){
        List<String> listPages = new ArrayList<String>();

        try {
            Iterator<Page> pages=SeabrightdemoService.getPages();
            while (pages.hasNext()) {
                listPages.add(pages.next().getTitle());
            }
            return listPages;
        } catch (Exception e) {
            LOG.info("\n  Exception {} ",e.getMessage());
        }
        return null;
    }
}

