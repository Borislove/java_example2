//Создайте класс Person, содержащий
//        приватную переменную String name;
//        приватную переменную int age;
//        приватную переменную String country;
//        конструктор по умолчанию, устанавливающий country = "RU";
//        конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию, и устанавливающий значения переменным name и age из соответствующих параметров;
//        публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения соответствующих переменных
    public class Person {
        private String name;
        private int age;
        private String country;

        Person() {
            country  = "RU";
        }

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public String getCountry()
        {
            return country;
        }



    public static void main(String[] args) {
        Person person = new Person("s",2 );
        Person agee = new Person("LUIAS", 3);
        System.out.println("" + agee.getName() +  "  " +  agee.getAge() + "  " + agee.getCountry() );
    }
    }




