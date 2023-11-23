package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //injections for dependency: constructor injection for dependency
    //private Coach myCoach;
    /*@Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    } */

    // setter injection for dependency
    // instead of setCoach function name we can use any function
    /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    } */


    //Qualifier - specifies which component to be used if multiple beans are there. - can be used for multiple possible sites
    // In this case crikcetCoach will be used
    //private Coach myCoach;
    /* @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    } */

    //scope of beans
    //private Coach myCoach;
    //private Coach anotherCoach;
    //Default is singleton which means only one instance is created.
    // When required multiple times then the single instance is used
    /* @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach=theAnotherCoach;
    }

    //checking the singleton scope below
    @GetMapping("/check")
    public String check() {
        return "Compairing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }*/

    //scope of beans
    //private Coach myCoach;
    //private Coach anotherCoach;
    //prototype scope of bean: In cricketcoach file the scope of bean is prototype
    /* @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach=theAnotherCoach;
    }

    //checking the Prototype scope below
    @GetMapping("/check")
    public String check() {
        return "Compairing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
    */


    /* Using Config and Bean */
    // I have created a config directory and in that I have created SportConfig class.
    // In SportConfig class I have used Configuration and Bean annotations to create Spring Bean of swimclass
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    // Below code has aquatic as custom name of Spring Bean which is created in SportConfig and can be used here
    /* @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    } */

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
