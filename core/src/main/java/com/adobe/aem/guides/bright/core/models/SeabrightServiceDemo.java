package com.adobe.aem.guides.bright.core.models;

import com.day.cq.wcm.api.Page;

import java.util.Iterator;
import java.util.List;

public interface SeabrightServiceDemo {
    public Iterator<Page> getPagesList();
    public List<String> getPageTitleList();
}
 	