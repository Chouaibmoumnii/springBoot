package com.example.Exam.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
@EqualsAndHashCode(exclude = "idExam")
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ToString.Exclude
    @Setter(AccessLevel.NONE)

    private Long idExam;
    private Date dateExam;
    private String classExam;
    private Date heureExam;
    private String salleExam;
    private String matiere;
    private String note;

}
