package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Result;
import com.exam.portal.exam.portal.repository.IResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements IResultService {

    @Autowired
    IResultRepository resultRepository;


    @Override
    public Result addResult(Result result) {
         return resultRepository.save(result);
    }

    @Override
    public Result updateResult(Result result) {
        Result updateResult = resultRepository.findById(result.getResultID()).orElseThrow();
        updateResult.setMarks(result.getMarks());
        return resultRepository.save(updateResult);
    }

    @Override
    public void deleteResult(Long resultId) {
        resultRepository.deleteById(resultId);
    }

    @Override
    public Result getResult(Long resultId) {
        return resultRepository.findById(resultId).orElseThrow();
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }
}
