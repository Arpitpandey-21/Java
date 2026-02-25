// Base class
class Animal {
    String name;

    void makeSound() {
        System.out.println("Some sound...");
    }
}

// Subclass
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();   // Create Dog object
        d.name = "Tommy";    // Set name
        
        d.makeSound();       // Call overridden method
        System.out.println("Dog's Name: " + d.name);  // Print name
    }
}