package ru.progwards.java1.lessons.compare_if_cycles;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class CyclesGoldenFibo {

//возвращать true, если десятичное представление числа number содердит цифру digit.
    public static boolean containsDigit(int number, int digit){
        int x = 0;
        int colSymbolDigit=0;
        int bdb;
        boolean resultCheck = false;
        x = number%10;
        String bb = String.valueOf(digit);
        colSymbolDigit = String.valueOf(Math.abs(digit)).length();

        for (int i=0; i < colSymbolDigit; i++){
            bdb = Character.getNumericValue(bb.charAt(i));
            if (x == bdb)
            {
                resultCheck = true;
//            System.out.println("i" + i + "   xx" + x + "  bdb" + bdb);
            break;
            }
            else
                {
                    resultCheck = false;
                }

        }
        return resultCheck;
    }

//Реализовать, используя любой цикл, функцию
//которая будет возвращать n-ое число Фибоначчи
// (нумерация начинается с 1, то есть при n = 3
// должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    public static int fiboNumber(int n)
    {
        int resultn = 0;
        int resultnn = 1;
        int i = 0;
        while (i < n){
            resultnn = resultnn + resultn;
            resultn = resultnn - resultn;
            i++;
        }
        return resultn;
    }

//    которая будет возвращать true, если треугольник
//    со сторонами a, b, c является Золотым. Определим критерии.
//    Он должен быть равнобедренным и отношение ребра
//    к основанию должно лежать между значениями 1.61703 и 1.61903.
public static boolean isGoldenTriangle(int a, int b, int c) {

        float resultСalculation = 0.0F;
        boolean resultBoolean = false;

        if (a == 0 || b == 0 || c == 0)
        return false;

        //основание c
        if (a == b) resultСalculation = c / a;
        //основание b
        else if (a == c) resultСalculation = b / a;
        //основание a
        else if (b == c) resultСalculation = a / b;
        else return false;

    if (resultСalculation >=  1.61703F && resultСalculation <= 1.61903F)
      return true;
    else
        return false;
    }

//    Золотой треугольник это равнобедренный треугольник у которого ребро
//    относится к основанию как 1.61803 (приблизительно), то есть по правилу
//    Золотого сечения. Числа Фибоначчи это ряд
//    чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//    в котором первые два элемента равны 1, а каждый следующий
//    равен сумме двух предыдущих.

//    вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
//    После этого, используя вложенные циклы, определить:
//    есть ли среди треугольников, длины сторон которых
//    являются натуральными числами не превышающими 100, Золотые треугольники.
//    И если есть, вывести на консоль длины основания и рёбер этих треугольников.
    public static void main(String[] args) {

//        System.out.println(containsDigit(0,79845));

        String strNumFibo = "";
        int fiboDigt = 0;

        for (int i = 0; i < 15; i++) {
            fiboDigt = fiboNumber(i);
            strNumFibo = "" + strNumFibo + fiboDigt + ", ";
        }
        System.out.println("15 первых чисел Фибоначчи " + strNumFibo);
        System.out.println("");

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (isGoldenTriangle(a, b, c))
                        if (a == b) System.out.println("Длина основания: " + c + " стороны треуголника: " + a + " , " + b);
                        else if (a == c) System.out.println("Длина основания: " + b + " стороны треуголника: " + a + " , " + c);
                        else if (b == c) System.out.println("Длина основания: " + a + " стороны треуголника: " + b + " , " + c);
                }
            }
        }

    }
}
