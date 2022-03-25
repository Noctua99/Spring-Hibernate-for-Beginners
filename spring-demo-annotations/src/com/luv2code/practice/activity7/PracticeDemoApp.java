package com.luv2code.practice.activity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeConfig.class);

        Coach theCoach = context.getBean("soccerCoach", SoccerCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
