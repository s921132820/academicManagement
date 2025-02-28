package com.my.academicManagement.dto;

import com.my.academicManagement.entity.Gender;
import com.my.academicManagement.entity.Student;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class StudentDto {
    private Long studentNo;
    private String name;
    private String phone;
    private Gender gender;
    private String address;

    // Entity -> DTO
    public static StudentDto fromEntity(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.studentNo = student.getStudentNo();
        studentDto.name = student.getName();
        studentDto.phone = student.getPhone();
        studentDto.gender = student.getGender();
        studentDto.address =student.getAddress();
        return studentDto;
    }

    // DTO -> Entity
    public static Student fromDto(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentNo(studentDto.getStudentNo());
        student.setName(studentDto.getName());
        student.setPhone(studentDto.getPhone());
        student.setGender(studentDto.getGender());
        student.setAddress(studentDto.getAddress());
        return student;
    }
}