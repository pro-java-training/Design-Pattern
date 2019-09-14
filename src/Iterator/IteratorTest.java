package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ConcreteSet<Book> books = new ConcreteSet<Book>(4);
        books.add(new Book("C++"));
        books.add(new Book("Java"));
        books.add(new Book("C"));
        books.add(new Book("Python"));
        Iterator it = books.getIterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
