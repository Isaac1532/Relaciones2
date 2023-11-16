package ec.edu.ups.clases;


public class Ropa extends Producto {
    private String talla;
    private String marca;

    public Ropa() {
        // Llama al constructor de la clase base con valores predeterminados
        super("Camiseta", 19.99);
        this.talla = "M";
        this.marca = "Nike";
    }

    public Ropa(String nombre, double precio, String talla, String marca) {
        // Llama al constructor de la clase base con valores específicos
        super(nombre, precio);
        this.talla = talla;
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa [nombre= " + getNombre() + ", precio= " + getPrecio() + ", talla= " + talla + ", marca= "+marca + "]";
    }
}

  
