package ru.otus.homework.hm12final.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Converter converter = new Converter();
        boolean exit = false;
        System.out.println("Для выхода ввести 0");
        Scanner sc = new Scanner(System.in);
        int d = 0;
        try {
                while (!exit) {
                    long choice = sc.nextLong();
                    System.out.println(converter.getNumberToText(choice));
                    if (choice == 0) {
                        exit = true;
                    }
                }
            } catch (InputMismatchException inputMismatchException) {
            System.out.println("некорректный ввод?");

            }
        menu(); //как его снова запустить без рекурсии? не нагуглил
        }

}