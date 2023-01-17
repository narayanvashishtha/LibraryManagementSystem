package com.example.LibraryManagementSystem.Service;


import com.example.LibraryManagementSystem.Enums.CardStatus;
import com.example.LibraryManagementSystem.Models.Card;
import com.example.LibraryManagementSystem.Models.Student;
import com.example.LibraryManagementSystem.Repository.StudentRepository;
import com.example.LibraryManagementSystem.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());

        Card newCard = new Card();

        newCard.setCardStatus(CardStatus.ACTICATED);

        newCard.setStudent(student);        //for new foreign key column in card table

        student.setCard(newCard);         //for bidirectional relationship

        studentRepository.save(student);        //card will be saved automatically

        return "New student added successfully";
    }
}
