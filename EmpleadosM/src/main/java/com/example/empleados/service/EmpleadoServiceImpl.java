package com.example.empleados.service;

import com.example.empleados.dto.EmpleadoRequest;
import com.example.empleados.dto.EmpleadoResponse;
import com.example.empleados.entity.Empleado;
import com.example.empleados.exception.RecursoNoEncontradoException;
import com.example.empleados.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoResponse> listarTodos() {
        return empleadoRepository.findAll()
                .stream()
                .map(this::convertirAResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoResponse> buscarPorNombre(String nombre) {
        return empleadoRepository.findByNombreContainingIgnoreCase(nombre)
                .stream()
                .map(this::convertirAResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoResponse> listarPorEstatus(Boolean activo) {
        return empleadoRepository.findByActivo(activo)
                .stream()
                .map(this::convertirAResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpleadoResponse buscarPorId(Integer id) {
        Empleado empleado = obtenerEmpleado(id);
        return convertirAResponse(empleado);
    }

    @Override
    public EmpleadoResponse crear(EmpleadoRequest request) {
        Empleado empleado = new Empleado();
        aplicarDatos(empleado, request);
        empleado.setFechaCreacion(LocalDateTime.now());
        Empleado guardado = empleadoRepository.save(empleado);
        return convertirAResponse(guardado);
    }

    @Override
    public EmpleadoResponse actualizar(Integer id, EmpleadoRequest request) {
        Empleado empleado = obtenerEmpleado(id);
        aplicarDatos(empleado, request);
        empleado.setFechaActualizacion(LocalDateTime.now());
        Empleado actualizado = empleadoRepository.save(empleado);
        return convertirAResponse(actualizado);
    }

    @Override
    public void eliminar(Integer id) {
        Empleado empleado = obtenerEmpleado(id);
        empleadoRepository.delete(empleado);
    }

    private Empleado obtenerEmpleado(Integer id) {
        return empleadoRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe un empleado con id " + id));
    }

    private void aplicarDatos(Empleado empleado, EmpleadoRequest request) {
        empleado.setNombre(request.getNombre().trim());
        empleado.setPuesto(request.getPuesto().trim());
        empleado.setSalario(request.getSalario());
        empleado.setActivo(request.getActivo() != null ? request.getActivo() : true);
    }

    private EmpleadoResponse convertirAResponse(Empleado empleado) {
        EmpleadoResponse response = new EmpleadoResponse();
        response.setIdEmpleado(empleado.getIdEmpleado());
        response.setNombre(empleado.getNombre());
        response.setPuesto(empleado.getPuesto());
        response.setSalario(empleado.getSalario());
        response.setActivo(empleado.getActivo());
        response.setFechaCreacion(empleado.getFechaCreacion());
        response.setFechaActualizacion(empleado.getFechaActualizacion());
        return response;
    }
}
