package banco;
public class Cuenta {
    private static int contadorCuentas = 1; // para IDs automáticos
    private int id;
    private String titular;
    private double saldo;

    public Cuenta(String titular, double depositoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta ID: " + id + ", Titular: " + titular + ", Saldo: $" + saldo;
    }
}