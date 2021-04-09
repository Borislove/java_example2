//Создайте класс Person, содержащий
//
//        приватную переменную String name;
//        приватную переменную int age;
//        приватную переменную String country;
//
//        конструктор по умолчанию, устанавливающий country = "RU";
//        конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию,
//        и устанавливающий значения переменным name и age из соответствующих параметров;
//
//        публичные функции String getName(), int getAge(), String getCountry(),
//        возвращающие значения соответствующих переменных
public class person2 {

    private  String name;
    private  int age;
    private  String country = "RU";

    public person2(){
        country = "RU";
    }

    public person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

    public static void main(String[] args) {
        System.out.println(new person2("ssdsds" , 36).name + "  " +
                new person2("Alex" , 38).age + "   " +
                new person2().getCountry());
    }
}
