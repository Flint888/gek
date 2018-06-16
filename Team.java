package com.company;

import java.util.ArrayList;

/*Класс Team - комманда

    Свойства:

        teamName: Название комманды
        participant: Члены комманды
        result: Таблица результатов - количество строк равно числу членов комманды
                  В столбцах результаты
        obstacle: Массив препятсвий

    Методы:

        Team: конструктор, на вход принимает название комманды, и фамилии 4х участников
        getPartCnt: возвращает число участников комманды
        setObstacle: инициализирует массив с препятсвиями
        initResults: инициализирует размер таблицы результатов. На входе кол-во препятсвий
        insertResult: вставляет результат преодоления препятствия для участника part препятсвия course
        showResult: выводит результаты соревнований в виде таблицы
        showWinners: определяет и выводит на экран победителей соревнований (тех, кто преодолел все препятсвия)
        showInfo: возвращает строку с информацией обо всех участниках комманды
*/

public class Team {

    private String teamName;
    private ArrayList<String> participant = new ArrayList<String>();
    private String[][] results;
    private ArrayList<String> obstacle;

    public Team(String teamName,
                    String part1,
                    String part2,
                    String part3,
                    String part4){

        this.teamName = teamName;

        //Добавляем членов комманды в массив
        participant.add(part1);
        participant.add(part2);
        participant.add(part3);
        participant.add(part4);

    }

    public int getPartCnt(){
        return participant.size();
    }

    public void setObstacle(ArrayList<String> obstacle) {
        this.obstacle = obstacle;
    }

    //Метод инициализации таблицы результатов
    public void initResults(int countOfCourse){
        results = new String[countOfCourse][participant.size()];
    }

    //Метод ВставитьРезультат
    public void insertResult(int part, int course, String result){
        results[course][part] = result;
    }

    //Метод выводит результаты соревнований в виде таблицы
    public void showResult(){
        System.out.println("Результаты соревнований\n");
        System.out.printf("%-30s%-20s%-20s%-20s%-20s\n\n", "Препятствие\\Участник"
                                                , participant.get(0)
                                                , participant.get(1)
                                                , participant.get(2)
                                                , participant.get(3));

        for (int i = 0; i < obstacle.size(); i++) {
            System.out.printf("%-30s", obstacle.get(i));
            for (int j = 0; j < participant.size(); j++) {
                System.out.printf("%-20s", results[i][j]);
            }
            System.out.println("");
        }

    }

    //Метод определяет и выводит на экран победителей соревнований (тех, кто преодолел все препятсвия)
    //также метод возвращает число победителей
    public int showWinners(){
        int result = 0;
        for (int i = 0; i < participant.size(); i++) {
            boolean winner = true;
            for (int j = 0; j < obstacle.size(); j++) {
                if (results[j][i].compareTo("Не преодолел") == 0){
                    winner = false;
                }
            }
            if (winner) {
                System.out.println("Преодолел все препятствия: " + participant.get(i));
                result++;
            }
        }
        return result;
    }

    //Конструктор по умолчанию
    public Team(){};

    //Метод возвращает строку с информацией обо всех участниках комманды
    public String TeamInfo(){
        return "Комманда: " + teamName +
                "\nУчастники: " + participant.get(0) + "; "
                + participant.get(1) + "; "
                + participant.get(2) + "; "
                + participant.get(3) + ";";

    }
}
