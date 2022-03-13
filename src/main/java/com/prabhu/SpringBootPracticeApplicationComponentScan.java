package com.prabhu;

import com.prabhu.components.ComponentDAO;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@SpringBootApplication
@ComponentScan("com.prabhu.components")
public class SpringBootPracticeApplicationComponentScan {


    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SpringBootPracticeApplicationComponentScan.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        System.out.println(componentDAO);
    }

}
