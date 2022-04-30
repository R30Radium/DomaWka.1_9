package com.company;
//коммент для коммита

public class Main {

    public static void main(String[] args) {

        Author authorJacob = new Author("Jacob", "Fine");
        Book book1 = new Book("Programming on Java",2011, authorJacob);
        System.out.println(book1.getName());
        Author authorErica = new Author("Erica", "Leonard");
        Book book2 = new Book("50 shades of Grey", 2012,authorErica);
        System.out.println(book2.getName());
    }
}