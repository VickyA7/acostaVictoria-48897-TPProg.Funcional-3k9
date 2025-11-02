package org.example.Caso2;


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

        //Ejercicio 2: Agrupar productos por categoría y calcular el stock total.

        //Ejercicio 3: Generar un String separando con “;” cada producto que contenga nombre y precio, usando map + collect(joining).

        //Ejercicio 4: Calcular el precio promedio general y por categoría.


    }
}