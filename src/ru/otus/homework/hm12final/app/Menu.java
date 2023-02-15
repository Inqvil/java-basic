package ru.otus.homework.hm12final.app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        Converter converter = new Converter();
        boolean exit = false;
        String menu = "Для выхода ввести 0";
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);

        while (!exit){
            try {
                long choice = sc.nextLong();
                System.out.println(converter.convertNumberToWord(choice));

                if (choice == 0) {
                    exit = true;
                }
            }catch (InputMismatchException inputMismatchException){
                String badInput = sc.next(); //https://stackoverflow.com/questions/25101575/continue-a-while-loop-after-exception
                System.out.println("Некорректный ввод: " + badInput);
                continue;
            }
        }

    }
}