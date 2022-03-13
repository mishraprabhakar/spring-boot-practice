package com.prabhu.springbootpractice;

import com.prabhu.springbootpractice.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPracticeCDIApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootPracticeCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringBootPracticeCDIApplication.class, args);

        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
        logger.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

    }

}
