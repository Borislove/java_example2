package ru.progwards.java1.lessons.classes;

//Реализовать класс Duck, потомок класса Animal, переопределяющий методы:
//        1.8 public AnimalKind getKind(), который возвращает DUCK.
//        1.9 public FoodKind getFoodKind(), который возвращает CORN
class Duck extends Animal {

    public Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind(){
        AnimalKind dfd = AnimalKind.DUCK;
        return  dfd;
    }

    @Override
    public FoodKind getFoodKind(){
        FoodKind eat = FoodKind.CORN;
        return eat;
    }

    public double getFoodCoeff(){
        return 0.04;
    }
}

