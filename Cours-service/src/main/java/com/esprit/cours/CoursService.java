package com.esprit.cours;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CoursService {
    Page<Cours> findCoursByTitre(String titre, Pageable pageable);
    public Cours addCours(Cours cours) ;

    Cours updateCours(Cours bl);

    Cours retrieveCours(int id);

    public String deleteCours(int id) ;
    List<Cours> findAllCours();
}
