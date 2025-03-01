package data_structure;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
    }
    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println(fruits);

        fruits.remove("apple");

        System.out.println("Contains apple? " + fruits.contains("apple"));

        System.out.println("Size: " + fruits.size());

        Set moreFruit = Set.of("pera", "raisin", "cherry");
//        moreFruit.add("cranberry"); // can't do this becaust Set.of makes immutable set
        System.out.println(moreFruit);

    }
}
