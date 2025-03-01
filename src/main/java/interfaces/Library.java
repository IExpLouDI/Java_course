package interfaces;

public class Library {
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Harry Pitters");
        System.out.println(book.getName());
    }
}
