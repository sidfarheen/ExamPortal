package com.exam.portal.exam.portal.repository;


import com.exam.portal.exam.portal.models.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResultRepository extends JpaRepository<Result, Long> {
}
