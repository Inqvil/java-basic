package ru.otus.homework.hm12final.app;

public class Currency {
    public  static final String availableCurrency = "1.Рубли 2. Доллары 3. Юани 4. Рупии";
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
            case 322 -> "доступные валюты: " + availableCurrency;
            default -> "валюта еще не добавлена";
        };
    }
}