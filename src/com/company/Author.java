package com.company;

import java.util.Objects;

public class Author {
    private String firstName;
    private String surname;

    public Author(String name, String surname) {
        this.firstName = name;
        this.surname = surname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public  void  setSurname(String surname) {
        this.surname = surname;
    }
    @Override

    public String toString() {
        return "Full author name: " + this.firstName + " " + this.surname;
    }

    @Override

    public boolean equals(Object ob) {
        if (this == ob) return true;

        if (ob == null || getClass() != ob.getClass()) return false;
        Author author = (Author) ob;
        return firstName.equals(author.firstName) && surname.equals(author.surname);
    }
    //
    @Override

    public int hashCode() {
        return Objects.hash(firstName, surname);
    }

}
