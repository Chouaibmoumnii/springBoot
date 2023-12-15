package com.example.Exam.Controller;

import com.example.Exam.Entity.Examen;
import com.example.Exam.Service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/examen") // Ajoutez un chemin de base pour le contrôleur
@CrossOrigin(origins = "http://localhost:4200")

public class ExamController {

@Autowired
    IExamService examService; // Utilisez l'interface, pas l'implémentation

    @GetMapping("/getAllExam")
    public List<Examen> getAllExam() {
        return examService.getAllExam();
    }

    @GetMapping("/getExam/{idExam}")
    public Examen getExamById(@PathVariable("idExam") long idExam) {
        return examService.getExamById(idExam);
    }

    @PostMapping("/addExam")
    public Examen addExam(@RequestBody Examen e) {
        return examService.addExam(e);
    }

    @PutMapping("/updateExam")
    public Examen updateExam(@RequestBody Examen e) {
        return examService.updateExam(e);
    }

    @DeleteMapping("/deleteExam/{idExam}")
    public void deleteExam(@PathVariable("idExam") long idExam) {
        examService.deleteExam(idExam);
    }
}
