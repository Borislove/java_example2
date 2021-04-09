package ru.progwards.java1.lessons.classes;


//Реализовать класс Animal, содержащий:
//        1.0 Реализовать конструктор
//public Animal(double weight), который сохраняет вес животного.



//        1.1 Метод:
//public AnimalKind getKind(), который возвращает вид животного (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK).
// В данном классе вернуть ANIMAL
//
//
//        1.2 Метод
//public FoodKind getFoodKind(), который возвращает вид еды, (enum FoodKind - UNKNOWN, HAY, CORN). В данном классе вернуть UNKNOWN
//
//
//        1.3 Метод
//public String toString(), который возвращает информацию о животном в формате:
//        I am <AnimalKind>, eat <FoodKind>


//2.1 В классе Animal реализовать метод:
//public double getWeight(), который возвращает вес животного
//        2.2 Реализовать метод
//public double getFoodCoeff(), который возвращает коэффициент веса еды к весу тела животного. Для класса Animal это 0.02

class Animal {
public double weight;


    enum AnimalKind
    {    ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }


    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }

    public Animal(double weight){
        this.weight = weight;
    }

    public AnimalKind getKind(){
        AnimalKind dfd = AnimalKind.ANIMAL;
      return  dfd;
    }

    public FoodKind getFoodKind(){
        FoodKind eat = FoodKind.UNKNOWN;
        return eat;
    }


    public String toString()
    {
        return "I am " + getKind() + ", eat " +  getFoodKind();
    }

    public double getWeight()
    {
        return weight;

    }

    public double getFoodCoeff()
    {
        return 0.02D;
    }

    public double calculateFoodWeight()
    {
        double weightEatAnimal = getWeight() * getFoodCoeff();
        return weightEatAnimal;
    }

    public String toStringFull()
    {
      return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

}
