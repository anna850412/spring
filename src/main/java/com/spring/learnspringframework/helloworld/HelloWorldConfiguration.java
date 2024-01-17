package com.spring.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record eliminate public accessor, methods, constructor, equals, hashcode, toString while creating java bean
record Person (String name, int age, Address address){};
record Address (String street, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Anna";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Main Street", "Chicago"));

    }
    @Bean(name = "person2")
    @Primary
    public Person person2MethodCall(){
        return new Person(name(),age(), address());

    }
    @Bean(name ="person3")
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean(name ="person4")
    public Person person4qualifier(String name, int age, @Qualifier("address3qualifier") Address address3){
        return new Person(name, age, address3);
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("Baker Street", "London");
    }
    @Bean
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Gladka Street", "Lodz");
    }
}
