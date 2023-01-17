package com.example.LibraryManagementSystem.RequestDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthorRequestDto {

    private String name;

    private int age;

    private String country;

    @Column(unique = true)
    private String email;
}
