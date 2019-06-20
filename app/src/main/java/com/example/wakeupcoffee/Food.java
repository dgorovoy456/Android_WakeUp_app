package com.example.wakeupcoffee;


public class Food {

    private String name;
    private String description;

    Food [] food =  {
            new Food("Hrumburger", "Toast, peace of cheese, little special souse, peace of meet, slise tomato " ),
            new Food("Zri che dali", "It's a big secret")
    };

    public Food(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}


