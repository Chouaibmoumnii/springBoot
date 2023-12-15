package com.adem.absencemics;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
public class Absence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAbsence;

    @Column
    private Date date;

    @Column
    private String description;

    @Column
    private Time heure;

}
