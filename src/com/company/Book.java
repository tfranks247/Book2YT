package com.company;

public class Book {
    // private variables

    private String _title;
    private String _author;
    private String _publisher;
    private String _copyright;

    //constructor
    public Book (String title, String author, String publisher, String copyright){

        _title = title;
        _author = author;
        _publisher = publisher;
        _copyright = copyright;

    }

    // getters

    public String get_title() {
        return _title;
    }

    public String get_author() {
        return _author;
    }

    public String get_publisher() {
        return _publisher;
    }

    public String get_copyright() {
        return _copyright;
    }

    //  setters

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public void set_publisher(String _publisher) {
        this._publisher = _publisher;
    }

    public void set_copyright(String _copyright) {
        this._copyright = _copyright;
    }

    public String toString(){
        return "Title: " + _title + "\n" + "Author: " + _author + "\n" + "Publisher : " + _publisher + "\nCopyright: " + _copyright + "\n\n";
    }
}
