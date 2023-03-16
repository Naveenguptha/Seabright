package com.adobe.aem.guides.bright.core.services;


//dont edit this file... this file is use for Author Registration form
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import java.util.List;
import java.util.Map;

public interface AuthorService {

    public String createAuthorNode(String country, SlingHttpServletRequest request);
    public List<Map<String, String>> getAuthors (final String country);


}
