# 🎓 Backend Web - Jardín Infantil Carrusel de Aventuras

Sistema backend completo para la gestión administrativa y académica del Jardín Infantil Carrusel de Aventuras.

## 📋 Tabla de Contenidos
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Arquitectura](#arquitectura)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [API Endpoints](#api-endpoints)
- [Seguridad](#seguridad)
- [Migraciones de Base de Datos](#migraciones-de-base-de-datos)

## ✨ Características

### Gestión de Usuarios
- ✅ Registro y autenticación con JWT
- ✅ Roles: Administrador, Acudiente
- ✅ Gestión de perfiles

### Gestión de Estudiantes
- ✅ CRUD completo de estudiantes
- ✅ Vinculación con acudientes
- ✅ Caracterización médica

### Proceso de Admisiones
- ✅ Reserva de cupos
- ✅ Aprobación/rechazo de reservas
- ✅ Formalización de matrículas
- ✅ Gestión de estados

### Sistema de Pagos
- ✅ Registro de pagos
- ✅ Verificación administrativa
- ✅ Historial de transacciones
- ✅ Comprobantes

### Encuestas de Satisfacción
- ✅ Creación de encuestas
- ✅ Respuestas anónimas
- ✅ Análisis de resultados

### Funcionalidades Adicionales
- ✅ Sistema de notificaciones por email
- ✅ Generación de reportes (PDF/Excel)
- ✅ Auditoría de acciones
- ✅ Gestión de retiros

## 🛠 Tecnologías

### Core
- **Java 21** - Lenguaje de programación
- **Spring Boot 3.5.7** - Framework
- **Maven** - Gestor de dependencias

### Base de Datos
- **MySQL 8.0.33** - Base de datos relacional
- **Flyway** - Migraciones de BD
- **Spring JDBC** - Acceso a datos

### Seguridad
- **Spring Security** - Seguridad y autenticación
- **JWT (JJWT 0.11.5)** - Tokens de autenticación

### Utilidades
- **Lombok** - Reducción de boilerplate
- **Spring Validation** - Validación de datos
- **Spring Mail** - Envío de emails
- **Thymeleaf** - Templates de email
- **Apache POI** - Generación de Excel
- **iText** - Generación de PDF

## 🏗 Arquitectura

```
src/main/java/com/jardininfantil/web_institucional/
├── config/                 # Configuración de seguridad y aplicación
│   ├── WebSecurityConfig.java
│   └── security/          # JWT y filtros
├── controller/            # Controladores REST
│   ├── UserController.java
│   ├── ReservaController.java
│   ├── MatriculaController.java
│   ├── PagoController.java
│   └── EstudianteController.java
├── service/              # Lógica de negocio
│   ├── UserService.java
│   ├── ReservaService.java
│   ├── MatriculaService.java
│   ├── PagoService.java
│   └── EstudianteService.java
├── repository/           # Acceso a datos
│   ├── UserRepository.java
│   ├── ReservaRepository.java
│   └── impl/            # Implementaciones JDBC
├── models/              # Entidades de dominio
│   ├── Usuario.java
│   ├── Estudiante.java
│   ├── Matricula.java
│   └── enums/          # Enumeraciones
├── dto/                # Objetos de transferencia
│   ├── user/
│   ├── reserva/
│   ├── matricula/
│   └── common/
└── exception/          # Manejo de excepciones
    ├── ErrorHandler.java
    └── NotFoundException.java
```

## 📦 Requisitos

- **Java JDK 21** o superior
- **MySQL 8.0** o superior
- **Maven 3.8** o superior
- **Git** (para control de versiones)

## 🚀 Instalación

### 1. Clonar el repositorio
```bash
git clone https://github.com/leocarlos10/Backend-web-jardin-infantil.git
cd Backend-web-jardin-infantil
```

### 2. Crear base de datos
```sql
CREATE DATABASE db_jardin CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### 3. Configurar variables de entorno
Crear archivo `src/main/resources/application-dev.properties`:

```properties
# Base de datos
DATABASE_URL=jdbc:mysql://localhost:3306/db_jardin
DB_USER=root
DB_PASS=tu_password

# JWT
JWT_SECRET=tu_clave_secreta_jwt_muy_segura
JWT_EXPIRATION=86400000

# Email (opcional)
MAIL_HOST=smtp.gmail.com
MAIL_PORT=587
MAIL_USERNAME=tu_email@gmail.com
MAIL_PASSWORD=tu_password_app

# CORS
CORS_ALLOWED_ORIGINS=http://localhost:5173
```

### 4. Ejecutar migraciones
```bash
mvn flyway:migrate \
  -Dflyway.url="jdbc:mysql://localhost:3306/db_jardin" \
  -Dflyway.user="root" \
  -Dflyway.password="tu_password"
```

### 5. Compilar y ejecutar
```bash
# Compilar
mvn clean install

# Ejecutar con perfil dev
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

El servidor estará disponible en `http://localhost:8080`

## ⚙️ Configuración

### Variables de Entorno

| Variable | Descripción | Valor por Defecto |
|----------|-------------|-------------------|
| `DATABASE_URL` | URL de conexión MySQL | `jdbc:mysql://localhost:3306/db_jardin` |
| `DB_USER` | Usuario de base de datos | `root` |
| `DB_PASS` | Contraseña de base de datos | `` |
| `JWT_SECRET` | Clave secreta para JWT | (generada) |
| `JWT_EXPIRATION` | Tiempo de expiración JWT (ms) | `86400000` (24h) |
| `CORS_ALLOWED_ORIGINS` | Orígenes permitidos CORS | `http://localhost:5173` |

## 📡 API Endpoints

### Autenticación
```http
POST /api/v1/auth/register  # Registro de usuario
POST /api/v1/auth/login     # Inicio de sesión
```

### Reservas
```http
POST   /api/v1/reservas                    # Crear reserva
GET    /api/v1/reservas/{id}              # Obtener reserva
GET    /api/v1/reservas                   # Listar todas (ADMIN)
GET    /api/v1/reservas/estudiante/{id}   # Por estudiante
PUT    /api/v1/reservas/{id}/aprobar      # Aprobar (ADMIN)
PUT    /api/v1/reservas/{id}/rechazar     # Rechazar (ADMIN)
```

### Matrículas
```http
POST   /api/v1/matriculas                    # Crear matrícula
GET    /api/v1/matriculas/{id}              # Obtener matrícula
GET    /api/v1/matriculas                   # Listar todas (ADMIN)
GET    /api/v1/matriculas/estudiante/{id}   # Por estudiante
PUT    /api/v1/matriculas/{id}              # Actualizar
PUT    /api/v1/matriculas/{id}/cancelar     # Cancelar (ADMIN)
```

### Pagos
```http
POST   /api/v1/pagos                      # Registrar pago
GET    /api/v1/pagos/{id}                 # Obtener pago
GET    /api/v1/pagos/matricula/{id}      # Por matrícula
GET    /api/v1/pagos                     # Listar todos (ADMIN)
PUT    /api/v1/pagos/{id}/verificar      # Verificar (ADMIN)
PUT    /api/v1/pagos/{id}/rechazar       # Rechazar (ADMIN)
```

### Estudiantes
```http
POST   /api/v1/estudiantes                 # Crear estudiante
GET    /api/v1/estudiantes/{id}           # Obtener estudiante
GET    /api/v1/estudiantes                # Listar todos (ADMIN)
GET    /api/v1/estudiantes/acudiente/{id} # Por acudiente
PUT    /api/v1/estudiantes/{id}           # Actualizar
DELETE /api/v1/estudiantes/{id}           # Eliminar (ADMIN)
```

### Formato de Respuesta
```json
{
  "responseCode": 200,
  "responseMessage": "Operación exitosa",
  "data": { ... },
  "errorList": null
}
```

## 🔒 Seguridad

### Autenticación JWT
Todos los endpoints (excepto `/api/v1/auth/**`) requieren un token JWT válido en el header:
```
Authorization: Bearer <token>
```

### Roles y Permisos
- **ADMIN**: Acceso completo a gestión y reportes
- **ACUDIENTE**: Gestión de sus estudiantes y procesos

### Ejemplo de Login
```bash
curl -X POST http://localhost:8080/api/v1/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "nombreUsuario": "admin",
    "password": "password123"
  }'
```

## 🗄️ Migraciones de Base de Datos

### Estructura de Migraciones
Las migraciones están en `src/main/resources/db/migration/`

### Convención de Nombres
```
V{version}__{descripcion}.sql

✅ V1__Create_usuario_table.sql
✅ V2__Create_admin_table.sql
✅ V10__Create_pago_table.sql
```

### Ejecutar Migraciones Manualmente
```bash
mvn flyway:migrate \
  -Dflyway.url="jdbc:mysql://localhost:3306/db_jardin" \
  -Dflyway.user="root" \
  -Dflyway.password="password"
```

### ⚠️ Importante
- **NO modifiques** archivos de migración ya ejecutados
- Para cambios, crea una **nueva migración**

## 📊 Modelo de Datos

### Entidades Principales
1. **Usuario** - Usuarios del sistema
2. **Administrador** - Administradores
3. **Acudiente** - Padres/tutores
4. **Estudiante** - Niños matriculados
5. **ReservaCupo** - Solicitudes de reserva
6. **Matricula** - Matrículas activas
7. **PagoMatricula** - Pagos realizados
8. **EncuestaSatisfaccion** - Encuestas
9. **CaracterizacionEstudiante** - Info médica
10. **CancelarMatricula** - Solicitudes de retiro
11. **Familiar** - Familiares adicionales

## 🧪 Testing

```bash
# Ejecutar tests
mvn test

# Con cobertura
mvn test jacoco:report
```

## 📝 Logging

Los logs se generan en consola y archivo `logs/application.log`

## 🤝 Contribución

1. Fork el proyecto
2. Crea una rama (`git checkout -b feature/nueva-funcionalidad`)
3. Commit cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 👥 Autores

- **Leo Carlos** - [GitHub](https://github.com/leocarlos10)

## 📄 Licencia

Este proyecto está bajo licencia privada del Jardín Infantil Carrusel de Aventuras.

## 📞 Soporte

Para soporte, contacta a: support@jardincarruselaventuras.edu.co

---

**Desarrollado con ❤️ para el Jardín Infantil Carrusel de Aventuras - Lorica, Colombia**
