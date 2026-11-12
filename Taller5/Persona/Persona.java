package Persona;

public class Persona {
    private String nombre;
    int edad;

    public Persona (String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
}
