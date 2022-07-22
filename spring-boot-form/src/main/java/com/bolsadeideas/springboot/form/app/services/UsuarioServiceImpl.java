package com.bolsadeideas.springboot.form.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario("1","Orlando"));
		lista.add(new Usuario("2","Gustavo"));
		lista.add(new Usuario("3","Mariel"));
	}
	
	@Override
	public List<Usuario> listar() {
		
		return lista;
	}

	@Override
	public Usuario obtenerPorID(String id) {
		
		Usuario resultado = null;
		for (Usuario u: this.lista) {
			if(u.getIdentificador().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIDOptional(String id) {
		Usuario usuario = obtenerPorID(id);
		return Optional.ofNullable(usuario);
	}

}
