package com.muditasoft.recipemakerapp.model;

import lombok.Data;

@Data
public class Recipe {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
}
