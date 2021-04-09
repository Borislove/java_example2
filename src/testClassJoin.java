public class testClassJoin {

    public static void main(String[] args) {
//        System.out.println(3 - 1 > 2);

//        for ( ; ; ) {
//
//            System.out.println(" x");
//
//        System.out.println(addAsStrings(14,8));

//    while ();

//        System.out.println(factorial(19));
//        System.out.println(textGrade(45));
//        System.out.println((int)765.567);
        System.out.println(true && false || true);
    }

    //    Напишите метод, который возвращает текстовую характеристику оценки по числовой.
//
//            0 - не оценено
//1..20 - очень плохо
//21..40 - плохо
//41..60 - удовлетворительно
//61..80 - хорошо
//81..100 - отлично
//    в остальных случаях - не определено
//
//    Сигнатура метода static String textGrade(int grade)
//
//    Например, textGrade(45) должна вернуть "удовлетворительно"
    static String textGrade(int grade) {

        if (grade >= 1 && grade <= 20) return "очень плохо";
        else if (grade == 0) return "не оценено";
        else if (grade >= 21 && grade <= 40) return "плохо";
        else if (grade >= 41 && grade <= 60) return "удовлетворительно";
        else if (grade >= 61 && grade <= 80) return "хорошо";
        else if (grade >= 81 && grade <= 100) return "отлично";
        else return "не определено";
    }

    //    Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
//    Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
    static long factorial(long n)
    {
        long resultM = 1;
        int i = 1;
        if (n == 0) resultM = 1;
        else
            while (i<=n){
                resultM = resultM * i;
                System.out.println(": " + resultM);
                i++;
            }
        return resultM;
    }

    // складывает 2 числа, как строки. Сигнатура метода
// Например addAsStrings(1, 2) должен выдать 12, а addAsStrings(2, 1) выдать 21
    static int addAsStrings(int n1, int n2)
    {
        return Integer.parseInt((Integer.toString(n1)) + (Integer.toString(n2)));
    }
}
