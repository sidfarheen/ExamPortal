package com.exam.portal.exam.portal.controllers;


import com.exam.portal.exam.portal.models.Question;
import com.exam.portal.exam.portal.models.Result;
import com.exam.portal.exam.portal.services.IQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    IQuestionsService questionsService;

    @PostMapping("/")
    public ResponseEntity<Question>  addQuestion(@RequestBody Question question){
      return ResponseEntity.ok(
        this.questionsService.addQuestion(question));
    }

    @GetMapping("/{questionId}")
    public ResponseEntity<Question> getQuestion(@PathVariable("questionId") Long questionId){
        return ResponseEntity.ok(this.questionsService.getQuestion(questionId));
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllQuestions(){
        return ResponseEntity.ok(this.questionsService.getAllQuestions());
    }

    @DeleteMapping("/")
    public void deleteResult(@PathVariable("deleteId") Long deleteId){
        this.questionsService.deleteQuestion(deleteId);
    }

    @PutMapping("/")
    public Question updateQuestion(@RequestBody Question question){
        return this.questionsService.updateQuestion(question);
    }

}
