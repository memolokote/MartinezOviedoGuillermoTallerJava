package banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear cuentas
        Cuenta ana = banco.crearCuenta("Ana", 5000);
        Cuenta luis = banco.crearCuenta("Luis", 10000);

        // Operaciones
        banco.depositar(ana, 2000);
        banco.retirar(ana, 1000);

        banco.retirar(luis, 3000);
        banco.depositar(luis, 1500);

        // Mostrar resultados
        System.out.println("=== Cuentas ===");
        banco.mostrarCuentas();

        System.out.println("\n=== Transacciones ===");
        banco.mostrarTransacciones();
    }
}
