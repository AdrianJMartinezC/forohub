# ForoHub

ForoHub es una aplicación donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados "tópicos". Esta API REST se construyó utilizando Spring y Java 17, y se enfoca en la gestión de tópicos. 

## Características

La API permite a los usuarios:

- **Crear un nuevo tópico**: Los usuarios pueden crear nuevos tópicos en la plataforma.
- **Mostrar todos los tópicos creados**: Los usuarios pueden ver una lista de todos los tópicos disponibles.
- **Mostrar un tópico específico**: Los usuarios pueden ver los detalles de un tópico específico.
- **Actualizar un tópico**: Los usuarios pueden actualizar la información de un tópico existente.
- **Eliminar un tópico**: Los usuarios pueden eliminar un tópico.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **Lombok**
- **Spring Web**
- **Spring Boot DevTools**
- **Spring Data JPA**
- **Flyway Migration**
- **MySQL Driver**
- **Validation**
- **Spring Security (JWT para autenticación)**

## Requisitos Previos

- **Java 17** o superior.
- **Maven**.
- **MySQL**.

## Configuración del Proyecto

1. **Clonar el repositorio**:
    ```bash
    git clone https://github.com/tu-usuario/ForoHub.git
    cd ForoHub
    ```

2. **Configurar la base de datos**:
    - Crear una base de datos en MySQL llamada `challenge`.
    - Configurar las credenciales de la base de datos en el archivo `application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/challenge
        spring.datasource.username=tu-usuario
        spring.datasource.password=tu-contraseña

        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true

        spring.flyway.enabled=true
        spring.flyway.locations=classpath:db/migration
        ```

3. **Construir y ejecutar la aplicación**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Uso de la API

### Endpoints

- **Crear un nuevo tópico**:
    ```http
    POST: http://localhost:8080/topico
    ```
    Cuerpo de la solicitud:
    ```json
    {    
   "titulo": "Título del tópico",
	 "mensaje":"mensaje del tópico",
	 "fechaCreacion":"AAAA-MM-DD",
	 "autor":"autor(a) del tópico",
	 "nombreCurso":"Curso del tópico"
     }
    ```

- **Listar todos los tópicos creados**:
    ```http
    GET : http://localhost:8080/topico
    ```

- **Mostrar un tópico específico**:
    ```http
    GET http://localhost:8080/topico/id
    ```

- **Actualizar un tópico**:
    ```http
    PUT http://localhost:8080/topico/id
    ```
    Cuerpo de la solicitud:
    ```json
    {    
   "titulo": "Título del tópico",
	 "mensaje":"mensaje del tópico",
	 "fechaCreacion":"AAAA-MM-DD",
	 "autor":"autor(a) del tópico",
	 "nombreCurso":"Curso del tópico"
     }
    ```

- **Eliminar un tópico**:
    ```http
    DELETE  http://localhost:8080/topico/id
    ```

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y commitea (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para obtener más detalles.

