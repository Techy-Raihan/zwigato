package com.zwigato.zwigato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
		SpringApplication.run(ZwigatoApplication.class, args);
		System.out.println("Starting.....");
	}
    
}
