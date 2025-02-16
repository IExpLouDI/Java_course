package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(5);
        room1.setWidth(3);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(3, 3.33);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both: " + totalArea);
    }
}
