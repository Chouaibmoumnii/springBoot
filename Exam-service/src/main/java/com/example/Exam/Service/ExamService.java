package com.example.Exam.Service;
import com.example.Exam.Entity.Examen;
import com.example.Exam.Repository.ExamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class ExamService implements IExamService {
    ExamRepository examRepository;
    @Override
    public List<Examen> getAllExam(){
        return (List<Examen>) examRepository.findAll();
    }
    @Override
    public Examen addExam(Examen examen){
        return examRepository.save(examen);
    }

    public Examen updateExam(Examen bl) {
        return examRepository.save(bl);
    }

    @Override
    public void deleteExam(Long idExam) {
        examRepository.deleteById(idExam);
    }
    @Override
    public Examen getExamById(Long idExam) {
        return examRepository.findById(idExam).get();
    }

}
