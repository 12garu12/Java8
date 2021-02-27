package com.company.interfazfuncional1;

/*
Ejemplo: interfaz funcional
En este ejemplo, estamos implementando una interfaz funcional usando una expresión lambda. Un método
abstracto print () se implementa dentro de la clase Demo usando la expresión lambda.
*/

@FunctionalInterface
public interface Printable {

    public void print();

    public static void  print3D(){
        System.out.println("3D Printing");
    }
}

class Demo{

    public static void main(String[] args) {

        // Implementando una interface funcional usando lamda.
        Printable p = () -> System.out.println("Printing..");

        p.print();
    }

}