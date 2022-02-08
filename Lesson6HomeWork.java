/**
 * Java 1. Homework 6
 * 
 * @author Aleksandr
 * @version 02.02.2022 - 05.02.2022
 */
 

class Lesson6HomeWork {

    public static void main (String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal  animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + "won't be able to swim";
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;

    Animal (int runLimit, int swimLimit) { //Конструктор
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " won't be able to run " + distance;
        } else {
            return className + " will be able to run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " won't be able to swim " + distance;
        } else {
            return className + " will be able to swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + " runLimit " + runLimit + " , " + " swimLimit " + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}