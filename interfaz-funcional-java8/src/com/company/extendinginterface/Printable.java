package com.company.extendinginterface;

/*
No válido: interfaz ampliada
Una interfaz funcional no puede extender ninguna interfaz que tenga uno o más métodos abstractos. El compilador
informará de un error en el momento de la compilación.
*/

@FunctionalInterface
public interface Printable extends Drawable{

    public void print();
    public static void print3D() {
        System.out.println("3D Printing");
    }

}
