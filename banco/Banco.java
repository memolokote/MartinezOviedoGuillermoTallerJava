package banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cuenta> cuentas = new ArrayList<>();
    private List<Transaccion> transacciones = new ArrayList<>();

    public Cuenta crearCuenta(String titular, double depositoInicial) {
        Cuenta cuenta = new Cuenta(titular, depositoInicial);
        cuentas.add(cuenta);
        return cuenta;
    }

    public void depositar(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
        transacciones.add(new Transaccion("Depósito", monto, cuenta.getId()));
    }

    public void retirar(Cuenta cuenta, double monto) {
        if (cuenta.retirar(monto)) {
            transacciones.add(new Transaccion("Retiro", monto, cuenta.getId()));
        } else {
            System.out.println("Saldo insuficiente en la cuenta ID " + cuenta.getId());
        }
    }

    public void mostrarCuentas() {
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
    }

    public void mostrarTransacciones() {
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
    }
}

