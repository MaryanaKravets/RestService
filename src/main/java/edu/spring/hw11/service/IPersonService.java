package edu.spring.hw11.service;

import java.util.List;

public interface IPersonService {

    List<Author> addAuthor(int id, String fName, String lName);

    List<Author> deleteAuthor(int id);

    List<Book> addBook(int id, String title, String genre, String description, int rate);

    List<Book> deleteBook(int id);

    void addBookToAuthor(int authorId, Book book);

    List<Book> sortedBookByAuthor(int authorId);

    List<Book> sortedBookByGenre(String genre);

    Book updateBook(int bookId, int updateBookId);

    Author updateAuthor(int authorId, int updateAuthorId);
}
