package com.muditasoft.recipemakerapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipeNotes;

    @OneToOne
    private Recipe recipe;
}
