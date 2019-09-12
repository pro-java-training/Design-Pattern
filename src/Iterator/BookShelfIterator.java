package Iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;     // bookShelf 是迭代器器要迭代的集合

    private int index; // 迭代器指向的位置

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++; // 迭代器向后移动
        return book;
    }
}
