package com.alcazar.spring.quickstart;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Lick that phat blonde pussy!";

    }

}
