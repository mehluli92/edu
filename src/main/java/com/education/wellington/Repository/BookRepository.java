package com.education.wellington.Repository;

import com.education.wellington.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
