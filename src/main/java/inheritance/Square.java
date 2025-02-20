package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
    /**
     * override перегружает метод родительского класса
     * Если анотация указана и название метода не соответствует
     * названию родительского класса - ошибка применения анотации
     * override
     */

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
