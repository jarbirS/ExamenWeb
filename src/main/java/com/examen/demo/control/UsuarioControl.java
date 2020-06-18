package com.examen.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.examen.demo.repository.UsuarioRepository;

@Controller
public class UsuarioControl {

UsuarioRepository usuarioRepository;
	
	@GetMapping("/login")
	public String vistaLogin() {
		return "login";
	}
}
