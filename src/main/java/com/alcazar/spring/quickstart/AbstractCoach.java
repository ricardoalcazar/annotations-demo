package com.alcazar.spring.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class AbstractCoach implements Coach{

    public FortuneService fs;

    public void setFortuneService(FortuneService fs){
        this.fs = fs;
    }

    public FortuneService getFortuneService(){
        return fs;
    }

}
