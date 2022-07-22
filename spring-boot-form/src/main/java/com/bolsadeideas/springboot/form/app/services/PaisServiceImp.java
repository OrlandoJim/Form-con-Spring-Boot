package com.bolsadeideas.springboot.form.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Pais;

@Service
public class PaisServiceImp implements PaisService {

	public List<Pais> lista;
	
	public PaisServiceImp() {
		this.lista = Arrays.asList(
				new Pais(1,"MX","México"),
				new Pais(2,"EU","Estados Unidos"),
				new Pais(3,"ES","España"),
				new Pais(4,"GR","Alemania"));
	}
	
	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Pais obtenerPorId(Integer id) {
		Pais resultado = null;
		for (Pais pais: this.lista) {
			if (id == pais.getId()) {
				resultado = pais;
				break;
			}
		}
		return resultado;
	}

}
