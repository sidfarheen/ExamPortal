package com.exam.portal.exam.portal.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long studentID;

    @ManyToMany
    List<Exam> examsTaken;

    @OneToMany
    List<Result> results;
}
