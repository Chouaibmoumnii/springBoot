package com.example.Exam.Repository;

import com.example.Exam.Entity.Examen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends CrudRepository<Examen,Long> {

}
