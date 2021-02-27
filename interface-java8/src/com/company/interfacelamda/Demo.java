package com.company.interfacelamda;

public class Demo {

    public static void main(String[] args) {
        int speed = 100;

        Runnable r = () -> {
            System.out.println("Running at the speed of " + speed);
        };

        r.run();

    }

}
