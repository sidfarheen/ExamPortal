package com.exam.portal.exam.portal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long resultID;

    @ManyToOne
    Long examID;

    int marks;
}
