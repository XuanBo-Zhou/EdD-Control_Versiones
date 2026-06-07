# Práctica Integrada: Biblioteca con Bugs

## Instrucciones Especiales
Esta práctica combina **depuración** y **control de versiones**. Para cada bug:

1. **IDENTIFÍCALO** con el debugger de VS Code
2. **DOCUMÉNTALO** en Issues de GitHub
3. **CREA UN TEST** que lo reproduzca
4. **CORRÍGELO** en un commit separado
5. **VERIFICA** que tu test ahora pasa

## Bugs Conocidos (¡No mires si quieres el desafío!)
<!-- Esto está oculto en detalles -->
<details>
<summary>Lista de bugs (SPOILER)</summary>

1. Libros duplicados permitidos
2. Búsqueda sensible a mayúsculas/minúsculas
3. Puedes prestar un libro ya prestado
4. Puedes devolver un libro ya disponible
5. Listado de disponibles muestra todos
6. Falta método para quitar libros
7. Faltan getters importantes
</details>

## Evidencias Requeridas
Para cada bug, incluir en el PR:
- [ ] Screenshot del breakpoint
- [ ] Screenshot de variables en el momento del error
- [ ] Enlace al issue correspondiente
- [ ] Código del test que lo reproduce

## Estructura del repositorio
```bash
/E2-library-buggy/
├── README.md
├── .gitignore      # Archivos a ignorar (localizado en un directorio superior) 
├── Main.java       # Punto de entrada
├── Book.java
├── Library.java
├── E2-Full_Stack_Developer-Debug+Git.pdf
└── /documentacion/    # Para las capturas de pantalla, entre otras las del debugger
```
## Funcionamiento de la aplicación

La aplicacion es el sistema interno de una biblioteca.

Que permite la:
- **Creacion de libros**: Con el titulo, autor e ISBN, se crea una instancia de libro, con el valor por defecto de la disponibilidad siendo "disponible".

- **Insercion de libros**: Una vez creado el libro se puede insertar en la biblioteca con una validacion que impide duplicados.

- **Prestacion y devolucion de libros**: Que modifica la disponibiliad de los libros alternativamente entre "disponible y no disponible", hay una verificacion para no prestar un libro no disponible, ni recibir un libro que ya fue devuelto.

- **Obtener datos de los libros**: Los cuales son los siguientes,
    - Titulo 
    - Autor
    - Isbn
    - Disponibilidad

- **Busqueda de libros por titulo**: Dado un titulo permite buscar entre todos los libros aquel del titulo dado.

- **Busqueda de libros disponibles**: Devuelve una lista de todos los libros disponibles en la biblioteca.

- **Borrar libros**: Permite eliminar un libro dado el titulo de este mismo.