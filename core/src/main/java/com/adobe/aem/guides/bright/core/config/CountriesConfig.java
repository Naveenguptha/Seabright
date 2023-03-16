package com.adobe.aem.guides.bright.core.config;


//dont edit this file... this file is use for Author Registration form
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="bright - Countries JSON configuration",
        description = "Countries JSON Factory configuration.")
public @interface CountriesConfig {
    @AttributeDefinition(
            name = "Country Code",
            description = "Add Country code.",
            type = AttributeType.STRING
    )
    public String countryCode() default "us";

    @AttributeDefinition(
            name = "JSON Name",
            description = "Name for JSON File.",
            type = AttributeType.STRING
    )
    public String jsonName() default "us-authors.json";

    @AttributeDefinition(
            name = "JSON Path",
            description = "Path for JSON File.",
            type = AttributeType.STRING
    )
    public String jsonPath() default "/content/bright/us/en/article-page";

    @AttributeDefinition(
            name = "Authors Node Name",
            description = "Parent node name for authors.",
            type = AttributeType.STRING
    )
    public String authorsNode() default "us-authors";

    @AttributeDefinition(
            name = "Authors Node Path",
            description = "Path for Parent author node.",
            type = AttributeType.STRING
    )
    public String authorsPath() default "/content/bright/us/en/article-page";
}