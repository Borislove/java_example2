package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    public Hamster(double weight) {
        super(weight);
    }

//    Реализовать класс Hamster, потомок класса Animal, переопределяющий методы:
//            1.6  public AnimalKind getKind(), который возвращает HAMSTER.
//            1.7 public FoodKind getFoodKind(), который возвращает CORN

    @Override
    public AnimalKind getKind(){
        AnimalKind dfd = AnimalKind.HAMSTER;
        return  dfd;
    }

    @Override
    public FoodKind getFoodKind(){
        FoodKind eat = FoodKind.CORN;
        return eat;
    }

    @Override
    public double getFoodCoeff()
    {
        return 0.03D;
    }
}
