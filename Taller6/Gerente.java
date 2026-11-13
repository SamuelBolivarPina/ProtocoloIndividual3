public class Gerente extends Empleado{
    private String departamento;
    public Gerente(String nombre,double salario){
        super(nombre, salario); // llama a constructor de la clase padre (Empleado)
        this.departamento = departamento;
    }
}
