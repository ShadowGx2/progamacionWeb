# Empleados API

Proyecto Spring Boot para administrar empleados mediante una API REST.

Esta versión fue generada como una versión limpia y mejorada del proyecto original.

## Tecnologías

- Java 17
- Spring Boot 3.3.5
- Spring Web
- Spring Data JPA
- Jakarta Validation
- H2 Database
- MySQL Connector
- Swagger / OpenAPI
- Maven

## Estructura

```text
Empleados-Mejorado/
├── docs/
│   ├── API.md
│   └── ARQUITECTURA.md
├── src/
│   ├── main/
│   │   ├── java/com/example/empleados/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── exception/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

## Mejoras realizadas

- Se eliminó la estructura duplicada del proyecto original.
- Se corrigieron nombres de clases y paquetes.
- Se cambió la entidad de `Empleados` a `Empleado`.
- Se usaron atributos privados y getters/setters correctos.
- Se implementaron DTOs para request y response.
- Se agregaron validaciones.
- Se implementó manejo global de errores.
- Se corrigió el diseño REST.
- Se reemplazó el uso de `@Autowired` por inyección por constructor.
- Se agregó documentación completa.
- Se agregó Swagger.
- Se agregó configuración para H2 y MySQL.

## Requisitos

- Java 17 o superior
- Maven 3.8 o superior

## Ejecutar con H2

```bash
mvn spring-boot:run
```

La API quedará disponible en:

```text
http://localhost:8080/api/empleados
```

La consola H2 estará disponible en:

```text
http://localhost:8080/h2-console
```

Datos H2:

```text
JDBC URL: jdbc:h2:mem:empleados_db
User: sa
Password: dejar vacío
```

## Ejecutar con MySQL

Crea o permite crear la base de datos:

```sql
CREATE DATABASE empleados_db;
```

Edita el archivo:

```text
src/main/resources/application-mysql.properties
```

Luego ejecuta:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

## Documentación Swagger

Con el proyecto en ejecución, abre:

```text
http://localhost:8080/swagger-ui.html
```

## Endpoints principales

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/empleados` | Listar empleados |
| GET | `/api/empleados/{id}` | Buscar empleado por ID |
| POST | `/api/empleados` | Crear empleado |
| PUT | `/api/empleados/{id}` | Actualizar empleado |
| DELETE | `/api/empleados/{id}` | Eliminar empleado |

## Ejemplo JSON

```json
{
  "nombre": "Carlos Perez",
  "puesto": "Desarrollador Java",
  "salario": 28000.00,
  "activo": true
}
```

## Probar con curl

Crear empleado:

```bash
curl -X POST http://localhost:8080/api/empleados \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Carlos Perez","puesto":"Desarrollador Java","salario":28000,"activo":true}'
```

Listar empleados:

```bash
curl http://localhost:8080/api/empleados
```

Buscar por ID:

```bash
curl http://localhost:8080/api/empleados/1
```

Actualizar:

```bash
curl -X PUT http://localhost:8080/api/empleados/1 \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Carlos Perez","puesto":"Senior Java Developer","salario":35000,"activo":true}'
```

Eliminar:

```bash
curl -X DELETE http://localhost:8080/api/empleados/1
```
