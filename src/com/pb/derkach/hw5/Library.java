package com.pb.derkach.hw5;


public class Library {
    public static void main(String[] args) {

// Создаем массив книг
        Book[] book = new Book[3];
        book[0] = new Book("Приключения", "Тузиков А.В.", 2017);
        book[1] = new Book("Алфавит", "Незнайкин О.О.", 2001);
        book[2] = new Book("Секрет Америки", "Буш Дж.", 2005);
// Создаем массив читателей
        Reader[] reader = new Reader[3];
        reader[0] = new Reader("Иванов С.П.", 1, "ДПО", "01.02.1987", 501212021);
        reader[1] = new Reader("Петров О.О.", 2, "КФО", "11.04.1986", 501212032);
        reader[2] = new Reader("Сидоров Г.Г.", 3, "ЮКА", "15.12.1987", 501212043);
// Вычитываем перечень книг
        System.out.println("Перечень книг:");
        for (int i = 0; i < book.length; i++) {
            System.out.println((i + 1) + ". " + book[i].getTitle() + " (" + book[i].getNameAv() + ", " + book[i].getDate() + ")");
        }
// Вычитываем читателей
        System.out.println("Перечень читателей:");
        for (int i = 0; i < reader.length; i++) {
            System.out.println((i + 1) + ". ФИО: " + reader[i].getFio() + ", Номер читательского - " + reader[i].getNumberB() + ", факультет: " + reader[i].getFak() + ", телефон: " + reader[i].getTel());
        }

// Вызываем методы
        System.out.println("Вызываем методы:");
        String[] names = new String[2];
        names[0] = book[2].getTitle();
        names[1] = book[0].getTitle();
// Метод №1
        reader[0].takeBook(1);
        reader[0].returnBook(1);
        System.out.println("***********************************");
// Метод №2
        reader[1].takeBook(names);
        reader[1].returnBook(names);
        System.out.println("***********************************");
// Метод №3
        reader[2].takeBook(book);
        reader[2].returnBook(book);
        System.out.println("***********************************");

    }
}

