package com.exam.portal.exam.portal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name  = "question_type", discriminatorType =  DiscriminatorType.STRING)
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long examID;

    @OneToMany
    List<Question> questions;
}
