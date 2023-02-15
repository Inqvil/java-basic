package ru.otus.homework.hm12final.app;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Converter implements  Convertible{
    private long number;
    private final StringBuffer stringBuffer = new StringBuffer();



    @Override
    public String convertNumberToWord(long number){
        this.number = number;
        String str = Currency.getCurrency(1, reformer(number));
        stringBuffer.replace(0, stringBuffer.length(), "");
        numberDigits = createNumberDigits();
        addWords();
        removeWhiteSpaces(stringBuffer);
        return stringBuffer.append(str).toString().trim();
    }



    private int[] numberDigits = createNumberDigits();

    private int reformer(long number) { //https://ru.stackoverflow.com/questions/674732

        int lastDigit = (int) (number % 10);
        int twoLastDigits = (int) (number % 100);
        if (lastDigit == 1 && twoLastDigits != 11) {
            return 1;
        }
        if ((lastDigit >= 2 && lastDigit <= 4) && !isBetweenTens(twoLastDigits)) {
            return 2;
        } else {
            return 3;
        }
    }
    private int[] createNumberDigits() {
        int[] arr = new int[4];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (int) (number % 1000);
            number /= 1000;
        }
        return arr;
    }

    private boolean isBetweenTens(int number) {
        return number > 10 && number < 20;
    }

    private String formatNumberToText(int number, boolean thousand) {
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int tensUnits = number % 100;
        int units = number % 10;

        if (isBetweenTens(tensUnits)) {
            return Words.getWord(5, hundreds) + " " + Words.getWord(3, units);
        } else {
            if (thousand) {
                return Words.getWord(5, hundreds) + " " + Words.getWord(4, tens) + " " + Words.getWord(2, units);
            } else {
                return Words.getWord(5, hundreds) + " " + Words.getWord(4, tens) + " " + Words.getWord(1, units);
            }
        }
    }

    private void removeWhiteSpaces(StringBuffer sb) {
        int end = 0;
        int spaceIndex = -1;

        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isWhitespace(sb.charAt(i))) {
                sb.setCharAt(end++, sb.charAt(i));
                spaceIndex = -1;
            } else if (spaceIndex < 0) {
                sb.setCharAt(end++, sb.charAt(i));
                spaceIndex = i;
            }
        }

        sb.setLength(end);
    }

    private void addWords() {
        for (int i = 0; i < numberDigits.length; i++) {
            int number = numberDigits[i];
            if (number == 0) {
                continue;
            }
            if (i == 2) {
                stringBuffer.append(formatNumberToText(number, true)).append(" ").append(Words.getDigit(i, reformer(number))).append(" ");
            } else {
                stringBuffer.append(formatNumberToText(number, false)).append(" ").append(Words.getDigit(i, reformer(number))).append(" ");
            }
        }
    }


}