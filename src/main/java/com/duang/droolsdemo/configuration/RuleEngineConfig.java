package com.duang.droolsdemo.configuration;

import org.drools.template.model.Rule;
import org.kie.api.KieServices;
import org.kie.api.internal.utils.KieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleEngineConfig {
    private static final Logger logger = LoggerFactory.getLogger(RuleEngineConfig.class);
    private static final String RULES_PATH="/droolsRule";   //规则文件路径
    private final KieServices kieServices = KieServices.Factory.get();

}
