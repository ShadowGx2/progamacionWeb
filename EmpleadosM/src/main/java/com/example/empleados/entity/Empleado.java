package com.example.empleados.entity;

// Importaciones necesarias de JPA para mapear la entidad a la base de datos
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Importaciones para manejo de tipos de datos
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Clase entidad que representa la tabla "empleados" en la base de datos.
 * 
 * Esta clase utiliza JPA/Hibernate para mapear los atributos
 * del objeto con las columnas de la tabla.
 */
@Entity // Indica que esta clase es una entidad JPA
@Table(name = "Empleados") // Define el nombre de la tabla en la BD
public class Empleado {

    /**
     * Identificador único del empleado.
     * 
     * Se genera automáticamente utilizando auto incremento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer idEmpleado;

    /**
     * Nombre completo del empleado.
     * 
     * No puede ser nulo y tiene un máximo de 100 caracteres.
     */
    @Column(nullable = false, length = 100)
    private String nombre;

    /**
     * Puesto o cargo del empleado dentro de la empresa.
     * 
     * Campo obligatorio con máximo de 80 caracteres.
     */
    @Column(nullable = false, length = 80)
    private String puesto;

    /**
     * Salario del empleado.
     * 
     * Se utiliza BigDecimal para evitar errores de precisión en cálculos monetarios.
     * precision = 12 -> total de dígitos
     * scale = 2 -> cantidad de decimales
     */
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal salario;

    /**
     * Indica si el empleado se encuentra activo.
     * 
     * Por defecto el valor es true.
     */
    @Column(nullable = false)
    private Boolean activo = true;

    /**
     * Fecha y hora de creación del registro.
     * 
     * Se asigna automáticamente al momento de crear el objeto.
     * updatable = false evita modificaciones posteriores.
     */
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    /**
     * Fecha y hora de la última actualización del registro.
     */
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    /**
     * Constructor vacío requerido por JPA.
     */
    public Empleado() {
    }

    /**
     * Constructor con parámetros para inicializar la entidad.
     * 
     * @param idEmpleado Identificador del empleado
     * @param nombre Nombre del empleado
     * @param puesto Puesto del empleado
     * @param salario Salario del empleado
     * @param activo Estado del empleado
     */
    public Empleado(Integer idEmpleado, String nombre, String puesto, BigDecimal salario, Boolean activo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.activo = activo;
    }

    /**
     * Obtiene el ID del empleado.
     * 
     * @return id del empleado
     */
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el ID del empleado.
     * 
     * @param idEmpleado nuevo ID
     */
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el puesto del empleado.
     * 
     * @return puesto del empleado
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Establece el puesto del empleado.
     * 
     * @param puesto nuevo puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Obtiene el salario del empleado.
     * 
     * @return salario actual
     */
    public BigDecimal getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * 
     * @param salario nuevo salario
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /**
     * Obtiene el estado del empleado.
     * 
     * @return true si está activo, false en caso contrario
     */
    public Boolean getActivo() {
        return activo;
    }

    /**
     * Cambia el estado del empleado.
     * 
     * @param activo nuevo estado
     */
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    /**
     * Obtiene la fecha de creación.
     * 
     * @return fecha de creación
     */
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece la fecha de creación.
     * 
     * @param fechaCreacion nueva fecha
     */
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Obtiene la fecha de última actualización.
     * 
     * @return fecha de actualización
     */
    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Establece la fecha de actualización.
     * 
     * @param fechaActualizacion nueva fecha
     */
    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}