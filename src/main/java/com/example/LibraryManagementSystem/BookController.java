package com.example.LibraryManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add_book")
    public String addBook(@RequestBody() Book book){

        try{
            bookService.createBook(book);
            return "New book has been successfully added to library";
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/get_book")
    public Book getBook(@RequestParam()Integer id){

        try{
            Book book =  bookService.getBookById(id);
            return book;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
