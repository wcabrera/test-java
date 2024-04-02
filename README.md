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


Ejemplo de la invocación
![image](https://github.com/wcabrera/test-java/assets/4590964/56076ece-8e56-4aca-b9c3-091575108ded)



## Arquitectura del software

![image](https://github.com/wcabrera/test-java/assets/4590964/5b7aad6a-5603-4da3-a327-39af2419d7d2)

+--------------------------------------------+


Consulta la documentación de la API generada con Swagger para obtener más detalles sobre los endpoints disponibles.



## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

