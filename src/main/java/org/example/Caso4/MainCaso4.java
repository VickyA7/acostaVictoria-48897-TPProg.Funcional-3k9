package org.example.Caso4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainCaso4 {
    public static void main(String[] args) {
        List<Empleado> empleados = List.of(
                new Empleado("Juan", "Ventas", 2500, 28),
                new Empleado("Maria", "Ventas", 1700, 32),
                new Empleado("Carlos", "IT", 4000, 35),
                new Empleado("Lucia", "IT", 1500, 41),
                new Empleado("Pedro", "RRHH", 3000, 45),
                new Empleado("Sofia", "Ventas", 2300, 24),
                new Empleado("Andres", "IT", 2000, 29),
                new Empleado("Valentina", "RRHH", 1000, 38)
        );


//Ejercicio 1: Obtener la lista de empleados cuyo salario sea mayor a 2000, ordenados por salario descendente.

        List<Empleado> empleadosBienPagados = empleados.stream()
                .filter(emp -> emp.getSalario() > 2000)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .collect(Collectors.toList());

        System.out.println("1) Empleados con salario > 2000 : " + empleadosBienPagados);

//Ejercicio 2: Calcular el salario promedio general.

        double promedio = empleados.stream()
                .collect(Collectors.averagingDouble(Empleado::getSalario)); //Promedio con collectors

        System.out.println("2) Salario promedio general: " + promedio);

//Ejercicio 3: Agrupar los empleados por departamento y calcular la suma de salarios de cada uno.

        Map<String, Double> salariosPorDepto = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.summingDouble(Empleado::getSalario)
                ));
        System.out.println("3) Departamentos con el total de salario de cada uno: ");
        salariosPorDepto.forEach((depto, suma) ->
                System.out.println(depto + " -> " + suma)
        );

//Ejercicio 4: Obtener los nombres de los 2 empleados más jóvenes.
        System.out.println("4) Los 2 empleados mas jovenes: ");
        empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .limit(2)
                .map(Empleado::getNombre)
                .forEach(System.out::println);

    }
}