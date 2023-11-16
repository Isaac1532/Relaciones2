package ec.edu.ups.clases;

public class Producto {
    private String nombre;
    private double precio;
    
    public Producto() {}
    public void verProductos() {
    	Ropa camiseta = new Ropa();
    	Electronico multimetro = new Electronico();
    	System.out.println();
    	System.out.println(camiseta);
    	System.out.println();
    	System.out.println(multimetro);
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
}
