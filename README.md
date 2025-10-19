# Ejercicio Final (evaluable) de la Unidad 1

## 1. Descripción de la tarea
Vas a desarrollar un proyecto **Java** en arquitectura por capas para gestionar varias colecciones de objetos (por ejemplo: **alumnos, asignaturas y matrículas**).  

El proyecto debe permitir intercambiar fácilmente el mecanismo de persistencia, pudiendo trabajar con:  

- [x] Ficheros de texto (CSV, por ejemplo)  
- [ ] Ficheros XML  
- [x] Ficheros Binarios  
- [ ] Base de datos MySQL vía JDBC (en la siguiente unidad)  

## 2. Objetivo principal
Poner en práctica los conceptos de la **Unidad 1** y trabajarlos de cara al examen.  

## 3. Enunciado
Realizar una aplicación que gestione información y permita **almacenarla y recuperarla** de un fichero de texto, binario y XML.  

Se propone el ejemplo de **alumno, asignaturas y matrículas**, porque tiene relaciones con cierta complejidad. Sin embargo, podéis proponer un supuesto equivalente.  

## 4. Estructura del proyecto

### 4.1 Estructura de carpetas
Repositorios de ejemplo:  

- [Ejemplo UD1 comida](https://github.com/scastellotec/DAM-AD-25-26/tree/main/EjemploUD1_comida)  
- [Ejemplo UD1 sinService](https://github.com/scastellotec/DAM-AD-25-26/tree/main/EjemploUD1_sinService)  

- **Capa Service:** Contiene la lógica de negocio, podría realizar la validación de la información, formatear la información como necesitamos, etc.  
- **Capa Repository:** Se encarga de la interacción con la base de datos (o almacenamiento CSV, XML, etc.)  

### 4.2 Estructura de entidades
La estructura de las entidades a persistir, siguiendo el ejemplo de **alumno, asignatura, matrícula**:  

- **Alumno:** id, nombre y email  
- **Asignatura:** id, nombre, créditos  
- **Matrícula:** agrupa al estudiante con la asignatura y guarda la fecha y la nota de esa matrícula  

> Nota: Al modelar los objetos en Java podéis incluir referencias a otros objetos. Por ejemplo, en asignaturas una lista de estudiantes matriculados. Aunque habrá que tener en cuenta que de cada matrícula guardamos fecha y nota.  

## 5. Requisitos y calificaciones

### Aspectos generales del proyecto (2 Puntos)
- [X] **1,5 Puntos:** Seguir un modelo de capas: Modelo, Repository, Service y Presentación (no son todas obligatorias)  
- [ ] **0,5 Puntos:** Cargar desde un archivo de `.properties` el método de persistencia: XML, CSV o Binario  

### Complejidad del proyecto (3 Puntos)
- [x] **1 Punto:** Uso de 1 entidad, sin relación con otras  
- [ ] **2 Puntos:** Uso de 2 o más entidades con una relación simple 1-N  

### Caso de uso (según la complejidad) (2 Puntos)
- [x] **1 Punto:** Listar entidades guardadas  
- [x] **1 Punto:** Crear nuevas entidades  

### Persistencia en memoria (3 Puntos)
- [x] **1 Punto:** Guardar y cargar entidades en uno o varios ficheros CSV  
- [ ] **1 Punto:** Guardar y cargar entidades en uno o varios ficheros XML  
- [x] **1 Punto:** Guardar y cargar entidades en uno o varios ficheros binarios  
