package com.company;

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

}