package org.example.Caso1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCaso1 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Victoria", 9.5 , "A"),
                new Alumno("Pedro", 6.0, "B"),
                new Alumno("Leticia", 9.0, "A"),
                new Alumno("Juan", 7.0, "C"),
                new Alumno("Ana", 6.5, "B"),
                new Alumno("Marta", 8.0, "A"),
                new Alumno("Sofía", 9.5, "C"),
                new Alumno("Diego", 5.0, "B"),    // Desaprobado para ver el filter
                new Alumno("Lucía", 10.0, "A"),   // Nota perfecta para el Top 3
                new Alumno("Martín", 7.5, "C")
                );

        //Ejercicio 1: Obtener los nombres de los alumnos aprobados (nota ≥ 7) en mayúsculas y ordenados.

        List<String> aprobado = alumnos.stream() //introduzco el uso de stream
                .filter(alumno -> alumno.getNota()>= 7) //Utilizo estructura lambda, filtro alumnos con nota >=7
                .map(Alumno::getNombre) //Del conjunto de alumnos que trajimos queremos SOLO atributo nombre
                .map(String::toUpperCase) //De nombre, que es un String, lo modifico y lo hago mayuscula
                .sorted() //esto es para ordenarlos
                .collect(Collectors.toList()); //Operacion terminal

        System.out.println("1) Aprobados (en mayúscula y ordenados): " + aprobado);

        //Ejercicio 2: Calcular el promedio general de notas.

        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)  //transfroma a un stream double
                .average() // este lo utilizamos para calcular promedio
                .orElse(0.0);

        System.out.println("2) Promedio general de notas: " + promedio);

        //Ejercicio 3: Agrupar alumnos por curso usando Collectors.groupingBy().

        Map<String, List<Alumno>> alumnoPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("3) Alumnos agrupados por curso: ");

        //Ejercicio 4: Obtener los 3 mejores promedios.

        List<Alumno> alumnoTop3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed()) //Ordenamos descendentemente con reversed
                .limit(3)  //Queremos solo los 3 primeros
                .collect(Collectors.toList());

        System.out.println("4) Top 3 de alumnos segun promedio: " + alumnoTop3);
    }
}
