/**
 * Java 1. Homework 5
 * 
 * @author Aleksandr
 * @version 29.01.2022
 */
 

class Lesson5HomeWork {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Sergey", "Project manager", "petrov@mailbox.com", "892712315", 65000, 41);
        persArray[2] = new Person("Orlov Denis", "Manager", "orlov@mailbox.com", "890511015", 37000, 39);
        persArray[3] = new Person("Belov Ivan", "Engineer", "belov@mailbox.com", "891311118", 35500, 42);
        persArray[4] = new Person("Volkov Aleksandr", "Director", "volkov@mailbox.com", "899921445", 60300, 40);
        for (Person person : persArray) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String post, String email, String phone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Person" + ": " + name + "," + post + "," + email + "," + phone + "," + salary + "," + age;
    }
}

