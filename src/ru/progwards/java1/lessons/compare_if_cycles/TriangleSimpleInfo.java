package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    //параметры длины сторон треугольника, а вернуть должна наибольшую длину стороны.
    public static int maxSide(int a, int b, int c) {
        int maxSide = 0;
        for (int i = 0; i <= 3; i++) {
            if (maxSide < a) maxSide = a;
            else if (maxSide < b) maxSide = b;
            else if (maxSide < c) maxSide = c;
        }
        return maxSide;
    }

    //    которая получает параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны.
    public static int minSide(int a, int b, int c) {
        Integer maxSide = Integer.MAX_VALUE;
        for (int i = 0; i <= 3; i++) {
            if (maxSide > a) maxSide = a;
            else if (maxSide > b) maxSide = b;
            else if (maxSide > c) maxSide = c;
        }
        return maxSide;
    }

    // параметрами длины сторон треугольника,
    // а вернуть должна true, если треугольник равносторонний
    // и false в противном случае
    //    Равнобедренный треугольник   —   треугольник
    //    у которого равны   две стороны.
    //    AB = BC   —   боковые стороны;
    //    AC   —   основание равнобедренного треугольника.
    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean ab = a==b;
        boolean bc = b==c;

        if (ab && bc)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(23,17,9));
        System.out.println(minSide(23,17,9));
        System.out.println(isEquilateralTriangle(15,16,15));
    }
}
