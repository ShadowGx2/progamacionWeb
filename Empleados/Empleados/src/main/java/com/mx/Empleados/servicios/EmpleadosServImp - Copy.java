package com.mx.Empleados.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Empleados.dao.EmpleadosDao;
import com.mx.Empleados.dominio.Empleados;

@Service
public class EmpleadosServImp implements EmpleadosServ{

	// Inyeccion de dependencias 
	@Autowired
	EmpleadosDao empleadosDao;  //Inicializando beans

	//Se implementa el metodo guardar, el objeto de tipo empleado
	public void guardar(Empleados empleados) {
//TODO Auto-generade method stub
		empleadosDao.save(empleados);  //Se utiliza el metodo Save para guardar el objeto empleado 

	}

	public void editar(Empleados empleados) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleados);
	}

	public void eliminar(Empleados empleados) {
		// TODO Auto-generated method stub
		empleadosDao.delete(empleados);
	}

	public Empleados buscar(Empleados empleados) {
		// TODO Auto-generated method stub
		return empleadosDao.findById(empleados.getIdEmpleados()).orElse(null);
	}

	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return empleadosDao.findAll();
	}

}
