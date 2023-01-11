package com.example.LibraryManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepositry bookRepositry;

    public void createBook(Book book) throws Exception{

        //Validation part
        if(bookRepositry.findById(book.getId()).get() != null){

            throw new Exception("Book with same id already present in the library");

        }
        else{
            bookRepositry.save(book);
        }

    }

    public Book getBookById(Integer id) throws Exception{

        Book book = bookRepositry.findById(id).get();

        System.out.println(book.getName());

        return book;
    }
}
