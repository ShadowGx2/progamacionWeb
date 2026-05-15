package com.mx.Employ.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Indica la clase es una entidad de JPA 
@Entity
//Especifica el nombre la tabla de la base de datos
@Table(name = "Employ")
//nombre de la clase
public class Employ {

	// Definir el id como llave primaria
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employ_sq")
	@SequenceGenerator(name = "employ_sq", sequenceName = "EMPLOY_SEQ", allocationSize = 1)
	// atributos de nuestra entidad
	@Id
	@Column(name = "ID")
	Integer id;
	@Column(name = "NOMBRE")
	String nombre;
	@Column(name = "EDAD")
	String edad;
	@Column(name = "DIRECCION")
	String direccion;
	@Column(name = "EMAIL")
	String email;

	// constructor vacio
	public Employ() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public Employ(Integer id, String nombre, String edad, String direccion, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
	}

	// METHODS GETTER AND SETTER //encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
