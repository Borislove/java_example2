public class factorial {

    public static class sd {

        static long factorial(long n){
            long sum = 1;
            if (n==0) n=1;
            for (long i = 1; i <= n; i++){
                sum = sum * i;
            }
            return sum;
        }
        //    Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
        public static void main(String[] args) {
            System.out.println(factorial(0));
        }}

}
