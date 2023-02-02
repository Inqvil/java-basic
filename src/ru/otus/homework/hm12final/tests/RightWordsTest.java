package otus.hm12final.tests;

import otus.hm12final.app.Converter;


import otus.hm12final.tests.assertions.MyAssert;

public class RightWordsTest {
    public static void correctNumberToWordTest (){
        String scenario = "Проверка на корректный перевод числа в пропись " + "\n________________________________";
        System.out.println(scenario);
        Converter converter = new Converter();
        try {

            MyAssert.assertEquals("один рубль", converter.getNumberToText(1));
            MyAssert.assertEquals("два рубля", converter.getNumberToText(2));
            MyAssert.assertEquals("три рубля", converter.getNumberToText(3));
            MyAssert.assertEquals("четыре рубля", converter.getNumberToText(4));
            MyAssert.assertEquals("пять рублей", converter.getNumberToText(5));
            MyAssert.assertEquals("одиннадцать рублей", converter.getNumberToText(11));
            MyAssert.assertEquals("двадцать рублей", converter.getNumberToText(20));
            MyAssert.assertEquals("сто двадцать одна тысяча двести двадцать три рубля", converter.getNumberToText(121223));
            MyAssert.assertEquals("триста сорок четыре миллиона восемьсот тридцать четыре тысячи девятьсот восемьдесят четыре рубля", converter.getNumberToText(344834984));
            MyAssert.assertEquals("сто десять миллиардов триста два миллиона триста две тысячи триста девять рублей", converter.getNumberToText(110_302_302_309L));
            MyAssert.assertEquals("сто одиннадцать рублей", converter.getNumberToText(111)); // почему этот тест постоянно падал? ввел те же значения и все заработало. я не понимаю
            MyAssert.assertEquals("одна тысяча сто одиннадцать рублей", converter.getNumberToText(1111));
            MyAssert.assertEquals("одиннадцать тысяч сто одиннадцать рублей", converter.getNumberToText(11111));
            MyAssert.assertEquals("сто одиннадцать тысяч сто одиннадцать рублей", converter.getNumberToText(111111));
            MyAssert.assertEquals("один миллион сто одиннадцать тысяч сто одиннадцать рублей", converter.getNumberToText(1111111));
            MyAssert.assertEquals("одиннадцать миллионов сто одиннадцать тысяч сто одиннадцать рублей", converter.getNumberToText(11111111));
            System.out.println();
            MyAssert.assertEquals("девятьсот девяносто девять миллиардов девятьсот девяносто девять " +
                    "миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять рублей", converter.getNumberToText(999999999999L));

            MyAssert.assertEquals("одна тысяча рублей", converter.getNumberToText(1000));
            MyAssert.assertEquals("одна тысяча девятьсот девяносто один рубль", converter.getNumberToText(1991));
            MyAssert.assertEquals("одна тысяча девятьсот девяносто два рубля", converter.getNumberToText(1992));
            MyAssert.assertEquals("одна тысяча девятьсот девяносто пять рублей", converter.getNumberToText(1995));
            MyAssert.assertEquals("одна тысяча девятьсот одиннадцать рублей", converter.getNumberToText(1911));

            System.out.println("_____________\n" + scenario + " пройден"  + "________________________________");
        }
        catch (AssertionError assertionError){
            System.err.println(scenario + " провалена " + assertionError.toString());
        }


    }

}