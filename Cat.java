package com.company;

public class Cat extends Animal{
    private String name;
    protected String color;
    private double age;

    public Cat(String type, String name, String color, double age){
        super(type);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
        color = "Не задан";
        age = 0;
    }

    @Override
    public void voice() {
        System.out.println("Кот " + name +  " мяукнул!");
    }

    public Cat(){
        name = "Не задан";
        color = "Не задан";
        age = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
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
