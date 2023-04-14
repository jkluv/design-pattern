package com.jkluv.iterator;

/**
 * @ClassName: Main
 * @Description:
 * @Author: jkluv
 * @Date: 2023-04-14 23:08
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
    
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("活着"));
        bookShelf.appendBook(new Book("骆驼祥子"));
        bookShelf.appendBook(new Book("1984"));
        bookShelf.appendBook(new Book("spring"));
    
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
        
    }
}
