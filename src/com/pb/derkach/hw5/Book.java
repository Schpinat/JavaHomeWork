package com.pb.derkach.hw5;

public class Book {
    private String title;
    private String nameAv;
    private int date;
public Book (String title, String nameAv, int date) {
    this.title = title;
    this.nameAv = nameAv;
    this.date = date;

}
    public String getTitle () {
        return title;
    }


    public String getNameAv () {
        return nameAv;
    }


    public int getDate   () {
        return date;
    }

}
