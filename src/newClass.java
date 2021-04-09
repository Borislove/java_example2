public class newClass {
    private String nameCar;
    private String colorCar;

    newClass(String nameCar, String colorCar ){
        this.nameCar = nameCar;
        this.colorCar = colorCar;
    }

    static String methodNoThisClassName(){
        return "This static method ";
    }

    public static void main(String[] args) {
        System.out.println(methodNoThisClassName());
    }
}
