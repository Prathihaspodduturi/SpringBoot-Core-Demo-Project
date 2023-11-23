package com.luv2code.springcoredemo.common;

import com.luv2code.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
//Below line is annotation for multiple instances scope of beans using PROTOTYPE_SCOPE
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    /* constructor */
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /* bean lifeCycle methods */

    //define our init method
    /*@PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMystartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15minutes";
    }
}
