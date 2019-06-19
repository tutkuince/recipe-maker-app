package com.muditasoft.recipemakerapp.repository;

import com.muditasoft.recipemakerapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
