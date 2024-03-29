package com.muditasoft.recipemakerapp.service.impl;

import com.muditasoft.recipemakerapp.model.Recipe;
import com.muditasoft.recipemakerapp.repository.RecipeRepository;
import com.muditasoft.recipemakerapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
