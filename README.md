# Sistema de Expediente Clínico Digital - Consultorio Dental

## Tabla de Contenidos
1. [Resumen Ejecutivo](#resumen-ejecutivo)
2. [Requerimientos](#requerimientos)
3. [Instalación](#instalación)
4. [Configuración](#configuración)
5. [Uso](#uso)
6. [Contribución](#contribución)
7. [Roadmap](#roadmap)

---

## Resumen Ejecutivo

### Descripción
Sistema integral de gestión de expedientes clínicos diseñado para automatizar y asegurar el registro de pacientes y sus historiales de consultas médicas en un entorno local.

### Problema Identificado
El consultorio dependía de expedientes físicos en papel, lo que generaba vulnerabilidad ante pérdida de información, lentitud en la búsqueda de historiales previos y dificultad para mantener un seguimiento cronológico eficiente de los tratamientos y alergias de los pacientes.

### Solución
Desarrollo de una aplicación web de ejecución local con una API REST robusta que permite el registro instantáneo (CRUD) de pacientes y la vinculación cronológica de sus notas de evolución médica, garantizando la privacidad absoluta de los datos médico-paciente.

### Arquitectura
La solución utiliza una arquitectura Cliente-Servidor local:
* **Frontend (Cliente Web):** Interfaz en HTML/CSS/JS ejecutada en el navegador web local.
* **Backend (Servidor de Aplicación):** API REST desarrollada en Kotlin utilizando Javalin para el manejo eficiente de peticiones HTTP.
* **Base de Datos:** Motor relacional MariaDB ejecutándose en modo *localhost*.

*(Ver diagrama de arquitectura completo en la documentación adjunta del proyecto).*

---

## Requerimientos

Para el correcto funcionamiento del sistema, el entorno *host* debe contar con:
* **Lenguaje:** Java Development Kit (JDK) versión 17 (OpenJDK 17).
* **Base de Datos:** MariaDB Server (Versión 10.4 o superior).
* **Servidor Web/App:** Servidor embebido Jetty (provisto internamente por Javalin).
* **Gestor de Dependencias:** Gradle 8+ (Wrapper incluido en el repositorio).
* **Navegador:** Google Chrome, Microsoft Edge o Mozilla Firefox (versiones recientes).

---

## Instalación

### ¿Cómo instalar el ambiente de desarrollo?
1. Clonar el repositorio localmente:
   `git clone https://github.com/TuUsuario/Consultorio-Dental.git`
2. Abrir el proyecto en un IDE compatible con Kotlin (se recomienda IntelliJ IDEA).
3. Permitir que el IDE sincronice las dependencias de Gradle automáticamente.
4. Ejecutar el script `V1__init.sql` en tu instancia local de MariaDB para crear el esquema.

### ¿Cómo ejecutar pruebas manualmente?
El proyecto cuenta con pruebas unitarias desarrolladas con JUnit 5. Para ejecutarlas:
1. Abrir la terminal en la raíz del proyecto.
2. Ejecutar el comando de Gradle:
   `./gradlew test` (Mac/Linux) o `gradlew.bat test` (Windows).

### ¿Cómo implementar la solución en producción (Ambiente Local)?
Debido a la naturaleza de los datos médicos, este sistema está diseñado para despliegue **local** (On-Premise), no en la nube.
1. Generar el archivo ejecutable JAR compilando el proyecto con Gradle:
   `./gradlew build`
2. Localizar el archivo `.jar` generado en la carpeta `build/libs/`.
3. Ejecutar el sistema en la computadora del consultorio con el comando:
   `java -jar consultorio-api.jar`

---

## Configuración

### Configuración del producto
Las credenciales de conexión y parámetros del servidor deben configurarse modificando el archivo `application.properties` (o variables de entorno locales) antes de compilar para producción:
```properties
db.url=jdbc:mariadb://localhost:3306/consultorio_db
db.user=root
db.password=tu_contraseña_local
server.port=8080
