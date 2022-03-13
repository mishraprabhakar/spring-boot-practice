package com.prabhu.springbootpractice.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

    @Inject
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
