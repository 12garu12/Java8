package com.company.interfacelamda2;

public class Demo {

    public static void main(String[] args) {

        // Expresion lamda sin retorno
        Runnable r = (carSpeed, distance) -> (distance +"Km at the speed of "+carSpeed);

        // Llamando al metodo
        String r15 = r.run(80, 150);
        System.out.println(r15);

        Runnable r1 = (int velocidad, int distancia) -> ("Distancia recorrida a " + velocidad + "km a la" +
                "velocidad de " + distancia);

        String carro = r1.run(100, 200);
        System.out.println(carro);

    }

}
