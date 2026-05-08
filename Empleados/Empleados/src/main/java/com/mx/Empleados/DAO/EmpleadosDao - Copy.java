package com.mx.Empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mx.Empleados.dominio.Empleados;

public interface EmpleadosDao extends JpaRepository<Empleados, Integer> {
	
} 


