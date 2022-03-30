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
        dwo = "Hit all those hot asses!";
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
