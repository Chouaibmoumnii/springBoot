package com.example.reclamation.Reclamation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {


   // @Query("SELECT c FROM Candidat c WHERE c.nom LIKE ?1")
   // public Page<Candidat> candidatByNom(@Param("name") String nom, Pageable pageable);
  // List<Reclamation> findByNom(String nom);

}
