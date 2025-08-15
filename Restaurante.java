import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double totalVentas = 0;

        do {
            // Menú
            System.out.println("\n--- Menú del Cajero ---");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar total de ventas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el precio del pedido: ");
                    double precio = entrada.nextDouble();

                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado con éxito.");
                    } else {
                        System.out.println("Error: El precio debe ser positivo.");
                    }
                    break;

                case 2:
                    System.out.println("Total de ventas: $" + totalVentas);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 3);

        entrada.close();
    }
}

