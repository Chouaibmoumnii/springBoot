package com.esprit.cours;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cours  implements Serializable {
    private static final long  serialVersionUID=6 ;

    @Id
    @GeneratedValue
    private int id ;
    private String Etat ,Titre ,Description ,lien ; //lien = resource = pdf , video ,...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return Etat;
    }

    public void setType(String type) {
        Etat = type;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public Cours() {
    }

    public Cours(String Etat, String titre, String description, String lien) {
        Etat = Etat;
        Titre = titre;
        Description = description;
        this.lien = lien;
    }
}
