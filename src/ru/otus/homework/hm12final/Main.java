package ru.otus.homework.hm12final;


import ru.otus.homework.hm12final.app.Converter;
import ru.otus.homework.hm12final.app.Menu;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.getNumberToText(12340340430L));
        Menu.menu();
    }
}
