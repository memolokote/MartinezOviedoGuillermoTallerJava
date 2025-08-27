package banco;

public class Transaccion {
    private static int contadorTransacciones = 1;
    private int id;
    private String tipo; // "Depósito" o "Retiro"
    private double monto;
    private int idCuenta;

    public Transaccion(String tipo, double monto, int idCuenta) {
        this.id = contadorTransacciones++;
        this.tipo = tipo;
        this.monto = monto;
        this.idCuenta = idCuenta;
    }

    @Override
    public String toString() {
        return "Transacción ID: " + id + ", Tipo: " + tipo + ", Monto: $" + monto + ", Cuenta ID: " + idCuenta;
    }
}
