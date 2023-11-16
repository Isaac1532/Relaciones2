package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    private List<Producto> productos;
    private double total;

    public Carrito() {
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public List<Producto> getProductosEnCarrito() {
        
        return new ArrayList<>(productos);
    }

    public void limpiarCarrito() {
        productos.clear();
        total = 0.0;
    }

    public double getTotal() {
        return total;
    }
}

