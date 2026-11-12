package pruebas;

import vehiculos.Vehiculo;

public class MainExterno {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();

        // --- ERROR DE COMPILACIÓN ---
        // System.out.println(v.tipo);
        // Java te arroja un error indicando que 'tipo' no es visible,
        // porque el modificador de paquete impide acceder a él desde el paquete 'pruebas'.
    }
}
