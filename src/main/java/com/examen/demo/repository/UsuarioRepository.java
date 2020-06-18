package com.examen.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
