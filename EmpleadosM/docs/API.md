# Documentación de API - Empleados

Base URL local:

```text
http://localhost:8080/api/empleados
```

## Endpoints

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/empleados` | Lista todos los empleados |
| GET | `/api/empleados?nombre=ana` | Busca empleados por nombre |
| GET | `/api/empleados?activo=true` | Filtra empleados por estatus |
| GET | `/api/empleados/{id}` | Obtiene un empleado por ID |
| POST | `/api/empleados` | Crea un empleado |
| PUT | `/api/empleados/{id}` | Actualiza un empleado |
| DELETE | `/api/empleados/{id}` | Elimina un empleado |

## Crear empleado

```http
POST /api/empleados
Content-Type: application/json
```

```json
{
  "nombre": "Carlos Perez",
  "puesto": "Desarrollador Java",
  "salario": 28000.00,
  "activo": true
}
```

Respuesta esperada:

```http
201 Created
```

```json
{
  "idEmpleado": 4,
  "nombre": "Carlos Perez",
  "puesto": "Desarrollador Java",
  "salario": 28000.00,
  "activo": true,
  "fechaCreacion": "2026-05-07T10:00:00",
  "fechaActualizacion": null
}
```

## Actualizar empleado

```http
PUT /api/empleados/1
Content-Type: application/json
```

```json
{
  "nombre": "Ana Torres",
  "puesto": "Tech Lead Backend",
  "salario": 35000.00,
  "activo": true
}
```

## Eliminar empleado

```http
DELETE /api/empleados/1
```

Respuesta esperada:

```http
204 No Content
```

## Errores de validación

Cuando se envían datos inválidos, la API responde con `400 Bad Request`.

Ejemplo:

```json
{
  "timestamp": "2026-05-07T10:00:00",
  "status": 400,
  "error": "Bad Request",
  "message": "La solicitud contiene datos inválidos",
  "path": "/api/empleados",
  "validationErrors": {
    "nombre": "El nombre es obligatorio",
    "salario": "El salario debe ser mayor que 0"
  }
}
```

## Swagger

Cuando la aplicación esté corriendo, abre:

```text
http://localhost:8080/swagger-ui.html
```
