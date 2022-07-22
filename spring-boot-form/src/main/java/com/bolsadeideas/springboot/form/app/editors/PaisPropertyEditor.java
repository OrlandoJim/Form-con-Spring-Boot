package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.form.app.services.PaisService;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

	@Autowired
	private PaisService service;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			this.setValue(service.obtenerPorId(Integer.parseInt(text)));
		} catch (NumberFormatException e) {
			setValue(null);
		}
	}

}
