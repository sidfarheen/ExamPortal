package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Question;
import com.exam.portal.exam.portal.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionsService {

    @Autowired
    IQuestionRepository questionRepository;
    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        Question updateQuestion = questionRepository.findById(question.getQuestionID()).orElseThrow();
        updateQuestion.setQuestion(question.getQuestion());
        updateQuestion.setCorrectAnswer(question.getCorrectAnswer());
        return questionRepository.save(updateQuestion);
    }


    @Override
    public Question getQuestion(Long questionId) {
        return questionRepository.findById(questionId).get();
    }

    @Override
    public void deleteQuestion(Long questionId) {
        questionRepository.deleteById(questionId);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
