package com.prabhu.springbootpractice;

import com.prabhu.springbootpractice.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringBootPracticePropertiesApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootPracticePropertiesApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SpringBootPracticePropertiesApplication.class, args);

        SomeExternalService someExternalService =
                applicationContext.getBean(SomeExternalService.class);

        logger.info("{} method : {}",someExternalService, someExternalService.returnServiceUrl());
    }

}
