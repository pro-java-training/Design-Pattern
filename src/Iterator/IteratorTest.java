package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("C++"));
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("Python"));
        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
