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
        feed(rocky);
        Animal sasha = new Dog();
//        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
//        ((Cat)sasha).scratch();
        
    }
    
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }
}
