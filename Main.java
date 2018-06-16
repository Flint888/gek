package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Примеры из урока
        Cat cat1 = new Cat("Кошка","Шельма", "Мраморный", 0.3);
        CatFromInterface cat2 = new CatFromInterface("Кошка","Кейси", "Трехшерстный", 5);
        Cat cat3 = new Cat("Барсик");
        Cat cat4 = new Cat();

        System.out.println(cat1.toString() + "\n");
        System.out.println(cat2.toString() + "\n");
        System.out.println(cat3.toString() + "\n");
        System.out.println(cat4.toString() + "\n");

        cat1.voice();
        cat2.voice();

        //Домашнее задание
        //Создадим комманду

        System.out.println("\nДомашнее задание.\n");
        Team myTeam = new Team("Сборная СССР",
                            "Ленин", "Сталин", "Горбачев", "Ельцин");
        System.out.println(myTeam.TeamInfo() + "\n");

        //Обьявим и инициализируем массив препятсвий
        //можно добавить сколько угодно позиций
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Стометровка");
        courses.add("Подтянуться 10 раз");
        courses.add("Отжаться от пола 30 раз");
        courses.add("Три километра");
        courses.add("Сто метров с препятствиями");

        //Создадим экземпляр класса Препятствия
        Course course = new Course(courses, myTeam);

        //Запустим метод, прогоняющий комманду через препятствия
        course.doIt();

        //Выведем общие результаты соревнований
        myTeam.showResult();

        //Выведем победителей соревнований
        System.out.println("\nПобедители соревнований:\n");
        if (myTeam.showWinners() == 0) {
            System.out.println("В соревнованиях ни кто ни победил!");
        }

    }
}
