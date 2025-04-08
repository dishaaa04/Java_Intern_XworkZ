package com.xworkz.casting;

public class SmartNovel extends Novel {

    @Override
    public void open() {
        System.out.println("Opening an e-novel with backlight on.");
    }

    public void manageBook(Book book) {
        System.out.println("Managing book...");

        book.open();
        book.pageCount();

        if (book instanceof Novel) {
            System.out.println("It's a Novel.");
            Novel novel = (Novel) book;
            novel.describePlot();
            novel.genre();
        }
    }
}
