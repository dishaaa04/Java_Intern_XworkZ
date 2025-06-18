package com.xworkz.proj.dto;

public class BookStoreDTO {
    private String name;
    private Double mobilenumber;
    private String email;
    private int bookid;

    public BookStoreDTO(String name, Double mobilenumber, String email, int bookid) {
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(Double mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
}
