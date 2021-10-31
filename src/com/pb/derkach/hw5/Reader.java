package com.pb.derkach.hw5;

public class Reader {
    private String fio;
    private int numberB;
    private String fak;
    private String birthdate;
    private int tel;

    public Reader(String fio, int numberB, String fak, String birthdate, int tel) {
        this.fio = fio;
        this.numberB = numberB;
        this.fak = fak;
        this.birthdate = birthdate;
        this.tel = tel;
    }

    public String getFio() {
        return fio;
    }


    public int getNumberB() {
        return numberB;
    }

    public String getFak() {
        return fak;
    }


    public String getBirthdate() {
        return birthdate;
    }


    public int getTel() {
        return tel;
    }

    public void takeBook(int bookCounter) {
        System.out.println(fio + " взял " + bookCounter + " книгу(и)");
    }


    public void takeBook(String[] names) {
        String books = "";

        for (int i = 0; i < names.length; i++) {
            books += names[i];
            if ((i + 1) < names.length) books += ", ";
        }

        System.out.println(fio + " взял книги(у): " + books);
    }

    public void takeBook(Book[] books) {
        String booksStr = "";

        for (int i = 0; i < books.length; i++) {
            booksStr += books[i].getTitle() + "(" + books[i].getNameAv() + " " + books[i].getDate() + ")";
            if ((i + 1) < books.length) booksStr += ", ";
        }

        System.out.println(fio + " взял книги(у): " + booksStr);
    }

    public void returnBook(int bookCounter) {
        System.out.println(fio + " вернул " + bookCounter + " книгу(и)");
    }

    public void returnBook(String[] names) {
        String books = "";

        for (int i=0; i<names.length; i++) {
            books += names[i];
            if ((i+1)<names.length) books += ", ";
        }

        System.out.println(fio + " вернул книги(у): " + books);
    }

    public void returnBook(Book[] books) {
        String booksStr = "";

        for (int i=0; i<books.length; i++) {
            booksStr += books[i].getTitle() + "(" + books[i].getNameAv() + " " + books[i].getDate() + ")";
            if ((i+1)<books.length) booksStr += ", ";
        }

        System.out.println(fio + " вернул книги(у): " + booksStr);
    }


    }

