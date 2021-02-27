package com.company.interface_funcional_usando_referencia_de_metodo;

import com.company.interfazfuncional1.Printable;

@FunctionalInterface
public interface printable {

    public void print();

    public static void print3D() {
        System.out.println("3D Printing");
    }

}

class Demo{

    // Implementation of print() abstract method
    public void printColor() {
        System.out.println("Color Printing...");
    }

    public static void main(String[] args) {

        Demo demo = new Demo();

        printable p = demo::printColor;

        p.print();

    }

}