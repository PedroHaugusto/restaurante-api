package com.restaraunteapi.restauranteapi.repositories;

import com.restaraunteapi.restauranteapi.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
}