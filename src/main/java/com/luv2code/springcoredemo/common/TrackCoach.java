package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
// Using Lazy the Component or Bean will be called only when needed

//@Primary
//Primary is used instead of qualifier when multiple beans or components are present of implementing a single class
// only this class is always is used as default if marked with primary - cannot be used if multiple classes should be used
// cannot have multiple primary components or beans

public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
