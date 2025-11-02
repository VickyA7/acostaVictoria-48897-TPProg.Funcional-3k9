package org.example.Caso2;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCaso2 {
    public static void main(String[] args) {

        List<Producto> productos = List.of(
                new Producto("Notebook", "Tecnología", 250000, 5),
                new Producto("Celular", "Tecnología", 180000, 8),
                new Producto("Mouse", "Accesorios", 9000, 30),
                new Producto("Teclado", "Accesorios", 12000, 20),
                new Producto("Silla gamer", "Muebles", 85000, 10),
                new Producto("Mesa escritorio", "Muebles", 95000, 4),
                new Producto("Monitor", "Tecnología", 150000, 7)
        );

        //Ejercicio 1: Listar los productos con precio mayor a 100, ordenados por precio descendente.

        List<Producto> productoCaro = productos.stream()
                .filter(p -> p.getPrecio() > 100000)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());

        //Ejercicio 2: Agrupar productos por categoría y calcular el stock total.

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));

        //Ejercicio 3: Generar un String separando con “;” cada producto que contenga nombre y precio, usando map + collect(joining).

        String nombres = productos.stream()
                .map(Producto::getNombre)
                .collect(Collectors.joining(", "));

        //Ejercicio 4: Calcular el precio promedio general y por categoría.

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println("\n4a) Promedio general de precios: " + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));

        System.out.println("\n4b) Promedio de precios por categoría:");
        promedioPorCategoria.forEach((cat, prom) ->
                System.out.println(cat + ": " + prom));


    }
}