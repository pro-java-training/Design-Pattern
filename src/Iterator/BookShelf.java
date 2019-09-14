package Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {

    // 书架类, 作为集合使用
    private ArrayList<Book> books;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
