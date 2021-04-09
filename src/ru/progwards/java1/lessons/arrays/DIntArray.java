package ru.progwards.java1.lessons.arrays;

import javax.xml.transform.sax.SAXSource;
import java.util.Arrays;

//    Задача 3. Класс DIntArray
//    Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:
public class DIntArray {
// 3.1 в классе разместить private переменную - массив целых чисел.
    private int[] arr = new int[]{};

// 3.2 конструктор - по умолчанию
//    public DIntArray(){
//    }

//    Если в тело класса DIntArray добавить хотя бы один другой конструктор
//    (например, конструктор с одним параметром),
//    то конструктор по умолчанию автоматически генерироваться не будет (!)
//    public DIntArray(int arr[]){
//        this.arr = arr;
//    }

//    3.2 метод public void add(int num) - добавляет элемент num в конец массива,
//    при этом размер массива должен увеличиться на 1. Для этого нужно будет разместить новый
//    массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.
    public void add(int num){

        if (num > arr.length) {
            return;
        }

        int[] arrayInt = new int[]{};
        arrayInt = Arrays.copyOf(arr, arr.length + 1);

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + " ");
        }

        arrayInt[arrayInt.length - 1] = num;
        System.out.println();
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + " ");
        }

//        int[] newarr = new int[arr.length + 1];
//        for (int i = 0; i < arr.length; i++)
//        {
//            newarr[i] = arr[i];
//        }
//        newarr[newarr.length - 1] = num;
//        arr = newarr;
}

// 3.3 метод public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива,
//    при этом размер массива должен увеличиться на 1. Для этого нужно будет разместить новый
//    массив нужного размера, скопировать в него старый, c учетом того, что новый элемент
//    окажется где-то в середине, и потом положить в нужный индекс элемент num.
    public void atInsert(int pos, int num){
        int tempDigital = 0;
        int[] arrayIntIns = Arrays.copyOf(arr, arr.length+1);

       for (int i = 0; i < arrayIntIns.length; i++){
            System.out.print(arrayIntIns[i] + " ");
        }

        tempDigital = arrayIntIns[pos];
        arrayIntIns[pos] = num;
        arrayIntIns[arrayIntIns.length - 1] = tempDigital;

        System.out.println();
        for (int i = 0; i < arrayIntIns.length; i++){
            System.out.print(arrayIntIns[i] + " ");
        }



//        int[] newarr = new int[arr.length + 1];
//        for (int i = 0; i < newarr.length; i++)
//        {
//            if (i < pos) newarr[i] = arr[i];
//            else if (i == pos) newarr[i] = num;
//            else if (i > pos) newarr[i] = arr[i - 1];
//        }
//        arr = newarr;


    }

//  3.4 метод public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер
//    массива должен уменьшиться на 1. Для этого нужно будет разместить новый массив нужного размера,
//    скопировать в него старый, уже без элемента, который был в позиции pos.
    public void atDelete(int pos){
        int j = 0;
        int arrayIntDel[] = new int[arr.length-1];

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
                if (i == pos) {
                    arrayIntDel[j] = arr[i + 1];
                }else{
                    arrayIntDel[j] = arr[i];
                    j++;
                }
            }
        System.out.println();
        for (int i = 0; i < arrayIntDel.length; i++){
            System.out.print(arrayIntDel[i] + " ");
        }

//        int[] newarr = new int[arr.length - 1];
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (i < pos) newarr[i] = arr[i];
//            else if (i > pos) newarr[i - 1] = arr[i];
//        }
//        arr = newarr;
        }

// 3.5 метод public int at(int pos) - возвращает элемент по индексу pos
    public int at(int pos){
        return  arr[pos];
    }

    public static void main(String[] args) {

        DIntArray sdsd = new DIntArray();
        sdsd.arr = new int[]{12, 12, 1, 21, 2, 2, 1, 2, 1, 2, 12, 1, 212, -1, 2, 1};
            System.out.println("\n" + "begin" + "\n" + "add massive");
                sdsd.add(10);
            System.out.println("" + "\n" + "\n" + "atInsert massive");
                sdsd.atInsert(4, 8);
            System.out.println("\n" + "\n" + "atDelete massive");
                sdsd.atDelete(12);
            System.out.println("\n" + "end.");
    }
}
