package com.practice;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
}


// Strategy Pattern
// State Pattern
// Decorator pattern
// Observer Pattern

//Facade pattern - learn
//Repository pattern - learn
//Factory pattern - learn
//Builder pattern - learn
