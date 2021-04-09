public class sumArrayItems {

//    Напишите функцию, суммирующие значения элементов одномерного массива,
//    содержащего целые числа. Сигнатура:
    public static int sumArrayItems(int[] a) {
        int resultAll = 0;
        for (int i = 0; i < a.length; i++) {
            resultAll = resultAll + a[i];
        }
        return resultAll;
    }

    public static void main(String[] args) {
        int fff[] = {15, 45, 45, 85, 69};
        System.out.println(sumArrayItems(fff));
    }
}
