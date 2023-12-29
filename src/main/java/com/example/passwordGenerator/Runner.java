package com.example.passwordGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private PasswordGenerator generator;

   @Autowired
    public Runner(PasswordGenerator generator){
        this.generator = generator;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Short password: " + generator.generate(5));
        System.out.println("Short password: " + generator.generate(10));
    }
}
