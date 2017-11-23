package com.banana.textgame;

import java.util.ArrayList;

public class User {

    boolean trired = false;
    int bitcoins = 0;
    boolean[] knownLanguages = {true, false, false, false, false, false, false};
    ArrayList компания = new ArrayList();

void printInfo() {
    String bitcoinsString = "";
    for (int i = 0; i < bitcoins; i += 1) {
        bitcoinsString = bitcoinsString + "";
    }
    System.out.println("Ваш счёт: " + bitcoinsString + ".");
    напечатайИзвестныеЯзыки();

}

    void напечатайИзвестныеЯзыки() {
        System.out.println("Вы знаете: ");
        for (int i = 0; i < Main.languages.length; ++i) {
            if (knownLanguages[i] == true) {
                System.out.println(Main.languages[i]);
            }
        }
    }


}