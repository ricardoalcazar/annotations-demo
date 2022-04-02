package com.alcazar.spring.quickstart;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

    public DatabaseFortuneService(){

    }

    @Override
    public String getFortune(){
        return "";
    }



}
