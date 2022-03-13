package com.prabhu.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

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
}
