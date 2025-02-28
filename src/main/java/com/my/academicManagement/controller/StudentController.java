package com.my.academicManagement.controller;

import com.my.academicManagement.Service.StudentService;
import com.my.academicManagement.dto.StudentDto;
import com.my.academicManagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("student_list")
    public String studentListView(Model model) {
        List<StudentDto> studentList = studentService.getAllStudents();
        model.addAttribute("students", studentList);
        return "student/student_list";
    }
}
