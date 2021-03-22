package com.company.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("CHERRY");
        fruits.add("BANANA");
        fruits.add("APPLE");
        fruits.add("COCONUT");

//      lista de la clase Stream
        System.out.println("Lista de la clase Stream");
        Stream<String> stream = fruits.stream().map(x -> x.toLowerCase());
        stream.forEach(System.out::println);
        System.out.println();

//      lista  de la clase List
        System.out.println("Lista de la clase List");
        List<String> fruitsList = fruits.stream().map(String::toLowerCase).collect(Collectors.toList());
        fruitsList.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista ordenada de la clase List");
        List<String> fruitsSort = fruits.stream().sorted().collect(Collectors.toList());
        fruitsSort.forEach(System.out::println);

        System.out.println("Lista de frutas que comienzan con C");
        List<String> fruitWithC = fruits.stream().filter(x -> x.startsWith("C")).collect(Collectors.toList());
        fruitWithC.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista Ordenada y alrreves");
        List<String> fruitsReverse = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        fruitsReverse.forEach(System.out::println);

        System.out.println("Lista Pasada a letras mayusculas");
        List<String> fruitsToUp = fruitsList.stream().map(String::toUpperCase).collect(Collectors.toList());
        fruits.forEach(System.out::println);

        System.out.println("Sacar un solo elemento de una lista");
        String fruta = fruits.stream().limit(1).collect(Collectors.joining());
        System.out.println(fruta);
    }
}
