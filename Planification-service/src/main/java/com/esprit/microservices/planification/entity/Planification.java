package com.esprit.microservices.planification.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Planification implements Serializable {
    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEvent;
    String NomEvent,Localisation;
    LocalDate DateEvent;
    float Tarif;

    public String getNomEvent() {
        return NomEvent;
    }

    public void setNomEvent(String nomEvent) {
        NomEvent = nomEvent;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String localisation) {
        Localisation = localisation;
    }

    public LocalDate getDateEvent() {
        return DateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        DateEvent = dateEvent;
    }

    public float getTarif() {
        return Tarif;
    }

    public void setTarif(float tarif) {
        Tarif = tarif;
    }

    public Planification() {
    }

    public Planification(String nomEvent, String localisation, LocalDate dateEvent, float tarif) {
        NomEvent = nomEvent;
        Localisation = localisation;
        DateEvent = dateEvent;
        Tarif = tarif;
    }
}
