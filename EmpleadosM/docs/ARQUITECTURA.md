# Arquitectura del proyecto

El proyecto fue reorganizado usando una arquitectura por capas.

```text
src/main/java/com/example/empleados
├── controller
├── dto
├── entity
├── exception
├── repository
└── service
```

## Capas

### Controller
Expone los endpoints REST y recibe las solicitudes HTTP.

Archivo principal:

```text
EmpleadoController.java
```

Responsabilidades:

- Recibir peticiones HTTP.
- Validar el cuerpo de la solicitud con `@Valid`.
- Responder usando `ResponseEntity`.
- No contener lógica de negocio.

### DTO
Define los objetos usados para entrada y salida de datos.

Archivos:

```text
EmpleadoRequest.java
EmpleadoResponse.java
```

Ventajas:

- Evita exponer directamente la entidad JPA.
- Permite validar entradas.
- Separa el modelo de base de datos del contrato de la API.

### Entity
Representa la tabla `empleados` de la base de datos.

Archivo:

```text
Empleado.java
```

Mejoras aplicadas:

- Atributos privados.
- Nombre de clase en singular.
- Identificador claro: `idEmpleado`.
- Fechas de creación y actualización.
- Uso de `BigDecimal` para salario.

### Repository
Acceso a datos usando Spring Data JPA.

Archivo:

```text
EmpleadoRepository.java
```

Extiende:

```java
JpaRepository<Empleado, Integer>
```

### Service
Contiene la lógica de negocio.

Archivos:

```text
EmpleadoService.java
EmpleadoServiceImpl.java
```

Responsabilidades:

- Buscar empleados.
- Crear empleados.
- Actualizar empleados.
- Eliminar empleados.
- Convertir entidad a DTO.
- Lanzar excepciones cuando un recurso no existe.

### Exception
Maneja errores de forma centralizada.

Archivos:

```text
RecursoNoEncontradoException.java
GlobalExceptionHandler.java
ErrorResponse.java
```

Ventajas:

- Respuestas de error consistentes.
- Mejor experiencia para frontend.
- Evita errores 500 innecesarios.

## Buenas prácticas aplicadas

- Métodos HTTP correctos: `GET`, `POST`, `PUT`, `DELETE`.
- Inyección por constructor.
- Validaciones con Jakarta Validation.
- Manejo global de excepciones.
- Uso de DTOs.
- Uso de `ResponseEntity`.
- `.gitignore` para evitar subir `target/`.
- Documentación de API.
- Swagger/OpenAPI integrado.
