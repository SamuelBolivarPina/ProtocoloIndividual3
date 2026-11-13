package Taller6;
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre,double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
protected void mostrarDetalles(){
    System.out.println("Nombre: "+ nombre + "Salario: " + salario);
    }
}
