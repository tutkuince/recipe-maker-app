package com.muditasoft.recipemakerapp.repository;

import com.muditasoft.recipemakerapp.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
