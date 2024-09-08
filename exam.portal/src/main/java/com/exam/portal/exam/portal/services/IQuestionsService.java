package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Question;

import java.util.List;

public interface IQuestionsService {

    Question addQuestion(Question question);

    Question updateQuestion(Question question);

    Question getQuestion(Long questionId);

    void deleteQuestion(Long questionId);

    List<Question> getAllQuestions();
}
