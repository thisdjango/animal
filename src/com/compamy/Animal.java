package com.compamy;

public class Animal {

    private String name;
    private int health;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int health, int age) {
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive(){
        boolean alive = true;
        if(health < 1) {
            alive = false;
        }
        return alive;
    }

    public void death(){
        this.health = 0;
    }

    public void changeHealth(int delta){
        setHealth(getHealth() + delta);
    }

}
