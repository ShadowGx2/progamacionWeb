package com.mx.Empleados.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Empleados.DAO.EmpleadosDAO;
import com.mx.Empleados.dominio.Empleados;

@Service
public class EmpleadosServImp implements EmpleadosServ{

	@Autowired
	EmpleadosDAO empleadosDAO;

	public void guardar(Empleados empleados) {
//TODO Auto-generade method stub
		empleadosDAO.save(empleados);

	}

	public void editar(Empleados empleados) {
		// TODO Auto-generated method stub
		empleadosDAO.save(empleados);
	}

	public void eliminar(Empleados empleados) {
		// TODO Auto-generated method stub
		empleadosDAO.delete(empleados);
	}

	public Empleados buscar(Empleados empleados) {
		// TODO Auto-generated method stub
		return empleadosDAO.findById(empleados.getIdEmpleados()).orElse(null);
	}

	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
