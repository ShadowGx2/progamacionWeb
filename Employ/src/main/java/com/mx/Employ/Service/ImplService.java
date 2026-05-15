package com.mx.Employ.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Employ.DAO.DataAccessObject;
import com.mx.Employ.Entity.Employ;

@Service

//Implementacion de los metodos creados en la interfaz Service
public class ImplService implements EmployService {

	@Autowired
	// desde la interfaz DAO para implementar las operaciones del CRUD desde
	// JPARepository
	DataAccessObject /*---> variable global*/ dao;

	@Override
	public void guardar(Employ employ) {
		dao.save(employ);

	}

	@Override
	public void editar(Employ employ) {
		dao.save(employ);

	}

	@Override
	public void eliminar(Employ employ) {
		dao.delete(employ);

	}

	@Override
	public Employ buscar(Employ employ) {
		// TODO Auto-generated method stub
		return dao.findById(employ.getId()).orElse(null);
	}

	@Override
	public List<Employ> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
