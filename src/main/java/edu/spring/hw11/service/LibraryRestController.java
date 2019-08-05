package edu.spring.hw11.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@AllArgsConstructor
@RestController
public class LibraryRestController {

    IPersonService iPersonService;

    @ResponseBody
    @GetMapping("/{id}")
    public List<Book> sortedBookByAuthor(@PathVariable("id") int id) {
        return iPersonService.sortedBookByAuthor(id);
    }

    @ResponseBody
    @GetMapping("/{genre}/get")
    public List<Book> sortedBookByGenre(@PathVariable("genre") String genre) {
        return iPersonService.sortedBookByGenre(genre);
    }

    @ResponseBody
    @PostMapping("/author")
    public List<Author> addAuthor(
            @RequestParam(value = "authorId") int authorId,
            @RequestParam(value = "authorFName") String authorFName,
            @RequestParam(value = "authorLName") String authorLName
    ) {
        return iPersonService.addAuthor(authorId, authorFName, authorLName);
    }

    @ResponseBody
    @PostMapping("/book")
    public List<Book> addBook(
            @RequestParam(value = "bookId") int bookId,
            @RequestParam(value = "bookTitle") String bookTitle,
            @RequestParam(value = "bookGenre") String bookGenre,
            @RequestParam(value = "bookDesc") String bookDesc,
            @RequestParam(value = "bookRate") int bookRate
    ) {
        return iPersonService.addBook(bookId, bookTitle, bookGenre, bookDesc, bookRate);
    }


    @ResponseBody
    @PutMapping("/author/book")
    public Map<Integer, Book> addBookToAuthor(
            @RequestParam(value = "authorId") int authorId,
            @RequestParam(value = "bookId") int bookId,
            @RequestParam(value = "bookTitle") String bookTitle,
            @RequestParam(value = "bookGenre") String bookGenre,
            @RequestParam(value = "bookDesc") String bookDesc,
            @RequestParam(value = "bookRate") int bookRate
    ) {
        Map<Integer, Book> map = new LinkedHashMap<>();
        Book book1 = new Book(bookId, bookTitle, bookGenre, bookDesc, bookRate);
        iPersonService.addBookToAuthor(authorId, book1);
        map.put(authorId, book1);
        return map;
    }

    @ResponseBody
    @DeleteMapping("/author/{id}")
    public List<Author> deleteAuthor(@PathVariable("id") int authorId) {
        return iPersonService.deleteAuthor(authorId);
    }

    @ResponseBody
    @DeleteMapping("/book/{id}")
    public List<Book> deleteBook(@PathVariable("id") int bookId) {
        return iPersonService.deleteBook(bookId);
    }

    @ResponseBody
    @PatchMapping("author/{id}")
    public Author updateAuthor(@RequestParam("id") int updateId, @PathVariable("id") int id) {
        return iPersonService.updateAuthor(id, updateId);
    }

    @ResponseBody
    @PatchMapping("book/{id}")
    public Book updateBook(@RequestParam("id") int updateId, @PathVariable("id") int id) {
        return iPersonService.updateBook(id, updateId);
    }
}


