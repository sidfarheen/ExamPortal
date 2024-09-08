package com.exam.portal.exam.portal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long teacherID;

    @OneToMany
    List<Exam> examConducted;
}
