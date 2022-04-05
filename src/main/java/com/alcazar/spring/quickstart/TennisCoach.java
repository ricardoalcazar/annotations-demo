package com.alcazar.spring.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
@Scope("singleton")
public class TennisCoach extends AbstractCoach{

    Logger logger = LoggerFactory.getLogger(TennisCoach.class);

    /* instance vars */
    private String dwo;

    public TennisCoach(){
        dwo = "Hit the tennis ball 20 times.";
        logger.debug("Default constructor");
    }

    @Override
    public String getDailyWorkout(){
        return dwo;
    }

    @Override
    public String getDailyFortune(){
        return getFortuneService().getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    @Override
    public void setFortuneService(FortuneService fs){
        super.setFortuneService(fs);
        logger.debug("setFortuneService()");

    }

    /**
     *
     */
    @PostConstruct
    public void onInit(){
        logger.debug("Execute onInit()");
    }

    /**
     *
     */
    @PreDestroy
    public void onDestroy(){
        logger.debug("Execute onDestroy()");
    }


}
