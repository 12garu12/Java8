package com.company;

public class Main {

//    Ejemplo: implementación de subprocesos con Lambda
//    La interfaz Java Runnable es una interfaz funcional que contiene un único método abstracto. Podemos implementar su
//    método run () usando la expresión lambda y crear una instancia de subproceso como hicimos en el siguiente ejemplo.

    public static void main(String[] args) {

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running...");
            }
        };

        new Thread(run).start();

        Runnable run1 = () -> System.out.println("Thread Running using lambda...");
        new Thread(run1).start();


    }
}
