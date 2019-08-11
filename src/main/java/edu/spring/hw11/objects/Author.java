package edu.spring.hw11.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class Author {
    private int id;
    private String fName;
    private String lName;
    private Set<Book> book = new HashSet<>();

    public Author(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

     public void setBook(Book book1) {
        book.add(book1);
    }
}
