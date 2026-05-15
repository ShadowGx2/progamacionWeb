package com.mx.Employ.Service;

import java.util.List;

import com.mx.Employ.Entity.Employ;

/*Define las operacione de negocio que se realizaran sobre la entidad Employ
 * Esta capa actua como intermediaria entre:
 * CONTROLLER --- >  Service ----DAO ---> DB*/

public interface EmployService  {
	
	//void Methods
	public void guardar (Employ employ);
	public void editar (Employ employ);
	public void eliminar(Employ employ);
	
	// return data
	public Employ buscar(Employ employ);
	
	public List <Employ> listar();

	
}
