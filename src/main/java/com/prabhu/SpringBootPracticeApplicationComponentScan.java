package com.prabhu;

import com.prabhu.components.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.prabhu.components")
public class SpringBootPracticeApplicationComponentScan {

    private static Logger logger = LoggerFactory.getLogger(SpringBootPracticeApplicationComponentScan.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SpringBootPracticeApplicationComponentScan.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        logger.info("{}", componentDAO);
    }

}
