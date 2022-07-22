package com.bolsadeideas.springboot.form.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Role;

@Service
public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}
