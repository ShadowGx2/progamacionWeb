package com.mx.Empleados.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Es una anotación que establece que la clase es una entidad
@Table (name ="Empleados")
public class Empleados {

	@Id //Hacer referencia al campo que contiene el id de la tabla
	@Column
	int idEmpleados;
	@Column
	String nombre;
	@Column
	String puesto;
	@Column
	Double salario;

	// Constructor vacio
	public Empleados() {
	}

	// constructor con parametros
	public Empleados(int idEmpleados, String nombre, String puesto, Double salario) {
		this.idEmpleados = idEmpleados;
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}

	// metodo toString, Getters y setters
	@Override
	public String toString() {
		return "Empleados [idEmpleados=" + idEmpleados + ", nombre=" + nombre + ", puesto=" + puesto + ", salario="
				+ salario + "]";
	}

	// encapsulamiento
	public int getIdEmpleados() {
		return idEmpleados;
	}

	public void setId(int idEmpleados) {
		this.idEmpleados = idEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}