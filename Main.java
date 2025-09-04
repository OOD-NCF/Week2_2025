// Base abstraction
interface Bird {
    void eat();
}

// Separate interface for flying capability
interface Flyable {
    void fly();
}

// A flying bird
class Sparrow implements Bird, Flyable {
    @Override
    public void eat() {
        System.out.println("Sparrow eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high!");
    }
}

// A non-flying bird
class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich pecking at the ground");
    }
}

public class Main {
    public static void main(String[] args) {
        // Work with all birds
        Bird b1 = new Sparrow();
        Bird b2 = new Ostrich();

        b1.eat();  //
        b2.eat();  //

        // Work only with flying birds
        Flyable f1 = new Sparrow();
        f1.fly();  //


    }
}
