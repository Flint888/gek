package com.company;

import java.util.ArrayList;
import java.util.Random;

/*
    Класс Course

        Свойства:

            obstacle: массив препятствий
            team: комманда

        Методы:

            Course: конструктор. На входе получает массив препятсвий и объект Комманда
            doIt: соревнования. Во вложенном цикле для каждого участника комманды случайным образом определяется
                                результат прохождения каждого препятствия. Результаты заносятся в массив результатов
                                комманды team


 */

public class Course {

    private ArrayList<String> obstacle; //Массив препятствий
    private Team team;


    public Course(ArrayList<String> obstacle, Team team){
        this.obstacle = new ArrayList<String>(obstacle);
        this.team = new Team();
        this.team = team;
        team.setObstacle(obstacle);
    }

    public void doIt(){

        Random random = new Random();
        team.initResults(obstacle.size());

        for (int i = 0; i < team.getPartCnt(); i++) {
            for (int j = 0; j < obstacle.size(); j++) {
                int r = random.nextInt(2);
                if (r == 1) {
                    team.insertResult(i, j, "Преодолел");
                }
                else {
                    team.insertResult(i, j, "Не преодолел");
                }
            }
        }

    }
}
