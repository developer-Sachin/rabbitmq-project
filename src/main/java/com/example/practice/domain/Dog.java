package com.example.practice.domain;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String name() {
        return "Andy-dog";
    }
}
