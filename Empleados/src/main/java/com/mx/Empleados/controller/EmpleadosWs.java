package com.mx.Empleados.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleados.dominio.Empleados;
import com.mx.Empleados.servicios.EmpleadosServ;

@RestController
@RequestMapping("EmpleadosWs")
@CrossOrigin
public class EmpleadosWs {
	@Autowired
	EmpleadosServ empleadosServ;
	
	//http://localhost:9000/EmpleadosWs/listar
	@GetMapping("listar")
	public List<Empleados> Listar() {
		var lista = empleadosServ.listar();
		return lista;
	}

	@PostMapping("buscar")
	public Empleados buscar(@RequestBody Empleados empleados) {
		empleados = empleadosServ.buscar(empleados);
		return empleados;

	}

	@PostMapping("guardar")
	public void guardar(@RequestBody Empleados empleados) {
		empleadosServ.guardar(empleados);
	}

	@PostMapping("editar")
	public void editar(@RequestBody Empleados empleados) {
		empleadosServ.editar(empleados);
	}

	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empleados empleados) {
		empleadosServ.eliminar(empleados);
	}

}