package com.esprit.microservices.planification.service;

import com.esprit.microservices.planification.entity.Planification;
import com.esprit.microservices.planification.repository.PlanificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanificationService {
    @Autowired
    private PlanificationRepository planificationRepository;
    public Planification addPlanification(Planification planification) {
        return planificationRepository.save(planification);
    }
    public List<Planification> getAllPlanification() {
        return planificationRepository.findAll();
    }
    public Planification getPlanification (int idPlanification){
        return planificationRepository.findById(idPlanification).get();
    }

    public Planification updatePlanification(Planification bl) {
        return planificationRepository.save(bl);
    }

    public String deletePlanification(int id) {
        if (planificationRepository.findById(id).isPresent()) {
            planificationRepository.deleteById(id);
            return "Planification supprimé";
        } else
            return "Planification non supprimé";
    }
}
