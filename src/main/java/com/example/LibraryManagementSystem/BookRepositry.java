package com.example.LibraryManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositry extends JpaRepository<Book, Integer> {

}
