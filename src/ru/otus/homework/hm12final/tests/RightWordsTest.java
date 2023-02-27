package ru.otus.homework.hm12final.tests;


import junit.framework.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import ru.otus.homework.hm12final.app.Converter;
import ru.otus.homework.hm12final.app.Convertible;


public class RightWordsTest {
    Convertible converter = new Converter();
    @Test
    public void numbersUpToTen(){
        String scenario = "Проверка на корректный перевод числа в пропись в промежутке до десяти " + "\n________________________________";
        System.out.println(scenario);
            Assert.assertEquals("один рубль", converter.convertNumberToWord(1));
            Assert.assertEquals("два рубля", converter.convertNumberToWord(2));
            Assert.assertEquals("три рубля", converter.convertNumberToWord(3));
            Assert.assertEquals("четыре рубля", converter.convertNumberToWord(4));
            Assert.assertEquals("пять рублей", converter.convertNumberToWord(5));
            Assert.assertEquals("шесть рублей", converter.convertNumberToWord(6));
            Assert.assertEquals("семь рублей", converter.convertNumberToWord(7));
            Assert.assertEquals("восемь рублей", converter.convertNumberToWord(8));
            Assert.assertEquals("девять рублей", converter.convertNumberToWord(9));
        }
    @Test
    public void numbersFromTenToTwenty(){
        String scenario = "Проверка на корректный перевод чисел в промежутке от 10 до 20" + "\n________________________________";
        System.out.println(scenario);

        Assert.assertEquals("одиннадцать рублей", converter.convertNumberToWord(11));
        Assert.assertEquals("двадцать рублей", converter.convertNumberToWord(20));
        Assert.assertEquals("тринадцать рублей", converter.convertNumberToWord(13));
        Assert.assertEquals("четырнадцать рублей", converter.convertNumberToWord(14));
        Assert.assertEquals("шестнадцать рублей", converter.convertNumberToWord(16));
        Assert.assertEquals("семнадцать рублей", converter.convertNumberToWord(17));
        Assert.assertEquals("восемнадцать рублей", converter.convertNumberToWord(18));
        Assert.assertEquals("девятнадцать рублей", converter.convertNumberToWord(19));
    }
    @Test
    public void numbersFromHundredToThousand(){
        Assert.assertEquals("четыреста девять рублей", converter.convertNumberToWord(409));
        Assert.assertEquals("сто одиннадцать рублей", converter.convertNumberToWord(111));
        Assert.assertEquals("пятьсот семьдесят три рубля", converter.convertNumberToWord(573));

    }
    @Test
    public void billions(){
        String scenario = "Проверка на корректный перевод чисел по верхней границе (миллиард)" + "\n________________________________";
        System.out.println(scenario);
        Assert.assertEquals("сто двадцать два миллиарда триста двадцать три миллиона сто двадцать одна тысяча двести одиннадцать рублей",
                converter.convertNumberToWord(122323121211L));
        Assert.assertEquals("тридцать четыре миллиарда четыреста тридцать три миллиона четыреста тридцать четыре тысячи триста тридцать три рубля",
                converter.convertNumberToWord(34433434333L));
    }


}