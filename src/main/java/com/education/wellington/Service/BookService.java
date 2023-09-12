package com.education.wellington.Service;

import com.education.wellington.Entity.Book;
import com.education.wellington.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book updateBook(Book book){
        Book oldBook = bookRepository.findById(book.getId()).orElse(null);
        return bookRepository.save(book);
    }

    public String deleteBook(Long id){
        Book oldBook = bookRepository.findById(id).orElse(null);
        if (oldBook == null){
            return "Book does not exist";
        }
        String name = oldBook.getBookName();
        bookRepository.deleteById(id);
        return name + " Deleted with success";
    }
}
