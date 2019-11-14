package com.compamy;

public class Prey extends Animal {

    private int minGrassToLive;

    public Prey(String name, int health, int age, int m) {
        super(name, health, age);
        this.minGrassToLive = m;
    }

    public void eat(){
        changeHealth(10);
    }

    public void getHurt(){
        changeHealth(-10);
    }
}
