package com.example.library.Dao;

import java.util.List;

import com.example.library.Model.Book;

public interface BookDao {
    Book getBookId(Integer bookId);
    List<Book> getAllBooks();
    void updateBook(Integer bookId, Book book);
}
