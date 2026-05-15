package com.mx.Employ.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Employ.Entity.Employ;

/*
 * CREACION DE LA INTERFAZ DATA ACCESS OBJECT
 * SE ENCARGA DE LA COMUNICACION CON LA BASE DE DATOS
 * EXTIENDE DESDE UN REPOSITORIO DE SPRING BOOT PARA CREAR AUTOMATICAMENTE LAS OPERACIONES DE UN CRUD
 * T = ENTIDAD QUE SE VA A MANEJAR (EMPLOY)
 * ID = TIPO DE DATO DE LA LLAVE PRIMARIA
 * EXTENDS HEREDAMOS LAS OPERACIONES DE NUESTRO CRUD
 *metodos personalizados */

public interface DataAccessObject extends JpaRepository <Employ, Integer>   {

}
