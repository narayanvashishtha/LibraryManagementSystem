package com.example.LibraryManagementSystem.ResponseDto;


import com.example.LibraryManagementSystem.Enums.Genre;
import lombok.Builder;

@Builder
public class BookResponseDto {

    String name;
    Genre genre;

}
