package com.alcazar.spring.quickstart;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component("myTennisCoach")
public class TennisCoach implements Coach{

    /* instance vars */
    private String dwo;

    public TennisCoach(){
        dwo = "Hit the tennis ball 20 times.";
    }

    /**
     *
     * @return
     */
    @Override
    public String getDailyWorkout(){
        return dwo;

    }

}
