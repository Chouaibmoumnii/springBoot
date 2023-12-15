package com.example.reclamation.Reclamation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReclamationService implements IReclamtionservice{


    @Autowired
    private ReclamationRepository reclamationRepository;


    private IReclamtionservice iReclamtionservice ;

    public List<Reclamation> findAllreclamation() {
        return reclamationRepository.findAll();
    }


    public Reclamation addReclamtion(Reclamation re) {
        return reclamationRepository.save(re);
    }


    public Reclamation updateReclamtion(Reclamation bl) {
        return reclamationRepository.save(bl);
    }


    public Reclamation retrieveReclamtion(long idReclamtion) {
        return reclamationRepository.findById( idReclamtion).orElse(null);
    }


    public void deleteReclamtion(long idReclamtion) {
        reclamationRepository.deleteById(idReclamtion);
    }


}



