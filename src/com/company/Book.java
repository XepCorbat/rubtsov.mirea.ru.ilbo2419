package com.company;

import java.lang.*;

public class Book {
    private String name;
    private String author;
    public Book(String n, String a){
        name = n;
        author = a;
    }
    public Book(String n){
        name = n;
        author ="";

    }
    public Book(){
        name = "Who to play raindow six siege";
        author = "";
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String toString(){
        return "name : " + this.name+", author: " + this.author;
    }

}
