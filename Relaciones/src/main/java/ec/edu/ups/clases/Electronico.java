package ec.edu.ups.clases;

public class Electronico extends Producto {
    private String modelo;

    public Electronico() {
        // Llama al constructor de la clase base con valores predeterminados
        super("Multímetro", 39.99);
        this.modelo = "Modelo1";
    }

    public Electronico(String nombre, double precio, String modelo) {
        // Llama al constructor de la clase base con valores específicos
        super(nombre, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Electronico [nombre=" + getNombre() + ", precio=" + getPrecio() + ", modelo=" + modelo + "]";
    }
}
