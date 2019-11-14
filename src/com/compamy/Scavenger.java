package com.compamy;

public class Scavenger extends Animal {

    private int minPredatorsToLive;
    private int eatenPredators;

    public Scavenger(String name, int health, int age, int minPredatorsToLive) {
        super(name, health, age);
        this.minPredatorsToLive = minPredatorsToLive;
    }

    public void eat(Predator some){
        changeHealth(36);
        some.death();
    }
}
