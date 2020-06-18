package com.examen.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.demo.entities.AccesoVisitante;

public interface AccesoRepository extends JpaRepository<AccesoVisitante, Integer> {

}
