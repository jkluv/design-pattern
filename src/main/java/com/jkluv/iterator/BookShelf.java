package com.jkluv.iterator;

/**
 * @ClassName: BookShelf
 * @Description: 表示书架的类
 * 由于需要将此类作为集合进行处理，因此它实现了Aggregate接口
 * @Author: jkluv
 * @Date: 2023-04-14 22:35
 * @Version: 1.0
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    
    private int last = 0;
    
    public BookShelf(int max) {
        this.books = new Book[max];
    }
    
    public Book getBookAt(int index) {
        return books[index];
    }
    
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    
    public int getLength() {
        return last;
    }
    
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
