package Book;

public class BookTest {
    public static void main(String[] args) {
        Book ob1 = new Book("Michael Michaelovich", "Privet", "12.12.1988");
        System.out.println(ob1.getAuthor());
        System.out.println(ob1.getTitle());
        System.out.println(ob1.getDate());
        ob1.setTitle("Zdarova");
        System.out.println(ob1.getTitle());
    }
}
