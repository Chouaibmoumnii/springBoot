package com.example.reclamation.Reclamation;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReclamtion;
    private String description,object;

    public Reclamation(Long idReclamtion, String description, String object, Date date) {
        this.idReclamtion = idReclamtion;
        this.description = description;
        this.object = object;
        this.date = date;
    }

    public Reclamation() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public void setIdReclamtion(Long idReclamtion) {
        this.idReclamtion = idReclamtion;
    }

    public Long getIdReclamtion() {
        return idReclamtion;
    }
}
