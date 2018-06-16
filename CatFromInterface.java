package com.company;

public class CatFromInterface implements AnimalInterface {
    private String name;
    private String type;
    protected String color;
    private double age;

    public CatFromInterface(String type, String name, String color, double age){
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public CatFromInterface(String name){
        this.name = name;
        color = "Не задан";
        age = 0;
    }

    @Override
    public void voice() {
        System.out.println("Кот " + name +  " мяукнул!");
    }

    public CatFromInterface(){
        name = "Не задан";
        color = "Не задан";
        age = 0;
    }

    @Override
    public String toString() {
        return "Животное: " + type + "\n"
                + "Имя: " + name
                + "\nЦвет: " + color
                + "\nВозраст: " + age + " лет";
    }

    public double getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
