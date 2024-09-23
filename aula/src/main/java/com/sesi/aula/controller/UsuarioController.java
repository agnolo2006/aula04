package com.sesi.aula.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sesi.aula.Repository.UsuarioRepository;
import com.sesi.aula.model.Usuario;


@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
	public String ListarUsuario(Model modelo) {
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return "usuarios";
	
	}
	
	
	
}

