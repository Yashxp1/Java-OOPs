package OOPs;

//Create a Person class with properties name and age. Write a method to display the person's details.


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + "\nage: " + age);
    }
}

public class Car {
    public static void main(String[] args) {
        Person person1 = new Person("Rohan", 19);
        person1.displayInfo();

    }
}
