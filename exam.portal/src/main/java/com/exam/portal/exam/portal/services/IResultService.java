package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.models.Result;

import java.util.List;

public interface IResultService {

    Result addResult(Result result);

    Result updateResult(Result result);

    void deleteResult(Long resultId);

    Result getResult(Long resultId);

    List<Result> getAllResults();


}
