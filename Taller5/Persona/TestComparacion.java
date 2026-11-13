package Persona;

public class TestComparacion {
  public static void main (String[] args){
    Persona p = new Persona ("Samuel",18);
      // 1. Acceso a 'edad' (de paquete): Se puede leer y modificar directamente
      // porque estamos dentro del mismo paquete 'taller5'.
    p.edad = 19;
        System.out.println("Edad(acceso de paquete directo)" + p.edad);
      // 2. Acceso a 'nombre' (privado): NO se puede hacer p.nombre = "Juan".
      // Obligatoriamente debemos usar el método público get/set:
        p.setNombre("Samuel Bolivar");
        System.out.println("Nombre (usando metodo get): " + p.getNombre());
    }
}
