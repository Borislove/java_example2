package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
//        bitNumber предполагается от 0 до 8. В вашем случае
//        checkBit(0) = 0, checkBit(1) = 0, checkBit(2) = 0, checkBit(3) = 1 и т. д
//    Задача 2. Класс CheckBit: не пройдено, оценка: 0.0
//    Комментарий:
//    ERROR: Тест "Метод checkBit(byte value, int bitNumber)" не пройден.
//    Метод возвращает неверное значение. Переданы параметры: (byte)68, 1. Возвращено: 1, ожидалось: 0.
//    По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 0.00%
    public static int checkBit(byte value, int bitNumber)
    {
//        System.out.println(value + "  " + Integer.toBinaryString(value));
        int wwa = value >> bitNumber;
//        System.out.println(wwa + "   " + Integer.toBinaryString(wwa));
        return Integer.parseInt(Integer.toBinaryString(wwa).substring(Integer.toBinaryString(wwa).length() - 1));
    }
//    public static void main(String[] args) {
//        System.out.println(checkBit((byte) -128, 4));
//    }
}
