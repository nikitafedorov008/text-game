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
        System.out.println("День номер " + dayNumber);
        String dollarsString = "";
        for (int i = 0; i < dollars; i += 1) {
            dollarsString = dollarsString + "";
        }
        System.out.println("Ваш счёт: " + dollarsString + ".");

        Scanner клавиатура = new Scanner(System.in);
        System.out.println("Введите :");
        String action = клавиатура.nextLine();
        switch (action.toLowerCase()) {
            case "кофе":
                dollars -= 2;
                System.out.println("Кофе,ура!");
                break;
            case "пароль":
                System.out.println("Введите пароль:");
                String пароль = клавиатура.nextLine();
                пароль = пароль.replace(" ", "");
                int заработок = пароль.length();
                dollars = dollars + заработок;
                System.out.println("Всего ты заработал: " + dollars + "$.");
                break;

            default:System.out.println("операция не поддерживаеться.");

        }
        //Здесь код без использование switch, только if и else

           // if (action.equals("кофе")) {
             //   dollars -= 2;
               // System.out.println("Кофе,ура!");
            //} else if (action.equals("пароль")) {
              //  System.out.println("Введите пароль:");
                //String пароль = клавиатура.nextLine();
                //пароль = пароль.replace(" ", "");
                //int заработок = пароль.length();
               // dollars = dollars + заработок;
               // System.out.println("Всего ты заработал: " + dollars + "$.");
           // } else {
             //   System.out.println("операция не поддерживаеться.");
           // }
       // }
    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {

    }

}
