package com.mx.Employ.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Employ.Entity.Employ;
import com.mx.Employ.Service.EmployService;

@RestController 
@RequestMapping("EmployWs")
@CrossOrigin
public class EmployWs {
	
	@Autowired
	EmployService service;
	
	//http://localhost:9000/EmployWs/listar
	@GetMapping("listar")
	public List<Employ> listar(){
		var lista = service.listar();
		return lista;
	}
	
	
	//http://localhost:9000/EmployWs/buscar
	@PostMapping("buscar")
	public Employ buscar(@RequestBody Employ employ) {
		employ = service.buscar(employ);
		return employ;
		
	}
	
	
	//http://localhost:9000/EmployWs/guardar
	@PostMapping ("guardar")
	public void guardar (@RequestBody Employ employ) {
		service.guardar(employ);
		
	}
	
	//http://localhost:9000/EmployWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Employ employ) {
		service.editar(employ);
		
	}
	
	//http://localhost:9000/EmployWs/eliminar
	@PostMapping("Eliminar")
	public void eliminar(@RequestBody Employ employ) {
		service.eliminar(employ);
		
	}

}
