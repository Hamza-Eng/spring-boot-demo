package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner start(){
        return args -> {
            List<Integer> list= Arrays.asList(1,5,4,8,7,8,7);
            List<Integer> ll=list.stream().filter(nbr -> nbr>5).collect(Collectors.toList());

            System.out.println(ll);
        };
    }*/


}
