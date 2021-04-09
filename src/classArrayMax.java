import java.util.Arrays;

public class classArrayMax {

//    Реализуйте функцию, возвращающую максимальный по значению элемент массива.
//    Если в массиве 0 элементов, вернуть 0. Сигнатура функции
//    Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()

    public static  int arrayMax(int[] a){
        if (a.length == 0){return 0;}
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        int dfdf[] = {};
        System.out.println(arrayMax(dfdf));
    }

}
