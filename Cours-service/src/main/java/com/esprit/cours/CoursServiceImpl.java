package com.esprit.cours;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService{
    private final CoursRepository coursRepository ;

    public CoursServiceImpl(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public Page<Cours> findCoursByTitre(String titre, Pageable pageable) {
        return coursRepository.CoursByTitre(titre, pageable);
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }
    @Override
    public Cours updateCours(Cours bl) {
        return coursRepository.save(bl);
    }

    @Override
    public Cours retrieveCours(int id) {
        return coursRepository.findById( id).orElse(null);
    }


    @Override
    public String deleteCours(int id) {
        if (coursRepository.findById(id).isPresent()) {
            coursRepository.deleteById(id);
            return "cours supprimé";
        } else
            return "cours non supprimé";
    }

    @Override
    public List<Cours> findAllCours() {
        return coursRepository.findAll();
    }


}
