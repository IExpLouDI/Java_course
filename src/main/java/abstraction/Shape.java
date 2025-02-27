package abstraction;

public abstract sealed class Shape  permits Rectangle{
    /**
     * - abstract classes and methods are templates
     * - declare using abstact reserved word
     * - subclasses must implement inherited abstract methods
     * - abstract classes can't be instantiated
     */
    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
