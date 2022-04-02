package com.alcazar.spring.quickstart;

import org.slf4j.*;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    // private fields
    private static final Logger LOGGER = LoggerFactory.getLogger(RandomFortuneService.class);
    private Random rand = new Random();
    private String[] fortunes = new String[3];

    public RandomFortuneService(){
        fortunes[0] = "Hit that blonde shit and feel good.";
        fortunes[1] = "Eat that blonde pussy and be full.";
        fortunes[2] = "Go home and cry.";
    }

    @Override
    public String getFortune(){
        int index = rand.nextInt(fortunes.length);
        return fortunes[index];
    }




}
