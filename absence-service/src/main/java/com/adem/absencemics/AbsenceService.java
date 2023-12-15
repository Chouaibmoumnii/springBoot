package com.adem.absencemics;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbsenceService implements IAbsenceService{

    @Autowired
    private  AbsenceRepository absenceRepository;



    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    public Absence createAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    public Absence getAbsence(Long id) {
        return absenceRepository.findById(id).orElse(null);
    }



    public Absence updateAbsence(Absence bl) {
        return absenceRepository.save(bl);
    }



    public void deleteAbsence(long id) {
        absenceRepository.deleteById(id);
    }
}


