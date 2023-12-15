package com.adem.absencemics;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/absences")
@CrossOrigin(origins = "http://localhost:4200")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @GetMapping("/get")
    public List<Absence> getAllAbsences() {
        return absenceService.getAllAbsences();
    }



    @PostMapping("/add")
    public Absence createAbsence(@RequestBody Absence absence) {
        return absenceService.createAbsence(absence);
    }

    @GetMapping("/getAbsence/{id}")
    public Absence getAbsence(@PathVariable(value="id") long id) {
        return absenceService.getAbsence(id);
    }

    @PutMapping("/updateAbsence")
    public  Absence updateAbsence(@RequestBody Absence re){
        return  absenceService.updateAbsence(re);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteAbsence(@PathVariable(value ="id") long id) {
        absenceService.deleteAbsence(id);
    }
}


