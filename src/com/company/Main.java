package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book1, book2, book3;

        book1 = new Book ("Programming in Java", "James S.", "Jim's Publishing", "4/4/33");
        book2 = new Book ("S in Java", "Phil S.", "T Publishing", "4/48/89");
        book3 = new Book ("D in Java", "Pat S.", "G Publishing", "4/4/90");

        //we are able to override the constructor this way
        book3.set_title("Programming in C++");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
