package Persona;

public class TestComparacion {
  public static void main (String[] args){
    Persona p = new Persona ("Samuel",18);
    p.edad = 19;
        System.out.println("Edad(acceso de paquete directo)" + p.edad);
        p.setNombre("Samuel Bolivar");
        System.out.println("Nombre (usando metodo get): " + p.getNombre());
    }
}
