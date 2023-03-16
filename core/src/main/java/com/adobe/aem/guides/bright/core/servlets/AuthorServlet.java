package com.adobe.aem.guides.bright.core.servlets;


//dont edit this file... this file is use for Author Registration form
import com.day.cq.commons.jcr.JcrConstants;
import com.adobe.aem.guides.bright.core.constants.Constants;
import com.adobe.aem.guides.bright.core.services.AuthorService;
import com.adobe.aem.guides.bright.core.utils.ServiceUtil;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Component(service = Servlet.class)
@SlingServletResourceTypes(
        methods = {HttpConstants.METHOD_POST},
        resourceTypes = Constants.ADDAUTHOR_RESOURCE_TYPE,
        selectors = {Constants.ADDAUTHOR_SELECTORS},
        extensions = {Constants.ADDAUTHOR_EXTENSION}
)
public class AuthorServlet extends SlingAllMethodsServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LoggerFactory.getLogger(AuthorServlet.class);

    @Reference
    AuthorService authorService;

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        try {
            String resp=authorService.createAuthorNode(ServiceUtil.getCountry(request),request);
            response.getWriter().write(resp);
        }
        catch (Exception e){
            LOG.info("\n ERROR IN REQUEST {} ",e.getMessage());
        }
    }

}



