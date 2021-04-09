public class plusString {

    public static void main(String[] args) {


        String s = "самолёт";
        int sLength = s.length();
        String print = "%0" + sLength + "d%n";
        System.out.printf(print, 0);
    }
}
