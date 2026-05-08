package com.mx.Empleados.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Empleados.dominio.Empleados;

public interface EmpleadosDAO extends JpaRepository<Empleados, Integer> {
	
} 


