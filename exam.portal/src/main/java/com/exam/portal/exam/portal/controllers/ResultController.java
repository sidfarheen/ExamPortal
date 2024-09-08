package com.exam.portal.exam.portal.controllers;


import com.exam.portal.exam.portal.models.Result;
import com.exam.portal.exam.portal.services.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResultController {

    @Autowired
    IResultService resultService;


    @PostMapping("/")
    public ResponseEntity<Result> addResult(@RequestBody Result result){
        return ResponseEntity.ok(this.resultService.addResult(result));
    }


    @GetMapping("/{resultId}")
    public ResponseEntity<Result> getResult(@PathVariable("examId") Long resultId){
        return ResponseEntity.ok(this.resultService.getResult(resultId));
    }

    @GetMapping("/")
    public ResponseEntity<?>  getResults(){
        return ResponseEntity.ok(this.resultService.getAllResults());
    }

    @PutMapping("/")
    public Result updateResult(@RequestBody Result result){
        return this.resultService.updateResult(result);
    }

    @DeleteMapping("/deleteId")
    public void deleteResult(@PathVariable Long resultId){
        this.resultService.deleteResult(resultId);
    }

}
