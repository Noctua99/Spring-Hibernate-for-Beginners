package com.luv2code.practice.activity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

    @Bean
    public FortuneService madFortuneService() {
        return new MadFortuneService();
    }

    @Bean
    public Coach soccerCoach(){
        return new SoccerCoach(madFortuneService());
    }
}
