package edu.spring.hw11.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class Author {
    public int id;
    public String fName;
    public String lName;
    public Set<Book> book = new HashSet<>();

    Author(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

     void setBook(Book book1) {
        book.add(book1);
    }
}
