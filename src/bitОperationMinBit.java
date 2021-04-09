//программный код, который возвращает младший (нулевой) бит переменной byte value.
// Ответ нужно поместить в переменную int result.
//
//        Таким образом, если младший бит параметра value равен 0,
//        то result должен быть равен 0. Если младший бит равен 1,
//        то и result должен быть равен 1.
//
//        Подсказка
//        при реализации этой функции удобно использовать битовую операцию &
public class bitОperationMinBit {

    public int byteValue(byte value){
        int result;
        int sd = 1;
        String valuePr = Integer.toBinaryString(value);
        String dfd = valuePr.substring(valuePr.length() - 1,valuePr.length());

        Integer i2 = Integer.valueOf(dfd);

int dfddf = sd & i2;

            if (dfddf == 1){
                result = 1;
            }
            else
            {result = 0;}


   return result;
}
    public static void main(String[] args) {
        byte dfg = 79;
        System.out.println("  " +  new bitОperationMinBit().byteValue(dfg));
    }
}
