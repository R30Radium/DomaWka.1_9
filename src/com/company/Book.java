package com.company;

import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublishing;
    private Author author;

    public Book (String name, int yearOfPublishing, Author author){
        this.name = name;
        this.yearOfPublishing= yearOfPublishing;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }
    public int getYearOfPublication(){
        return this.yearOfPublishing;
    }
    public Author getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override

    public String toString() {
        return "Name: " + this.name + ". Year of publication: " + this.yearOfPublishing + " " + this.author + ".";
    }

    @Override

    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Book book = (Book) ob;
        return yearOfPublishing == book.yearOfPublishing && name.equals(book.name) && author.equals(book.author);
    }

    //hashCode())
    @Override

    public int hashCode() {
        return Objects.hash(name, yearOfPublishing, author);
    }

}