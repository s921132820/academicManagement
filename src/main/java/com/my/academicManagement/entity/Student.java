package com.my.academicManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentNo;
    @Column(length = 10, nullable = false)
    private String name;
    @Column(length = 15)
    private String phone;
    @Enumerated(EnumType.ORDINAL) // gender를 0, 1로 저장, 남성0, 여성1
    private Gender gender;
    @Column(length = 20)
    private String address;
}
