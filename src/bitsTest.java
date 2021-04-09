public class bitsTest {
        public static int sumBits(byte value) {
            System.out.println(value); //пришло на вход десятичное число 65
            System.out.println(Integer.toBinaryString(value)); // из него выходит двоичное 1000001

            int sum = 0;
            for (int i = 0; i < 8; i++) {
                sum += (value >> i) & 1; //побитовая проверка "И", но где конвертация в двоичную систему?
            }
            return sum;}
public static void main(String[] args) {
    System.out.println(sumBits((byte) 0100101)); //2
    //System.out.println(sumBits((byte) 10100101)); //3
}
}

