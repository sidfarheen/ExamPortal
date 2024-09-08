package com.exam.portal.exam.portal.models;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("MCQ")
public class MCQ extends Question{


    List<String> options;
}
