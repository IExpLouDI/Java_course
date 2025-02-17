package objects;

public class RecordClassTest {
    record Reactions(int id, String title, String type) {
        // Дополнительные методы (опционально)
        public void getReaction() {
            System.out.println("Reaction id: " + id + ";\n"
            + "Title: " + title + ";\n"
            + "Category: " + type + ".");
        }
    }

    public static void main(String[] args) {
        Reactions react = new Reactions(1, "Laught", "jok");
        react.getReaction();
    }
}
