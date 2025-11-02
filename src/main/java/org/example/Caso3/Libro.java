package org.example.Caso3;

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

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;
}
