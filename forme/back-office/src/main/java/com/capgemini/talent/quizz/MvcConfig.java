package com.capgemini.talent.quizz;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/manageSubjects").setViewName("manageSubjects");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/blank").setViewName("blank");
        registry.addViewController("/detailCandidat").setViewName("detailCandidat");
        registry.addViewController("/detailsTestCandidat").setViewName("detailsTestCandidat");
        registry.addViewController("/listeCandidats").setViewName("listeCandidats");


        
    }

}