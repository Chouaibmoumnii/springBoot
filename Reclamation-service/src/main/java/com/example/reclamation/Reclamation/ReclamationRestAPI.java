package com.example.reclamation.Reclamation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reclamation")
@CrossOrigin(origins = "http://localhost:4200")
public class ReclamationRestAPI {


    @Autowired
    ReclamationRepository reclamationRepository;

    @Autowired
    private ReclamationService reclamationService;
    private IReclamtionservice iReclamtionservice ;

    @GetMapping("/retrieveAllReclamtion")
    public List<Reclamation> retrieveAllBloc(){
        return reclamationService.findAllreclamation();
    }

    @PostMapping("/AddReclamation")
    public  Reclamation addReclamation(@RequestBody Reclamation re){
        return  reclamationService.addReclamtion(re);
    }
    @PutMapping("/updateReclamation")
    public  Reclamation updateReclamation(@RequestBody Reclamation re){
        return  reclamationService.updateReclamtion(re);
    }
    @GetMapping("/retrieveReclamation/{idReclamation}")
    public Reclamation retrieveReclamation(@PathVariable(value="idReclamation") long idReclamation) {
        return reclamationService.retrieveReclamtion(idReclamation);
    }
    @DeleteMapping("/removeReclamation/{idReclamation}")
    public void removeReclamation(@PathVariable(value ="idReclamation") long idReclamation) {
        reclamationService.deleteReclamtion(idReclamation);
    }
























/*
   @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
   @ResponseStatus(HttpStatus.CREATED)
   public ResponseEntity<Reclamation> createCandidat(@RequestBody Reclamation candidat) {
       return new ResponseEntity<>(reclamationService.addCandidat(candidat), HttpStatus.OK);
   }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reclamation> updateCandidat(@PathVariable(value = "id") int id,
                                                      @RequestBody Reclamation candidat){
        return new ResponseEntity<>(reclamationService.updateCandidat(id, candidat),
                HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(reclamationService.deleteCandidat(id), HttpStatus.OK);
    }
    @GetMapping("/Candidats")
    public List<Reclamation> getAllCandidat() {
        return reclamationService.findAll();
    }
*/
   }
