package com.example.empleados.repository;

import com.example.empleados.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    List<Empleado> findByNombreContainingIgnoreCase(String nombre);
    List<Empleado> findByActivo(Boolean activo);
}
