package com.mx.Empleados.servicios;

import java.util.List;


import com.mx.Empleados.dominio.Empleados;

public interface EmpleadosServ {
	public void guardar(Empleados empleado);

	public void editar(Empleados empleado);

	public void eliminar(Empleados empleado);

	public Empleados buscar(Empleados empleado);

	public List<Empleados> listar();

}
