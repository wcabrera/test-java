# Gestión de Usuarios con Spring Boot

Este proyecto es una aplicación Spring Boot que proporciona una API RESTful para la gestión de usuarios. Permite registrar nuevos usuarios, obtener información de usuarios existentes y más.

## Requisitos Previos

- JDK 8 o superior
- Maven o Gradle (según tu preferencia)
- IDE (por ejemplo, IntelliJ IDEA, Eclipse) o editor de texto para código fuente

## Configuración

1. Clona el repositorio a tu máquina local:

git clone <URL-del-repositorio>

2. Importa el proyecto en tu IDE o editor de texto.

3. Configura las propiedades de la base de datos en el archivo `application.properties`:
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect


4. Ejecuta la aplicación:


La aplicación estará disponible en `http://localhost:8080`.

## Uso

Puedes utilizar herramientas como Postman o cURL para interactuar con la API RESTful proporcionada por la aplicación. Aquí hay algunos ejemplos de endpoints disponibles:

- `POST /api/usuarios/registro`: Registra un nuevo usuario.

- ...


## Arquitectura del software

+--------------------------------------------+
|              Aplicación Spring Boot        |
|                                            |
|  +--------------------------+              |
|  |   Controladores (Controllers)  |       |
|  +--------------------------+              |
|                   |                        |
|                   v                        |
|  +--------------------------+              |
|  |    Servicios (Services)    |            |
|  +--------------------------+              |
|                   |                        |
|                   v                        |
|  +--------------------------+              |
|  |    Repositorios (Repositories) |        |
|  +--------------------------+              |
|                   |                        |
|                   v                        |
|  +--------------------------+              |
|  |    Base de Datos (JPA/Hibernate) |      |
|  +--------------------------+              |
|                                            |
+--------------------------------------------+


Consulta la documentación de la API generada con Swagger para obtener más detalles sobre los endpoints disponibles.

## Contribución

¡Las contribuciones son bienvenidas! Si encuentras un error o tienes una mejora que sugerir, no dudes en abrir un problema o enviar una solicitud de extracción.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

