import java.io.PrintStream;

import java.math.*;

public class classWrapper {

    static int metodNew (int x)
    {
        return 0;
    }


    static String metodStringAll (String Str)
    {
        return "";
    }


            static boolean boolMetodNew (boolean bol)
        {
            return true;
        }

    static double fractional(double num)
    {


        return num-Math.floor(num);
    }

    static double fractionalL(double num)
    {
        int numInt = (int)num;
        return num % 1;
    }

    public static void main(String[] args) //psvm
        {
// язык Java строгой типизации
// нельзя приоброзовать тип одного операнда к другому типу
            // но есть решение
            // пример
            // Double dbl = 123.456789;
            // int numunt = (int)dbl;
            // то есть в крглых скобках



//            System.out.println(); //sout

            Integer int1 = 5;
            System.out.println(int1);

            //Расширение возможности с помощью vlueOf
            //автоупоковка с аасортиментом как строка, так и другие выды
            Double intStr = Double.valueOf("454");
            Double intNum = Double.valueOf(454);
            System.out.println("");
            System.out.println("" +  intStr + " " + intNum);


            //Расширение возможности с помощью vlueOf
            //автоупоковка с аасортиментом как строка, так и другие выды
            Double dobleStr = Double.valueOf("44.12");
            Double dobleNum = Double.valueOf(44.12);
            Double doblenum = Double.valueOf(44);
            System.out.println("");
            System.out.println("" +  dobleStr + " " + dobleNum + "  " + doblenum);
            System.out.println("");

            //классы обетртки можео складывать
            // и умножать даже разного типа
            //int и double

            Double numm = 1.53;
            System.out.println(fractional(numm));
            System.out.println(fractionalL(numm));

//            Напишите метод, который возвращает дробную часть числа.
//            Сигнатура метода static double fractional(double num)
//
//            Например fractional(1.53) должен выдать 0.53
//            Answer:(penalty regime: 10, 20, ... %)

        }
}
