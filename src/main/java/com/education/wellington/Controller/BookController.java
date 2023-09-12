package com.education.wellington.Controller;

import com.education.wellington.Entity.Book;
import com.education.wellington.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("deleteBook/{id}")
    public String deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }
}
