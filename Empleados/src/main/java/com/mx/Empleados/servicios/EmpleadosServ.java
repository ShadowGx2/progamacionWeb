package com.mx.Empleados.servicios;

import java.util.List;



import com.mx.Empleados.dominio.Empleados;

public interface EmpleadosServ {
	public void guardar(Empleados empleados);

	public void editar(Empleados empleados);

	public void eliminar(Empleados empleados);

	public Empleados buscar(Empleados empleados);

	public List<Empleados> listar();

}
