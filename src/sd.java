import java.util.Arrays;

public class sd {
    public static void main(String[] args) {
        System.out.println("2");

        int[] a1 = {12, 5, 0, 58, 36};
        int[] a2 = Arrays.copyOf(a1, a1.length);
        a2[2] = 0;
        System.out.println(Arrays.equals(a1, a2));
    }

}
