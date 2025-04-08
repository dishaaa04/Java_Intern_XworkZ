package com.xworkz.casting;

public class BookRunner {

    public static void main(String[] args) {

        Book book = new Novel();
        book.open();
        book.close();
        book.genre();
        book.pageCount();

        System.out.println("----");

        Novel novel = new Novel();
        novel.open();
        novel.describePlot();
        novel.genre();
        novel.close();

        System.out.println("----");

        SmartNovel smart = new SmartNovel();
        smart.open();
        smart.describePlot();
        smart.genre();

        System.out.println("----");

        smart.manageBook(new Novel());
    }
}
