package interfaces;

public interface Product {
    /**
     * types of Methods in Interfaces
     * - abstract; - default; - static;
     *              Interfaces
     * - can't be instantiated;
     * - implemented by classes, extended by other interfaces;
     * - implementing non-abstract class must implement
     * all abstract methods;
     * - methods are public and abstract by default;
     * - default and static methods allowed.
     */
    String getName();
    void setName(String name);

    default double getPrice(){
        return 50;
    };
    default void setPrice(double price){

    };

}
