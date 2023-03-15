package com.adobe.aem.guides.bright.core.utils;

import java.util.HashMap;
import java.util.Map;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;

public class ResolverUtil {



    public  final static String SEABRIGHT__USER ="seabrighttestuser";
    /**
     * @param  resourceResolverFactory factory
     * @return new resource resolver for Sony service user 
     * @throws LoginException if problems
     */
    public static ResourceResolver newResolver( ResourceResolverFactory resourceResolverFactory ) throws LoginException {
        final Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put( ResourceResolverFactory.SUBSERVICE,SEABRIGHT__USER);

        // fetches the admin service resolver using service user.
        ResourceResolver resolver = resourceResolverFactory.getServiceResourceResolver(paramMap);
        
        return resolver;
    }
}
