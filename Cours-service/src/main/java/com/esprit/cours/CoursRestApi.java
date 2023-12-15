package com.esprit.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("cours")

public class CoursRestApi {


    @Autowired
    private CoursService coursService ;

    @GetMapping("/search/CoursByTitre")
    public ResponseEntity<Page<Cours>> searchCandidatByNom(@RequestParam("titre") String titre, Pageable pageable) {
        Page<Cours> result = coursService.findCoursByTitre(titre, pageable);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/add" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cours> createCours(@RequestBody Cours cours) {
        return new ResponseEntity<>(coursService.addCours(cours), HttpStatus.OK);
    }


    @PutMapping("/updateCours")
    public  Cours updateCours(@RequestBody Cours re){
        return  coursService.updateCours(re);
    }
    @GetMapping("/getcours/{id}")
    public Cours getCoursById(@PathVariable(value="id") int id) {
        return (Cours) coursService.retrieveCours(id);
    }


    @DeleteMapping("/deletecours/{id}")
    public void deleteCours(@PathVariable(value ="id") int id) {
        coursService.deleteCours(id);
    }

    @GetMapping("/getCours")
    public List<Cours> getAllCours() {
        return coursService.findAllCours();
    }
}
