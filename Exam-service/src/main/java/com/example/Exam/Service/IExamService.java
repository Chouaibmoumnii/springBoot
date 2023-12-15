package com.example.Exam.Service;

import com.example.Exam.Entity.Examen;

import java.util.List;

public interface IExamService {
    List<Examen> getAllExam();

    Examen addExam(Examen examen);

    Examen getExamById(Long idExam);

    Examen updateExam(Examen examen);

    void deleteExam(Long idExam);

}
