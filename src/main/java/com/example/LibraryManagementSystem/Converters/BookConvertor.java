package com.example.LibraryManagementSystem.Converters;

import com.example.LibraryManagementSystem.Models.Book;
import com.example.LibraryManagementSystem.RequestDto.BookRequestDto;

public class BookConvertor {

    public static Book convertDtoToEntity(BookRequestDto bookRequestDto) {

        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()).build();

        return book;
    }
}
