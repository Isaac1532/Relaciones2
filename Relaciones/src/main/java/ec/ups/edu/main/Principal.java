package ec.ups.edu.main;

import java.util.Locale;
import java.util.Scanner;
import ec.edu.ups.clases.Electronico;
import ec.edu.ups.clases.Ropa;
import ec.edu.ups.clases.Usuario;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrarse");
            System.out.println("2. Mostrar productos disponibles");
            System.out.println("3. Agregar producto al carrito");
            System.out.println("4. Ver carrito");
            System.out.println("5. Realizar pedido");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Solicitar datos para registrar al usuario
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese su correo electrónico: ");
                    String correoElectronico = scanner.nextLine();

                    // Crear un nuevo usuario con los datos proporcionados
                    usuario = new Usuario(nombre, apellido, correoElectronico);
                    usuario.registrarse();
                    System.out.println("Usuario registrado con éxito.");
                    break;

                case 2:
                    // Verificar si el usuario está registrado antes de mostrar productos
                    if (usuario == null) {
                        System.out.println("Primero debe registrarse para ver los productos disponibles.");
                        break;
                    }

                    // Mostrar productos disponibles
                    System.out.println("Productos disponibles:");

                    // Mostrar productos electrónicos
                    System.out.println("1. Producto Electrónico");
                    Electronico electronico = new Electronico("Multímetro", 39.99, "Topelek");
                    System.out.println("   " + electronico);

                    // Mostrar productos de ropa
                    System.out.println("2. Producto de Ropa");
                    Ropa ropa = new Ropa("Camiseta", 19.99, "M", "Nike");
                    System.out.println("   " + ropa);
                    break;

                case 3:
                    // Verificar si el usuario está registrado antes de agregar productos al carrito
                    if (usuario == null) {
                        System.out.println("Primero debe registrarse para agregar productos al carrito.");
                        break;
                    }

                    // Solicitar al usuario que elija un producto
                    System.out.print("Seleccione el tipo de producto (1 o 2): ");
                    int tipoProducto = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipoProducto) {
                        case 1:
                            // Producto Electrónico
                            electronico = new Electronico("Multímetro", 39.99, "Topelek");
                            System.out.println("Producto Electrónico disponible:");
                            System.out.println(electronico);
                            usuario.agregarProductoAlCarrito(electronico.getNombre(), electronico.getPrecio());
                            break;

                        case 2:
                            // Producto de Ropa
                            ropa = new Ropa("Camiseta", 19.99, "M", "Nike");
                            System.out.println("Producto de Ropa disponible:");
                            System.out.println(ropa);
                            usuario.agregarProductoAlCarrito(ropa.getNombre(), ropa.getPrecio());
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;

                case 4:
                    // Verificar si el usuario está registrado antes de ver el carrito
                    if (usuario == null) {
                        System.out.println("Primero debe registrarse para ver el carrito.");
                        break;
                    }

                    // Mostrar productos en el carrito
                    System.out.println("Productos en el carrito:");
                    usuario.verCarrito();
                    break;

                case 5:
                    // Verificar si el usuario está registrado antes de realizar un pedido
                    if (usuario == null) {
                        System.out.println("Primero debe registrarse para realizar un pedido.");
                        break;
                    }

                    usuario.realizarPedido();
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }
}
