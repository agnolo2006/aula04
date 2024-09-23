package com.sesi.aula.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.aula.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
