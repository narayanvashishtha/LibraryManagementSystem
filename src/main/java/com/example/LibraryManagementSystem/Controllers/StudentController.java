package com.example.LibraryManagementSystem.Controllers;


import com.example.LibraryManagementSystem.Models.Student;
import com.example.LibraryManagementSystem.RequestDto.StudentRequestDto;
import com.example.LibraryManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDto studentRequestDto){

        String result = studentService.createStudent(studentRequestDto);

        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
