package com.banana.textgame;

import java.util.Scanner;

public class Main {

    /*
     * Главный метод. Есть главнейший метод/
     */
    public static void main(String[] args) {
        // вызывает метод start()
        new Main().start();
    }

    /*
     * Метод с логикой игры.
     */
    private void start() {
        onStart();
        for (int i = 1; i <= 5; ++i) {
            onNewDay(i);
        }
        onFinish();
    }

    /*
     * Метод вызывается один раз при старте игры.
     */
    void onStart() {
        Scanner keyboard = new Scanner(System.in);
        int a = 42, b = 27;
        String строка = "Ответ на самый главный вопрос:Сила в ньютонах брат";
        System.out.println("Здраствуй, как тебя зовут?");
        String answer = keyboard.nextLine();
        System.out.println("Здраствуй " + answer);
    }

    int dollars = 0;

    /*
     * Каждую игровую ночь ничего не происходит!
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        Scanner keyboard = new Scanner(System.in);
        int a = 42, b = 27;
        String строка = "Ответ на самый главный вопрос:Сила в ньютонах брат";
        System.out.println("Здраствуй, как тебя зовут?");
        String код = keyboard.nextLine();
        System.out.println("Здраствуй " + код);
        dollars = dollars + код.length();

        System.out.println("Твоя наличка: " + dollars);

    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {

    }

}
