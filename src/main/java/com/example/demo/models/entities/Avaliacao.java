package com.example.demo.models.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "avaliacao")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data")
//    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDate data;

    @Column(name = "id_aluno")
    private Long id_aluno;

    @Column(name = "id_disciplina")
    private Long id_disciplina;

    @Column(name = "id_escola")
    private Long id_escola;


}