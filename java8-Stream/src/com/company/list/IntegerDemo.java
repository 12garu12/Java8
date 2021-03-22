package com.company.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100, 130, 180, 110, 120, 140, 170, 160, 300);

        System.out.println("Funcion filter");
        List<Integer> shortLis = numbers.stream().filter( x -> x >= 120).collect(Collectors.toList());
        shortLis.forEach(System.out::println);

        System.out.println("Funcion sort");
        List<Integer> numbersSort = numbers.stream().sorted().collect(Collectors.toList());
        numbersSort.forEach(System.out::println);

        System.out.println("Funcion map");
        List<Integer> numberPerThree = numbers.stream().map( x -> x * 3).collect(Collectors.toList());
        numberPerThree.forEach(System.out::println);

        System.out.println("Numero maximo de una lista");
        int numMax = numbers.stream().max((x, y) -> x > y ? 1 : -1).get();
        System.out.println(numMax);

        System.out.println("Numero minimo de una lista");
        int numMin = numbers.stream().min((a, b) -> a < b ? -1: 1).get();
        System.out.println(numMin);

        System.out.println("Metodo reduce");
        int suma = numbers.stream().reduce(Integer::sum).get();
        System.out.println(suma);

//      convirtiendo una lista en una matriz usando el toArray()método de la secuencia. Devuelve una matriz de Object.
        System.out.println("Lista a una matriz de Object");
        Object[] arr = numbers.stream().toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

    }

}
