package com.adobe.aem.guides.bright.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Seabrightt - Scheduler Config for CronJob", description = "Sling scheduler configuration for CronJob")
public @interface SchedulerConfigurationForCronJob {

    @AttributeDefinition(name = "Scheduler name", description = "Name of the scheduler", type = AttributeType.STRING)
    public String schedulerName() default "Custom Sling Scheduler Configuration For CronJob";

    @AttributeDefinition(name = "Cron Expression", description = "Cron expression used by the scheduler", type = AttributeType.STRING)
    public String cronExpression() default "0/20 * * * * ?"; // runs every 10 seconds
}
