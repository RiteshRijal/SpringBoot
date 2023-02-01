package com.confuguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {};
record Address(String City,int wardno) {};
@Configuration
public class SpringConfiguration {
    @Bean
    public String name() {
        return "Ritesh";
    }
    @Bean
    public String name3() {
        return "Ramesh";
    }
    @Bean
    public int age3(){
        return 25;
    }
        @Bean
        public int age(){
        return 24;
        }
        @Bean
        public Person person() {
            return new Person("Ravi", 14, new Address("Hetauda",8));
        }
        @Bean //for methodcall
    public Person person2() {
        return new Person(name(), age(),address2());
    }
    @Bean //by parameter
    Person person3(String name3, int age3,Address address3) {
        return new Person(name3, age3,address3);
    }
        @Bean (name="address1")
        public Address address2(){
            return new Address("Kathmandu",32);
            }

            @Bean (name="address3")
            public Address address3(){
                return new Address("Chitwan",7);
            }

    }

