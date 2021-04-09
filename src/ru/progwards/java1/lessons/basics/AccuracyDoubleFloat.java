package ru.progwards.java1.lessons.basics;

//        ERROR: Тест "Тест на погрешность" не пройден. Метод возвращает неверное
//        значение. Передан параметр: 6371.2. Возвращено: 1.2926579351321077E-19. Ожидалось: -163798.93103027344
public class AccuracyDoubleFloat {

        public static double volumeBallDouble(double radius) {
            return ((4 * Math.pow(radius, 3))/ 3) * 3.14D;
        }

        public static float volumeBallFloat(float radius) {
            return (float) (((4 * Math.pow(radius, 3))/ 3) * 3.14D);
        }
        public static double calculateAccuracy(double radius) {
            return volumeBallDouble(radius) -  volumeBallFloat((float) radius);
        }

        public static void main(String[] args) {
volumeBallDouble(6371.2);
volumeBallFloat( 6371.2F);
calculateAccuracy(6371.2);
        }
    }