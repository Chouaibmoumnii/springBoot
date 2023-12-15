package com.esprit.cours;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CoursRepository extends JpaRepository<Cours,Integer> {

    @Query("select c from  Cours  c where c.Titre like :Titre")
    public Page<Cours> CoursByTitre(@Param("Titre") String n , Pageable pageable) ;
}
