package com.example.library.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.library.Model.Book;
import com.example.library.Service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable Integer bookId) {
        Book book = bookService.getBookId(bookId);

        if (book != null) {
            return ResponseEntity.status(HttpStatus.OK).body(book);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
}
    
    @GetMapping("/booklist")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();

        if (!books.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(books);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer bookId, @RequestBody Book book) {
        // 檢查存在
        Book bookSt = bookService.getBookId(bookId);
        if (bookSt == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // 修改
        bookService.updateBook(bookId, book);
        Book updatedBook  = bookService.getBookId(bookId);
        
        return ResponseEntity.status(HttpStatus.OK).body(updatedBook);
    }
}
