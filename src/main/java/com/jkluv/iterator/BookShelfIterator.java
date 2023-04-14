package com.jkluv.iterator;

/**
 * @ClassName: BookShelfIterator
 * @Description: 遍历书架
 * 由于BookShelfIterator需要发挥Iterator的作用，所以它实现了Iterator接口
 * @Author: jkluv
 * @Date: 2023-04-14 22:58
 * @Version: 1.0
 */
public class BookShelfIterator implements Iterator {
    
    private BookShelf bookShelf;
    
    private int index;
    
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    
    /**
     * 判断书架中还有没有下一本书
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }
    
    /**
     * 会返回迭代器当前所指向的书，并让迭代器指向下一本书
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
