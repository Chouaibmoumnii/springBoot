package com.esprit.microservices.planification.repository;

import com.esprit.microservices.planification.entity.Planification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlanificationRepository extends JpaRepository<Planification,Integer> {
    @Query("select p from Planification p where p.NomEvent like :name")
    public Page<Planification> planificationByNom(@Param("name") String n, Pageable pageable);

}
