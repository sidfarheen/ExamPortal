package com.exam.portal.exam.portal.controllers;


import com.exam.portal.exam.portal.models.Exam;
import com.exam.portal.exam.portal.services.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    IExamService examService;


    @PostMapping("/")
    public ResponseEntity<Exam> addExam(@RequestBody Exam exam){
        return ResponseEntity.ok(this.examService.addExam(exam));
    }

    @GetMapping("/{examId}")
    public ResponseEntity<Exam> getExam(@PathVariable("examId") Long examId){
            return ResponseEntity.ok(this.examService.getExam(examId));
    }

    @GetMapping("/")
    public ResponseEntity<?> getExams(){
        return ResponseEntity.ok(this.examService.getAllExams());
    }

    @PutMapping("/")
   public Exam updateExam(@RequestBody Exam exam){
        return this.examService.updateExam(exam);
   }

   @DeleteMapping("/{deleteId}")
   public void deleteExam(@PathVariable("deleteId") Long deleteId){
        this.examService.deleteExam(deleteId);
   }



}
