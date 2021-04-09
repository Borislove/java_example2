import java.util.*;

public class arrayMaxSearch {

//    Реализуйте функцию, возвращающую максимальный по значению элемент массива.
//    Если в массиве 0 элементов, вернуть 0. Сигнатура функции
//
//    public int arrayMax(int[] a)
//
//    Подсказка - для быстрой реализации
//    удобно использовать функцию Arrays.sort()

    public static int arrayMax(int[] a){
//        int df = 0;
        if (a.length == 0) {
            return 0;
        }
//        else if (a.length == 1)
//        {
//            return a[a.length - 1];
//        }

        int dff = a.length;

        Arrays.sort(a); //,0, dff);
        for(int i = 0; i <  dff; i++) {
            System.out.print("in method arrayMax: " + a[i] + "  ");
        }

        System.out.println();
//        System.out.print(a[dff - 1] + "  ");
        return a[dff - 1];
    }

    public static void main(String[] args) {
        int arrs[] = {};//{15, 45, 96, 4, 0, 13, -78};
        System.out.println(arrayMax(arrs));
    }

}
