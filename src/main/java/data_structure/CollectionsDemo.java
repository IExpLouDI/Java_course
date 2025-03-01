package data_structure;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }
    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95.3);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 129);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 70);
        fruitCalories.remove("lemon");

        System.out.println(fruitCalories);
        System.out.println("Banana calories: " + fruitCalories.get("banana"));
        System.out.println("Contains orange: " + fruitCalories.containsKey("orange"));
        System.out.println(fruitCalories.keySet());

        Map immutableFruitCalories = Map.of(
                "apple", 99,
                "lemon", 22
        );
        System.out.println(immutableFruitCalories);
    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removed = fruits.remove();
        System.out.println("Removed: " + removed);
        System.out.println("Head of queue: " + fruits.peek());

        System.out.println(fruits);
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
