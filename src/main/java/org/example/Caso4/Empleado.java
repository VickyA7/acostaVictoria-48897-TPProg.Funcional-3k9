package org.example.Caso4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Nos ahorra armar el constructor
@AllArgsConstructor
//Getter y Setter nos ahorra hacer getter y setter con cada atributo
@Getter
@Setter

//Nos ahorra crear el bloque con la impresion de todos los atributos
@ToString

public class Empleado {
    private String nombre;
    private String departamento;
    private double salario;
    private int edad;
}
