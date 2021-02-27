package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    /*
    Ejemplo: expresión lambda en colección
    Aunque podemos usar la expresión lambda en cualquier lugar para implementar una interfaz funcional, aquí la estamos
    usando para iterar los elementos de la colección. aquí usamos el método forEach () de la interfaz del iterador.
    */

    public static void main(String[] args) {

        List<Number> numeros = Arrays.asList(10, 20, 40, 50);

        System.out.println("Primera forma");
        numeros.forEach(numero -> System.out.println(numero));

        // otra forma
        System.out.println("Segunda forma");
        numeros.forEach(System.out::println);

    }
}
