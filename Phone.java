//Abstract Classes and Final Methods in Java

abstract class Phone {
    
    // Final method - cannot be overridden
    public final void installOS() {
        System.out.println("Installing Android OS...");
    }

    // Abstract method - must be implemented by subclasses
    public abstract void assemblePhone();
}

class Samsung extends Phone {

    // Implementing the abstract method
    public void assemblePhone() {
        System.out.println("Assembling Samsung phone...");
        installOS(); // Calling the final method
    }
}

public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Samsung();
        myPhone.assemblePhone();
    }
}
