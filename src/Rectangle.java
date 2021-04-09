//    реализуйте метод compareTo с сигнатурой
//    public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
//    При сравнении a.compareTo(b) метод должен возвращать
//    a   > b : 1
//    a == b : 0
//    a   < b : -1
//
//    Например
//    прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
//    прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
//    прямоугольник 2x2  <  прямоугольника 3x3 - результат -1
public class Rectangle {
    private double a;
    private double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double area() {
            return a * b;
        }

    public int compareTo(Rectangle anRectangle){

        System.out.println(anRectangle.a);
        System.out.println(anRectangle.b);

        System.out.println(this.a);
        System.out.println(this.b);




        if ((a * b) > (anRectangle.a * anRectangle.b)) {
                return 1;
            } else if ((a * b) == (anRectangle.b * anRectangle.a)) {
                return 0;
            } else {
                return -1;
            }
        }

    public static void main(String[] args) {
//        Rectangle df = new Rectangle(2,3);
//        double sdsd = df.area();
//        Rectangle dff = new Rectangle(3,2);
//        double sdsddf = dff.area();
//
//        Rectangle sdsdssdd = new Rectangle(sdsd, sdsddf);
//        int dddddddsdf = Rectangle.compareTo(sdsdssdd);
        System.out.println(new Rectangle(3,3).compareTo(new Rectangle(2, 2)));
    }
}
