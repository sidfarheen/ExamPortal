package com.exam.portal.exam.portal.repository;


import com.exam.portal.exam.portal.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExamRepository  extends JpaRepository<Exam,Long> {
}
