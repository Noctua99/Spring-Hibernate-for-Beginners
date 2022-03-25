package com.luv2code.practice.activity7;

import org.springframework.stereotype.Component;

public class SoccerCoach implements Coach{

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Soccer Coach: getDailyWorkout()";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
