package com.adobe.aem.guides.bright.core.services;


//dont edit this file... this file is use for Author Registration form
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

public interface UtilService {
    public String getActionURL(Resource resource) throws LoginException;
    public boolean isPublish();
    public boolean isAuthor();
}
