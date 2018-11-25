package com.example.practice;

import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class PracticeApplication {

    private static Logger LOG = LoggerFactory.getLogger(PracticeApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);

        LOG.info("name : " + ctx.getApplicationName());
        LOG.info("disp name : " + ctx.getDisplayName());
        LOG.info("id : " + ctx.getId());
        LOG.info("parent : " + ctx.getParent());


        System.out.println("name : " +ctx.getApplicationName());
        System.out.println("display name " + ctx.getDisplayName());
        System.out.println("id: " + ctx.getId());
        System.out.println("parent " + ctx.getParent());
        System.out.println("");

        /*Arrays.stream(ctx.getBeanDefinitionNames())
                .forEach(b -> System.out.println("Bean : "+ b));
*/


    }
}
