package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Exam;
import com.exam.portal.exam.portal.repository.IExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExamServiceImpl implements  IExamService{

    @Autowired
    IExamRepository examRepository;

    @Override
    public Exam addExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam updateExam(Exam exam) {
        Exam updateExam =  examRepository.findById(exam.getExamID()).orElseThrow();
         return examRepository.save(updateExam);
    }

    @Override
    public void deleteExam(Long examId) {
        examRepository.deleteById(examId);
    }

    @Override
    public Exam getExam(Long examId) {
      return examRepository.findById(examId).orElseThrow();
    }

    @Override
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }
}
