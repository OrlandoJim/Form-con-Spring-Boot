package com.bolsadeideas.springboot.form.app.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorID(String id);
	public Optional<Usuario> obtenerPorIDOptional(String id);
}
