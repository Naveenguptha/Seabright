package com.adobe.aem.guides.bright.core.models;

import java.util.List;
import java.util.Map;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

public interface AuthorBooks {	
	
    String getAuthorName();

    List<String> getAuthorBooks();

    List<Map<String,String>> getBookDetailsWithMap();

    List<MultifieldHelper> getBookDetailsWithBean();

    List<MultifieldHelper> getBookDetailsWithNastedMultifield();
}  