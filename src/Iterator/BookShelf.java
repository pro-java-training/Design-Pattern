package Iterator;

public class BookShelf implements Aggregate {

    // 书架类, 作为集合使用
    private Book[] books;

    private int length = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[length] = book;
        length++;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
