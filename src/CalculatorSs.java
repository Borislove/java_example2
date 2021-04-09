//
//Создайте класс Calculator, содержащий
//
//        приватную переменную int result;
//        конструктор по умолчанию, устанавливающий result = 0;
//        публичную функцию set(int num), устанавливающую значение result равный num
//        публичную функцию add(int num), увеличивающую result на num
//        публичную функцию sub(int num), уменьшающую result на num
//        публичную функцию int getResult()
public class CalculatorSs {
    private int result = 0;


    public int set(int num) {
        result = num;
        return result;
    }

    public int add(int num) {
        result = result + num;
        return result;
    }

    public int sub(int num) {
        result = result - num;
        return result;
    }

    public int getResult() {
        return result;
 }

    public static void main(String[] args) {

    }
}
// public static void main(String[] args) {
//    System.out.println(
//            new Calculator(34).set(34) + "   " +
//                    new Calculator(35).add(34) + "   " +
//                    new Calculator(34).sub(36) + "   " +
//                    new Calculator(34).getResult());
//}