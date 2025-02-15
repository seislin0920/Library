package com.example.library.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.library.Dao.BookDao;
import com.example.library.Model.Book;
import com.example.library.Service.BookService;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookId(Integer bookId) {
        return bookDao.getBookId(bookId);
    }

    @Override
    public List<Book> getAllBooks () {
        return bookDao.getAllBooks();
    }

    @Override
    public void updateBook(Integer bookId, Book book) {
        bookDao.updateBook(bookId, book);
    }
}
