public class Coche {
    private String marca;
    private  String modelo;
    private double velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }
    // Métodos Get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    // 2. Metodo para saber si el incremento es positivo +
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Aceleración exitosa. Nueva velocidad máxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento de velocidad debe ser positivo.");
        }
    }
}

