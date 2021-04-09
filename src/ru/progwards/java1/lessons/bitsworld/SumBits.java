package ru.progwards.java1.lessons.bitsworld;

import javax.swing.*;

public class SumBits {


 
//        Задача 1. Класс SumBits
//        1.1 Реализовать функцию
//        public static int sumBits(byte value), которая суммирует все
//        биты параметра value. Например, для двоичного числа 0100101 функция должна вернуть 3.
//
//        Подсказки:
//        используйте & с числом 1 для того, чтобы оставить
//        только один правый значащий бит;
//        используйте сдвиг вправо для того, чтобы проверить следующий бит.
//
// public static int sumBits(byte value), которая суммирует все биты
// параметра value.
//
// Например, для двоичного числа 0100101 функция должна вернуть 3.
//
//        Подсказки:
//        используйте & с числом 1 для того, чтобы оставить
//        только один правый значащий бит;
//        используйте сдвиг вправо для того, чтобы проверить следующий бит.
//
// перевести цифрф в симвлоы и перебиравть по исмвольно
// далее делать проверку на 1
// если 1 тогда увеличиваем счеткик на 1
// и возвращаем уже количество
//
//    ERROR: Тест "Функция sumBits(byte value)" не пройден. Функция возвращает неверное
//    значение при передаче байта = -128: должно быть 1, получено 25
//    По данной задаче в целом не зачет, решение возвращено на доработку.
//    Задача выполнена на 0.00%


//    Поразрядная сумма формируется по следующим правилам:
//
//            0 + 0 = 0
//
//            0 + 1 = 1
//
//            1 + 0 = 1
//
//            1 + 1 = 0 – осуществляется перенос 1 в старший разряд
//
//  топовое решение Integer.toBinaryString(Integer.parseInt("11111010", 2) + Integer.parseInt("00000001", 2))
//
    public static int sumBits(byte value) {
        int resultAll = 0;
        String str2  = Integer.toBinaryString(value);
        String strddf = "";
        int str2length = str2.length();
        System.out.println("Кол символов: " + str2length);

        if (str2length > 8) {

            strddf =  str2.substring(24, 32);

                System.out.println(strddf);
                    for
                    (int i=0; i <= 7; i++)
                    {
                        if
                        ('1' == strddf.charAt(i))
                    {
                        resultAll =  resultAll + 1;
                    }
                    }
        }







        else
            {
                for
                (int i=0; i < str2.length(); i++)
                {
                    if
                    ('1' == str2.charAt(i))
                    {
                        resultAll =  resultAll + 1;
                    }
                }
            }

//        return Integer.parseInt(Integer.toBinaryString(Integer.parseInt(Integer.toBinaryString(value), 2)
//                + Integer.parseInt(Integer.toBinaryString(value), 2)),2);
        System.out.println("resultALL: " + resultAll);
        return resultAll;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 1));
    }

}
