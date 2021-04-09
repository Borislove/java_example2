public class classSumArrayItems {

//    Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
    public static int sumArrayItems(int[] a){
        int resultSumm = 0;
                for (int i = 0; i < a.length; i++){
            resultSumm = resultSumm + a[i];
        }
                return  resultSumm;
    }

    public static void main(String[] args) {
        int arre[] = {15,15,15};
        System.out.println(sumArrayItems(arre));
    }

}


