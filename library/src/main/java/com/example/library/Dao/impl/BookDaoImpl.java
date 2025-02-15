package com.example.library.Dao.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.library.Dao.BookDao;
import com.example.library.Model.Book;
import com.example.library.Rowmapper.BookRowMapper;
@Component
public class BookDaoImpl implements BookDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Book getBookId(Integer bookId) {
        String sql = "SELECT id, isbn, title, author, introduction, store_date, borrowing_date, return_date, sta " +
                "FROM book WHERE id = :bookId";

        Map<String, Object> map = new HashMap<>();
        map.put("bookId", bookId);

        List<Book> bookList = namedParameterJdbcTemplate.query(sql, map, new BookRowMapper());

        if (bookList.size() > 0) {
            return bookList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT id, isbn, title, author, introduction, store_date, borrowing_date, return_date, sta " +
                "FROM book";

        List<Book> bookList = namedParameterJdbcTemplate.query(sql,  new BookRowMapper());

        return bookList.isEmpty() ? Collections.emptyList() : bookList;
    }


    @Override
    public void updateBook(Integer bookId, Book book){
    String sql = "UPDATE book SET borrowing_date = :borrowingDate, return_date = :returnDate, sta = :status" +
        " WHERE id = :bookId ";

    Map<String, Object> map = new HashMap<>();
    map.put("bookId", bookId);

    map.put("borrowingDate", book.getBorrowingDate());
    map.put("returnDate", book.getReturnDate());
    map.put("status", book.getStatus());

    namedParameterJdbcTemplate.update(sql, map);
    }
}
