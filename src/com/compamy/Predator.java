package com.compamy;

public class Predator extends Animal{

    private int minPreysToLive;

    public Predator(String name, int health, int age, int m) {
        super(name, health, age);
        this.minPreysToLive = m;
    }

    public void hunting(Prey some){
        changeHealth(40);
        some.death();
    }

    public void getHurt(){
        changeHealth(-40);
    }


}
