package com.company;

public abstract class Animal {
    protected String type;

    public abstract void voice();

    public Animal(){
        this.type = "Не задан";
    }

    public Animal(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Животное: " + type;
    }

}
