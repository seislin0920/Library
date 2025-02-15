package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Book;

public interface BookService {
    Book getBookId(Integer bookId);
    List<Book> getAllBooks();
    void updateBook(Integer bookId, Book book);
}
