package ru.progwards.java1.lessons.basics;

public class Astronomy {

//
//    В этой задаче нужно будет реализовать функции,
//    вычисляющих разные астрономические величины.
//    Во всех функциях, где это необходимо, считаем число π = 3.14
//
//2.1 Реализовать функцию
//public static Double sphereSquare(Double r),
// которая вычисляет площадь поверхности
// сферы радиуса R по формуле S = 4πR2.
//
// 2.2 Реализовать функцию
//    public static Double earthSquare(),
//    которая вычисляет площадь поверхности Земли,
//    считая радиус равным 6 371.2 км и используют функцию sphereSquare
//
// 2.3 Реализовать функцию
//    public static Double mercurySquare(),
//    которая вычисляет площадь поверхности Меркурия,
//    считая радиус равным 2 439,7 км  и используют функцию sphereSquare
//
// 2.4 Реализовать функцию
//    public static Double jupiterSquare(),
//    которая вычисляет площадь поверхности Юпитера,
//    считая радиус равным 71 492 км  и используют функцию sphereSquare
//
// 2.5 Реализовать функцию
//    public static Double
//    earthVsMercury(), которая
//    вычисляет отношение площади
//    поверхности Земли к площади поверхности Меркурия используя готовые функции площадей планет
//
// 2.6 Реализовать функцию
//    public static Double earthVsJupiter(),
//    которая вычисляет отношение площади
//    поверхности Земли к площади поверхности Юпитера используя готовые функции площадей планет



public static Double sphereSquare(double radius) {
    double resultSphereSquare =   4 * 3.14 * Math.pow(radius, 2);
    return resultSphereSquare; }
public static Double earthSquare() {
            return sphereSquare(6371.2D );
        }
public static Double mercurySquare() {
            return sphereSquare(2439.7D);
        }
public static Double jupiterSquare() {return sphereSquare(71492.0D);}

public static Double earthVsMercury()
{return earthSquare() /
        mercurySquare();}

public static Double earthVsJupiter()
{return earthSquare() /
        jupiterSquare();}

        public static void main(String[] args) {
            earthSquare();
            mercurySquare();
            jupiterSquare();

            earthVsMercury();
            earthVsJupiter();
        }
    }
    /*
            Ошибка 1: method earthSquare in class ru.progwards.java1.lessons.basics.Astronomy
            cannot be applied to given types;
        required: double
        found: no arguments
        reason: actual and formal argument lists differ in length


        Ошибка 2: method jupiterSquare in class ru.progwards.java1.lessons.basics.Astronomy cannot be applied to given types;
        required: double
        found: no arguments
        reason: actual and formal argument lists differ in length


        Ошибка 3: method mercurySquare in class ru.progwards.java1.lessons.basics.Astronomy cannot be applied to given types;
        required: double
        found: no arguments
        reason: actual and formal argument lists differ in length*/