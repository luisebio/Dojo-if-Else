package com.tripulacao_if_else.Dojo.Models;

import java.util.*;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;



@Entity
@Data
@Table(name = "piratas")
public class Pirata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Racas raca;

    private String tripulacao;

    @Enumerated(EnumType.STRING)
    private Status status;


    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Racas getRaca() {
        return raca;
    }

    public String getTripulacao() {
        return tripulacao;
    }

    public Status isStatus() {
        return status;
    }
}

