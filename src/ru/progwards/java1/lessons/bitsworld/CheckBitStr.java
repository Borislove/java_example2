package ru.progwards.java1.lessons.bitsworld;


//        Задача 2. Класс CheckBit
//        2.1 Реализовать функцию public static int checkBit(byte value,
//        int bitNumber) которая возвращает значение бита с порядковым
//        номером bitNumber от параметра value. При этом следует помнить,
//        что нумерация начинается с нуля и нулевой бит является младшим.
//
//        Подсказки:
//        при реализации этой функции следует использывать опыт,
//        полученный при решении предыдущей задачи;
//        кроме того, удобно использовать битовую операцию сдвиг вправо >>.
//
//        bitNumber предполагается от 0 до 8. В вашем случае
//        checkBit(0) = 0, checkBit(1) = 0, checkBit(2) = 0, checkBit(3) = 1 и т. д

public class CheckBitStr {

    public static int checkBitStr(byte value, int bitNumber)
    {
        int nm=0;

        String gf = Integer.toBinaryString(value);
        int gfLength = gf.length();
        gf = "00000000" + gf;
        String dfdf =  gf.substring(gfLength);

        String str = "Последний символ в этой строке - о";
        int last = dfdf.length() -1;//длина строки - 1, так как отсчет начинается с 0
        int dfdfdf = gf.charAt(bitNumber);

        return nm;
    }

    public static void main(String[] args) {
        System.out.println(checkBitStr((byte) 125, 2));
    }

}
