package com.example.practice.domain;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public String name() {
        return "pussy cat";
    }
}
