package com.spring.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args){
//1: Launch a Spring context
       try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
//2: Configure the things that we want Spring to manage by creating HelloWorldConfiguration with @Configuration
// create method name with @Bean

//3: Retrieving Beans managed by Spring
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean("age"));
           System.out.println(context.getBean("person"));
           System.out.println(context.getBean("person2"));
           System.out.println(context.getBean("person3"));
           System.out.println(context.getBean("person4"));
           System.out.println(context.getBean("address2"));
           System.out.println(context.getBean(HelloWorldConfiguration.class));
           Arrays.stream(context.getBeanDefinitionNames())
                   .forEach(System.out::println);
       }
    }
}
