package com.my.academicManagement.Service;

import com.my.academicManagement.dto.StudentDto;
import com.my.academicManagement.entity.Student;
import com.my.academicManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList.stream().map(x -> StudentDto.fromEntity(x)).toList();
    }
}