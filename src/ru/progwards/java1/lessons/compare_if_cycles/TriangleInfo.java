package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {


//    которая возвращает true, если по данным трём сторонам (a, b, c)
//    можно построить треугольник. Из геометрии известно, что в
//    треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
    public static boolean isTriangle(int a, int b, int c){

        int bc = b+c;
        int ac = a+c;
        int ab = a+b;

        if (a == 0 || b == 0 || c == 0)
            return false;
        else if (a < bc && b < ac && c < ab)
            return  true;
        else
            return false;
    }

//    которая возвращает true, если треугольник со сторонами a, b, c
//    является прямоугольным. Из геометрии известно, что для
//    прямоугольного треугольника выполняется теорема Пифагора
//    (сумма квадратов катетов равна квадрату гипотенузы).
    public static boolean isRightTriangle(int a, int b, int c){

        if (a == 0 || b == 0 || c == 0)
            return false;

        boolean result = ((a * a) + (b * b)) == (c * c);
        if (result)
        return true;
                   else
        return false;

    }

//    которая возвращает true, если треугольник со сторонами a, b, c
//    является равнобедренным.
//    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.
    public static boolean isIsoscelesTriangle(int a, int b, int c){

//        if (a == 0 || b == 0 || c == 0)
//            return false;

        if (a == b) return true;
        else if (b == c) return true;
        else if (a == c) return true;
        else return false;
    }


    public static void main(String[] args) {
        System.out.println(isTriangle(15,10,8));
        System.out.println(isRightTriangle(3,4,5));
        System.out.println(isIsoscelesTriangle(5,18,13));

    }
}
