package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // Below is custom Bean name
    // @Bean("aquatic")

    //below is Configuration of Spring Bean using Bean annotation
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
