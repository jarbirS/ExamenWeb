package com.examen.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.demo.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

}
