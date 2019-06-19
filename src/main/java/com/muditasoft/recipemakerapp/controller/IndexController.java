package com.muditasoft.recipemakerapp.controller;

import com.muditasoft.recipemakerapp.model.Category;
import com.muditasoft.recipemakerapp.model.UnitOfMeasure;
import com.muditasoft.recipemakerapp.repository.CategoryRepository;
import com.muditasoft.recipemakerapp.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @GetMapping(value = {"/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByCategoryName("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category Id is: " + categoryOptional.get().getId());
        System.out.println("Unit of Measure Id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
