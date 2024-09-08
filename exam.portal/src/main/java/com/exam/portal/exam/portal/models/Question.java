package com.exam.portal.exam.portal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long questionID;

    String question;

    String correctAnswer;


}
