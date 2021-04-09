//Создайте класс Calculator, содержащий
//
//        приватную переменную int result;
//        конструктор по умолчанию, устанавливающий result = 0;
//        публичную функцию set(int num), устанавливающую значение result равный num
//        публичную функцию add(int num), увеличивающую result на num
//        публичную функцию sub(int num), уменьшающую result на num
//        публичную функцию int getResult()
public class Calculator {
    private int result;

    Calculator(){
        this.result = 0;

    }

    Calculator(int result){
        this.result = result;
    }

    public int set(int num){
        result = num;
        return result;
    }


    public int add(int num){
        result += num;
        return result;
    }


    public int sub(int num){
        result -= num;
        return result;
    }

    public int getResult(){
        return result;
    }


    public static void main(String[] args) {
        Calculator cv = new Calculator(8);
        int dfd  = cv.add(8);
        System.out.println(dfd);
    }
}
