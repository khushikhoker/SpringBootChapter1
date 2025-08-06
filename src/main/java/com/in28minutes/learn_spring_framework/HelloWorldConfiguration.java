package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.naming.Name;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Khushi";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    @Primary
    public Person person() {
        return new Person("Ram", 27,  new Address("Lane 2 Mandakini Vihar", "xyzCity"));
    }

    @Bean
    public Person person2Methodcall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Lane 2 Mandakini Vihar", "xyzCity");
    }

    @Bean
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Labcd dkdhf", "abc city");
    }
}
