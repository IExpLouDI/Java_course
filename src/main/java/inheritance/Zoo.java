package inheritance;

/**
 * Type vs Instance
 * an object can have superclass type
 * and a subclass instance
 *
 * Overridden Methods
 * a polymorphic object will execute
 * its overriding method at runtime
 */

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();

        Animal sasha = new Dog();
//        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
    }
}
