package com.bolsadeideas.springboot.form.app.models.domain;

import java.util.Date;
import java.util.List;

//import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.form.app.validation.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validation.Requerido;

public class Usuario {
	
	//@Pattern(regexp="[0-9]{2}[.][\\d]{3}[.][0-9]{3}[-][A-Z]{1}")
	@IdentificadorRegex
	private String identificador;
	
	@Requerido
	@Size(min = 3, max = 8)
	private String username;
	
	@Requerido
	private String password;
	
	@NotEmpty
	@Email(message = "correo con formato incorrecto")
	private String email;
	
	//@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellido;
	
	@NotNull
	@Min(5)
	@Max(5000)
	private Integer cuenta;
	
	@NotNull
	@Past
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@NotNull
	private Pais pais;
	
	@NotEmpty
	private List<Role> roles;
	
	private boolean habilitar;
	
	@NotEmpty
	private String genero;
	
	private String valorSecreto;
	
	public Usuario() {
	}
	
	public Usuario(String identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	public String getUsername() {  return username;  }
	public String getPassword() {  return password;  }
	public String getEmail() {  return email;  }
	public String getNombre() {  return nombre;  }
	public String getApellido() {  return apellido;  }
	public String getIdentificador() {  return identificador; }
	public Integer getCuenta() {  return cuenta;  }
	public Date getFechaNacimiento() {  return fechaNacimiento;  }
	public Pais getPais() {  return pais;  }
	public List<Role> getRoles() {  return roles;  }
	public boolean getHabilitar() {  return habilitar;  }
	public String getGenero() {  return genero;  }
	public String getValorSecreto() {  return valorSecreto;  }
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public void setHabilitar(boolean habilitar) {
		this.habilitar = habilitar;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setValorSecreto(String valorSecreto) {
		this.valorSecreto = valorSecreto;
	}
 }
