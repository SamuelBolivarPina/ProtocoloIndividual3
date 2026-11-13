package ejercicio3;

public class Banco {
    private double saldo; /* si usamos protected lo que sucedera es que
                            Permitira que cualquier clase hija (subclase)
                            o cualquier otra clase dentro del mismo paquete modifique el saldo
                            sin control para solucionar eso usariamos private en vez de protected
                           */

public Banco(double saldoInicial){
    if (saldoInicial >= 0){
        this.saldo= saldoInicial;
    } else{
        this.saldo = 0;
        }
    }
    public double getSaldo(){
    return saldo;
    }
    public void depositar(double monto){
    if (monto > 0){
        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
    }
    else {
        System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }
}


