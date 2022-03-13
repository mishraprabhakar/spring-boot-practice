package com.prabhu.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComponentDAO {

    Logger logger = LoggerFactory.getLogger(ComponentJDBCConn.class);

    @Autowired
    ComponentJDBCConn componentJDBCConn;

    public ComponentJDBCConn getComponentJDBCConn() {
        return componentJDBCConn;
    }

    public void setComponentJDBCConn(ComponentJDBCConn componentJDBCConn) {
        this.componentJDBCConn = componentJDBCConn;
    }

    @Override
    public String toString() {
        return "ComponentDAO{" +
                "componentJDBCConn=" + componentJDBCConn +
                '}';
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDistroy(){
        logger.info("Pre Distroy");
    }
}
