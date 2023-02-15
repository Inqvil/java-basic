package ru.otus.homework.hm12final.app;

public class Currency {

    private static final String [] RUBLES = {"", "рубль", "рубля", "рублей"};
    private static final String [] DOLLARS = {"", "доллар", "доллара", "долларов"};
    private static final String [] YUAN = {"", "юань", "юаня", "юаней"};


    public static String getCurrency(int massiveIndex, int index){
        return switch (massiveIndex) {
            case 1 -> RUBLES[index];
            case 2 -> DOLLARS[index];
            case 3 -> YUAN[index];
            default -> throw new IllegalArgumentException("индекс введенного индекса валюты не существует");
        };
    }
}