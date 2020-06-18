package com.examen.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.demo.entities.Visitante;

public interface VisitanteRepository extends JpaRepository<Visitante, String> {

}
