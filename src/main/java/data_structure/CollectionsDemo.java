package data_structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
        listDemo();
    }

    public static void listDemo(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.add("apple");
        fruits.set(2, "grape");
        fruits.remove("lemon");
//        fruits.remove(3);

        System.out.println("Index 2: " + fruits.get(2));
        System.out.println("Index of grape: " + fruits.indexOf("grape"));
        System.out.println("Last index of lemon: " + fruits.lastIndexOf("apple"));

        System.out.println(fruits);

        List moreFruits = List.of("cherry", "plum"); //immutable

        System.out.println(moreFruits);

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
