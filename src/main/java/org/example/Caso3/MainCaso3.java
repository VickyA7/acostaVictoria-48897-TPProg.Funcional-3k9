package org.example.Caso3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCaso3 {
    public static void main(String[] args) {
        List<Libro> libros= List.of(
                new Libro("El Quijote", "Cervantes", 12000, 10500),
                new Libro("Cien años de soledad", "Garcia Marquez", 18000, 19670),
                new Libro("Rayuela", "Cortazar", 15000, 1963),
                new Libro("El principito", "Saint-Exupery", 8000, 8430),
                new Libro("1984", "Orwell", 9500, 9490),
                new Libro("Fahrenheit 451", "Bradbury", 10000, 19530),
                new Libro("El amor en los tiempos del colera", "Garcia Marquez", 16000, 15850)
        );

//Ejercicio 1: Listar los títulos de los libros con más de 300 páginas, ordenados alfabéticamente.

        List<String> baratos = libros.stream()
                .filter(l -> l.getPrecio() < 12000)
                .map(Libro::getTitulo)
                .collect(Collectors.toList());

        System.out.println("1) Libros con precio menor a 12000: " + baratos);

//Ejercicio 2: Calcular el promedio de páginas de todos los libros.

        Libro masCaro = libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio))
                .orElse(null);

        System.out.println("\n2) Libro mas caro: " + masCaro);

//Ejercicio 3: Agrupar los libros por autor y contar cuántos libros tiene cada uno.

        Map<String, List<String>> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(
                        Libro::getAutor,
                        Collectors.mapping(Libro::getTitulo, Collectors.toList())
                ));

        System.out.println("\n3) Libros agrupados por autor:");
         librosPorAutor.forEach((autor, titulos) ->
                System.out.println(autor + ": " + titulos));

//Ejercicio 4: Obtener el libro más caro de la lista

        Map<String, Double> promedioPorAutor = libros.stream()
                .collect(Collectors.groupingBy(
                        Libro::getAutor,
                        Collectors.averagingDouble(Libro::getPrecio)
                ));

        System.out.println("\n4) Promedio de precios por autor:");
        promedioPorAutor.forEach((autor, promedio) ->
                System.out.println(autor + ": " + promedio));

    }
}

