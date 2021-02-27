package com.company.interfacelamda1;

public class Demo {

    /*
    Ejemplo: expresión lambda con parámetro
Lambda Expression puede tener cero, uno o varios parámetros como hacemos con los métodos. El tipo de parámetro es
inferido por la lambda por lo que es opcional, podemos o no mencionar el parámetro. Vea el ejemplo en el que la
segunda expresión lambda mencionamos el tipo de parámetro.
    */

    public static void main(String[] args) {

        int speed = 100;

        // Expresion lamda que implementa el metodo de la interface
        Runnable r = (carSpeed) -> System.out.println("Running at the speed of " + carSpeed);

        r.run(speed);

        Runnable r1 = (int carSpeed) -> System.out.println("Running at the speed of " + carSpeed);

        r1.run(speed);

    }

}
