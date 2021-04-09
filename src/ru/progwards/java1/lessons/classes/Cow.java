package ru.progwards.java1.lessons.classes;

//Реализовать класс Cow, потомок класса Animal, переопределяющий методы:
//        1.4 public AnimalKind getKind(), который возвращает COW.
//        1.5 public FoodKind getFoodKind(), который возвращает HAY

class Cow extends Animal {

    public Cow(double weight) {
        super(weight);
    }


    @Override
    public AnimalKind getKind(){
        AnimalKind dfd = AnimalKind.COW;
        return  dfd;
    }

    @Override
    public FoodKind getFoodKind(){
        FoodKind eat = FoodKind.HAY;
        return eat;
    }


// 2.3 Для класса Cow, переопределить метод:
// public double getFoodCoeff(), который должен возвращать 0.05
    @Override
    public double getFoodCoeff(){
        return 0.05D;
    }
}
