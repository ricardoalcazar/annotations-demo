package com.alcazar.spring.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach extends AbstractCoach{

    @Autowired
    @Qualifier("randomFortuneService")
    @Override
    public void setFortuneService(FortuneService fs){
        super.setFortuneService(fs);
    }

    @Override
    public String getDailyWorkout(){
        return "Perform 20 lay-ups.";
    }

    @Override
    public String getDailyFortune(){
        return fs.getFortune();

    }

}
