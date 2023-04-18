class Animal 
{
    String name;
    int age;

    Animal(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    void sound() 
    {
     System.out.println("Meow");   // System.out.println("Woof!");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age); // calling parent class constructor
        this.breed = breed;
    }

    void display() {
        super.display(); // calling parent class method
        System.out.println("Breed: " + breed);
    }

   
    void sound() 
    {
        System.out.println("woof");
        // System.out.println("Woof!");
    }
    void animalSound() 
    {
        super.sound(); // calling parent class method
    }
}

public class lab5q4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Labrador");
        myDog.display(); // Output: Name: Buddy, Age: 3, Breed: Labrador
        myDog.sound(); // Output: Woof!
        myDog.animalSound(); // Output: Woof!
    }
}
