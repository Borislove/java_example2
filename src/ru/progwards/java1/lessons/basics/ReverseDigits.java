package ru.progwards.java1.lessons.basics;

public class ReverseDigits {


    public static int reverseDigits(int number) {
        String str = Integer.toString(number);
        String reverse = (new StringBuffer(str)).reverse().toString();
        return Integer.valueOf(reverse);
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
}




