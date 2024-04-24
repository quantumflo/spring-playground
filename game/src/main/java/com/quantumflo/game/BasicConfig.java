package com.quantumflo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address ) {}
record Address(String addr) {}
@Configuration
public class BasicConfig {
    @Bean(name = "name2")
    public String name() {
        return "Shashank";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Address home() {
        return new Address("avenues pune");
    }

    @Bean
    @Qualifier("office")
    public Address office() {
        return new Address("highstreet");
    }

    @Bean
    @Primary
    public Person person() {
        return new Person("Shasha", 26, home());
    }

    @Bean
    public Person person2( String name2, int age, @Qualifier("office") Address address ) {
        return new Person(name2, age, address);
    }
}
