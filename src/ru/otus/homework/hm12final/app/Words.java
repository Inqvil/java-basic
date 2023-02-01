package ru.otus.homework.hm12final.app;

public class Words {

    private static final String[] UNITS = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[] UNITS1 = {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

    private static final String[] BETWEEN_TENS = {"", "одиннадцать", "двенадцать",
            "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать",
            "семнадцать", "восемнадцать",
            "девятнадцать"};

    private static final String[] TENS = {"", "десять", "двадцать", "тридцать",
            "сорок", "пятьдесят", "шестьдесят",
            "семьдесять", "восемьдесят", "девяносто"};

    private static final String[] HUNDREDS = {"", "сто", "двести", "триста",
            "четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"};


    private static final String[][] digits = {{"", "миллиард", "миллиарда", "миллиардов"},
            {"", "миллион", "миллиона", "миллионов"},
            {"", "тысяча", "тысячи", "тысяч"},
            {"","","",""}

    };
    public static String getDigit(int line, int column){
        return digits[line][column];
    }

    public static String getWord(int massiveIndex, int index){
        return switch (massiveIndex) {
            case 1 -> UNITS[index];
            case 2 -> UNITS1[index];
            case 3 -> BETWEEN_TENS[index];
            case 4 -> TENS[index];
            case 5 -> HUNDREDS[index];

            default -> throw new IllegalStateException("Unexpected value: " + massiveIndex);
        };
    }
}