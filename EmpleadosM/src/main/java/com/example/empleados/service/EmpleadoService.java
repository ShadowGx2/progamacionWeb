package com.example.empleados.service;

import com.example.empleados.dto.EmpleadoRequest;
import com.example.empleados.dto.EmpleadoResponse;

import java.util.List;

public interface EmpleadoService {
    List<EmpleadoResponse> listarTodos();
    List<EmpleadoResponse> buscarPorNombre(String nombre);
    List<EmpleadoResponse> listarPorEstatus(Boolean activo);
    EmpleadoResponse buscarPorId(Integer id);
    EmpleadoResponse crear(EmpleadoRequest request);
    EmpleadoResponse actualizar(Integer id, EmpleadoRequest request);
    void eliminar(Integer id);
}
