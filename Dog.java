//Final Methods cannot be overriden


class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public final void makeSound() {  // Final method in Dog
        System.out.println("Dog barks");
    }
}

// Puppy class trying to override final method (Will cause an error)
/*
class Puppy extends Dog {
    public void makeSound() {  //  Compilation Error: Cannot override final method
        System.out.println("Puppy whines");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();  // ✅ Allowed, prints "Dog barks"

        // Puppy p = new Puppy();  // Uncommenting this will cause a compilation error
        // p.makeSound();
    }
}
