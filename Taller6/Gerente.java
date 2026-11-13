public class Gerente extends Empleado {
    private String departamento;
    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario); // llama a constructor de la clase padre (Empleado)
        this.departamento = departamento;
    }
    public void mostrarInformacion(){
        mostrarDetalles(); // accede a metodo mostrarDetalles de clase padre (Empleado)
        System.out.println("Departamento: "+ departamento);
    }
}
