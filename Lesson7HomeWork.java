/**
 * Java 1. Homework 7
 * 
 * @author Aleksandr
 * @version 07.02.2022
 */
 

class Lesson7HomeWork {
    public static void main (String[] args) {
        Cat[] cats = {
            new Cat("Murzic", 8), new Cat("Barsic", 12), new Cat("Vasily", 15)
        };
        Plate plate = new Plate(30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(45);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    public void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + ", appetite: " + appetite + ", fullness" + fullness;
    }
}

class Plate {
    private int food;

    Plate( int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    public void add(int food) {
            this.food += food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}