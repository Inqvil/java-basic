package ru.otus.homework.hm12final.app;

public class Currency {

    private static final String [] RUBLES = {"", "рубль", "рубля", "рублей"};
    private static final String [] DOLLARS = {"", "доллар", "доллара", "долларов"};
    private static final String [] YUAN = {"", "юань", "юаня", "юаней"};
    private static final String [] RUPEES = {"", "рупия", "рупии", "рупий"};


    public static String getCurrency(int massiveIndex, int index){
        return switch (massiveIndex) {
            case 1 -> RUBLES[index];
            case 2 -> DOLLARS[index];
            case 3 -> YUAN[index];
            case 4 -> RUPEES[index];
            default -> "валюта еще не добавлена";
        };
    }
}