package com.example.library.Rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.library.Model.Book;

public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException{
        Book book = new Book();

        book.setBookId(resultSet.getInt("id"));
        book.setIsbn(resultSet.getString("isbn"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setIntroduction(resultSet.getString("introduction"));
        book.setStoreDate(resultSet.getTimestamp("store_date"));
        book.setBorrowingDate(resultSet.getTimestamp("borrowing_date"));
        book.setReturnDate(resultSet.getTimestamp("return_date"));
        book.setStatus(resultSet.getInt("sta"));

        return book;
    }
}
