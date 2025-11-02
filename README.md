# Tp-Funcional-3k9

Trabajo Práctico sobre **Programación Funcional (Java Streams)** 

**Alumno:** Victoria Acosta  
**Legajo:** 48897
**Comisión:** 3K9

---

## 📝 Descripción del Proyecto

Este proyecto aplica los conceptos de la **programación funcional en Java** (introducidos en Java 8) para resolver **4 casos prácticos**. El objetivo principal es reemplazar la lógica imperativa (bucles `for`, `if` anidados) por un enfoque **declarativo y más expresivo** utilizando la **API de Streams**, **Lambdas** y **Collectors**.

## 🚀 Casos Prácticos Resueltos

### **Caso 1: 🎓 Alumnos**
**Clase:** `Alumno(nombre, nota, curso)`

**Ejercicios:**
1. Obtener nombres de alumnos aprobados (nota ≥ 7) en **mayúsculas y ordenados**.
2. Calcular el **promedio general** de notas usando `average()`.
3. **Agrupar alumnos por curso** usando `Collectors.groupingBy()`.
4. Obtener el **Top 3** de mejores promedios con `sorted()` + `limit()`.

**Conceptos aplicados:**
- `filter()`, `map()`, `sorted()`, `collect()`
- `mapToDouble()` + `average()`
- `Collectors.groupingBy()`

---

### **Caso 2: 🛒 Productos**
**Clase:** `Producto(nombre, categoria, precio, stock)`

**Ejercicios:**
1. Listar productos con **precio > 100**, ordenados por precio **descendente**.
2. Agrupar por categoría y calcular el **stock total** con `Collectors.summingInt()`.
3. Generar un **String concatenado** de productos (`nombre;precio`) usando `Collectors.joining()`.
4. Calcular el **precio promedio** general y por categoría con `Collectors.averagingDouble()`.

**Conceptos aplicados:**
- `filter()` + `sorted()` con `Comparator.reversed()`
- `Collectors.summingInt()` para agregaciones
- `Collectors.joining()` para formateo de cadenas
- Downstream collectors (collectors anidados)

---

### **Caso 3: 📚 Libros**
**Clase:** `Libro(titulo, autor, paginas, precio)`

**Ejercicios:**
1. Listar **títulos de libros con más de 300 páginas**, ordenados alfabéticamente.
2. Calcular el **promedio de páginas** de todos los libros.
3. **Agrupar por autor** y contar cuántos libros tiene cada uno con `Collectors.counting()`.
4. Obtener el **libro más caro** usando `max()` con `Comparator`.

**Conceptos aplicados:**
- `filter()` + `map()` + `sorted()`
- `mapToInt()` + `average()`
- `Collectors.counting()`
- `max()` y `min()` con `Optional`

---

### **Caso 4: 👔 Empleados**
**Clase:** `Empleado(nombre, departamento, salario, edad)`

**Ejercicios:**
1. Filtrar empleados con **salario > 2000** y ordenarlos por salario descendente.
2. Calcular el **salario promedio general**.
3. **Agrupar por departamento** y sumar salarios con `Collectors.summingDouble()`.
4. Obtener los **2 empleados más jóvenes** usando `sorted()` + `limit(2)`.

**Conceptos aplicados:**
- `filter()` + `sorted()` + `limit()`
- `Collectors.summingDouble()`
- `Collectors.groupingBy()` con downstream collectors
- Operaciones sobre primitivos con `mapToDouble()`

---

## 📂 Estructura del Proyecto

```
Tp-Funcional-3k9/
├── src/
│   ├── caso1/
│   │   ├── Alumno.java
│   │   └── MainAlumno.java
│   ├── caso2/
│   │   ├── Producto.java
│   │   └── MainProducto.java
│   ├── caso3/
│   │   ├── Libro.java
│   │   └── MainLibro.java
│   └── caso4/
│       ├── Empleado.java
│       └── MainEmpleado.java
└── README.md
```

---

## 🏃 Cómo Ejecutar

### **Requisitos previos:**
- JDK 17 o superior instalado
- IntelliJ IDEA (Community o Ultimate)

### **Pasos:**

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/Tp-Funcional-3k9.git
   cd Tp-Funcional-3k9
   ```

2. **Abrir en IntelliJ IDEA:**
   - `File` → `Open` → Seleccionar la carpeta del proyecto

3. **Ejecutar cada caso:**
   - Navegar a `src/caso1/MainAlumno.java`
   - Click derecho → `Run 'MainAlumno.main()'`
   - Repetir para `MainProducto`, `MainLibro` y `MainEmpleado`

4. **Ver resultados en consola:**
   - Cada `Main` imprime los resultados de los ejercicios con formato legible

---


