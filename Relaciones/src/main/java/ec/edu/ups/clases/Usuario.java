package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private Carrito carrito;
    private List<Pedido> pedidos;

    public Usuario(String nombre, String apellido, String correoElectronico) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.carrito = new Carrito();
        this.pedidos = new ArrayList<>();
    }


	public void registrarse() {
        // Lógica para registrar al usuario en la base de datos o donde sea necesario
        System.out.println("Registrando usuario: " + nombre + " " + apellido + "," + "Correo Electronico: "+correoElectronico);
    }


    public void agregarProductoAlCarrito(String nombreProducto, double precio) {
        Producto producto = new Producto(nombreProducto, precio);
        carrito.agregarProducto(producto);
        System.out.println("Producto agregado al carrito: " + nombreProducto);
    }

    public void verCarrito() {
        // Lógica para mostrar el contenido del carrito
        List<Producto> productosEnCarrito = carrito.getProductosEnCarrito();
        System.out.println("Productos en el carrito:");
        for (Producto producto : productosEnCarrito) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
        System.out.println("Total: $" + carrito.getTotal());
    }

    public void realizarPedido() {
        // Lógica para crear un nuevo pedido con los productos en el carrito
        List<Producto> productosEnCarrito = carrito.getProductosEnCarrito();
        if (!productosEnCarrito.isEmpty()) {
            Pedido pedido = new Pedido(productosEnCarrito);
            pedidos.add(pedido);
            carrito.limpiarCarrito();
            System.out.println("Pedido realizado con éxito.");
        } else {
            System.out.println("El carrito está vacío. No se puede realizar el pedido.");
        }
    }

    // Getters y setters

    public Carrito getCarrito() {
        return carrito;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

