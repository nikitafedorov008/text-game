package com.banana.textgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        String строка = "Ответ на самый главный вопрос:Сила в ньютонах брат!";
        String[] vs = {"Кто вы такой?", "Здраcтвуй товарищ!, представся.", "ЫЫЫыыыЫЫЫ"};
        String v = vs[(int) (Math.random()* vs. length)];
        System.out.println(v);
        String answer = keyboard.nextLine();
        System.out.println("Здраствуй " + answer);
    }


    boolean trired = false;
    int bitcoins = 0;
    String[] languages = {"Java","Python","JavaScript","C++", "C#","Brainfuck","Pascal"};
    boolean[] knownLanguages = {true, false, false, false, false, false, false};
    Scanner keyboard = new Scanner(System.in);
ArrayList компания = new ArrayList();
    /*
     * Каждую игровую ночь ничего не происходит!
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber);
        String bitcoinsString = "";
        for (int i = 0; i < bitcoins; i += 1) {
            bitcoinsString = bitcoinsString + "";
        }
        System.out.println("Ваш счёт: " + bitcoinsString + ".");
        напечатайИзвестныеЯзыки();

        Scanner клавиатура = new Scanner(System.in);
        System.out.println("Введите :");
        String action = клавиатура.nextLine();
        switch (action.toLowerCase()) {

            case "поглатить кусочек пиццы":
                съестьпиццу();
                break;
            case "изучить":
                LearnLanguage();
                break;
            case "кофе":
                bitcoins -= 2;
                System.out.println("Кофе,ура!");
            case "пароль":
                System.out.println("Введите пароль:");
                String пароль = клавиатура.nextLine();
                пароль = пароль.replace(" ", "");
                int заработок = пароль.length();
                bitcoins = bitcoins + заработок;
                System.out.println("Всего ты заработал: " + bitcoins + "$.");
                break;
            case "устал":
                trired = true;
                break;
            case "найти работу":
                НайтиРаботу();
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
        System.out.print("Всё! лавочка закрылась, ты заработал:" + bitcoins + "$");}

        //действия

    void LearnLanguage() {
            System.out.println("Какой язык будем учить?");
            String выбранныйязык = keyboard.nextLine();

            for (int i = 0; i < languages.length; ++i) {
                if (languages[i].equals(выбранныйязык)) {
                    knownLanguages[i] = true;
                    bitcoins -= 20;
                }
            }
    }

    void напечатайИзвестныеЯзыки() {
                System.out.println("Вы знаете: ");
        for (int i = 0; i < languages.length; ++i) {
            if (knownLanguages[i] == true) {
                System.out.println(languages[i]);
            }
        }
    }

    void съестьпиццу() {
        System.out.println("Сколько кусков пиццы");
        keyboard.nextInt();
        String строка = keyboard.nextLine();
        try {
            int количествоКусков = Integer.parseInt(строка);
            съестьПиццу(количествоКусков, 2);
        } catch (Exception e) {
            System.out.println("Ошибочка. ;(");
        }
    }

    void съестьПиццу(int количествоКусков, int стоимостьПиццы){
        System.out.println("Вы поглатили"+ количествоКусков + "кусков пиццы.");
        bitcoins-=2 * количествоКусков;

    }

    void НайтиРаботу(){
        System.out.println("Какую работу Хотите?");
        String compani = keyboard.nextLine();
        компания.add(compani);
    }

    int верниОчки() {
        int очки = bitcoins;
        for (int i = 0; i < knownLanguages.length; i = i + 1) {
            if (knownLanguages[i] == true) {
                очки += 10;
            }
        }
        return очки;
    }

}