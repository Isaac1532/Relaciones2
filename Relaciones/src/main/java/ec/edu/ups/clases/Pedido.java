package ec.edu.ups.clases;

import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0; // variable estática para generar números de pedido únicos
    private int numero;
    private List<Producto> productos;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
        this.numero = generarNumeroPedidoUnico();
    }

    // Constructor sin parámetros
    public Pedido() {
        this.numero = generarNumeroPedidoUnico();
    }

    private int generarNumeroPedidoUnico() {
        // Incrementar el contador de pedidos y usarlo como número de pedido único
        contadorPedidos++;
        return contadorPedidos;
    }

    // Métodos de acceso a los atributos
    public int getNumero() {
        return numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    // Otros métodos que puedas necesitar para manipular o mostrar la información del pedido
}

