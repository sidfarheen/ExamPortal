package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Exam;

import java.util.List;

public interface IExamService {

    Exam addExam(Exam exam);

    Exam updateExam(Exam exam);

    void deleteExam(Long examId);

    Exam getExam(Long examId);

    List<Exam> getAllExams();
}
