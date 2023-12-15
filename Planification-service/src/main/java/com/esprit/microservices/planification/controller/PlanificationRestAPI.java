package com.esprit.microservices.planification.controller;

import com.esprit.microservices.planification.entity.Planification;
import com.esprit.microservices.planification.service.PlanificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("planification")
public class PlanificationRestAPI {
    private String title="Hello,i'm the candidate Micro Service";
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;

    }
    @GetMapping("/getAllPlanifications")
    public List<Planification> getAllPlanifications(){
        List<Planification> listPlanifications = planificationService.getAllPlanification();
        return listPlanifications;
    }
    @GetMapping("/getPlanification/{IdPlanification}")
    public Planification getPlanification(@PathVariable("IdPlanification") int IdPlanification){
        return planificationService.getPlanification(IdPlanification);
    }

    @Autowired
    private PlanificationService planificationService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Planification> createPlanification(@RequestBody Planification planification) {
        return new ResponseEntity<>(planificationService.addPlanification(planification), HttpStatus.OK);
    }

    @PutMapping("/updatePlamification")
    public  Planification updateCours(@RequestBody Planification re){
        return  planificationService.updatePlanification(re);
    }



    @DeleteMapping("/deletepalnification/{id}")
    public void deletePlanification(@PathVariable(value ="id") int id) {
        planificationService.deletePlanification(id);
    }
}
