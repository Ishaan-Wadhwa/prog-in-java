// Defining an interface
interface Animal {
    public void makeSound();
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark bark!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow meow!");
    }
}

public class lab5q5 {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Creating object of Dog class
        myAnimal.makeSound(); // Output: Bark bark!

        myAnimal = new Cat(); // Creating object of Cat class
        myAnimal.makeSound(); // Output: Meow meow!
    }
}
