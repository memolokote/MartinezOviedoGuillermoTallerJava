package EjercicioSeptiembre1;

public class Cliente extends Persona {
    private String clienteId;

    public Cliente(String nombre, String email, String clienteId) {
        super(nombre, email);
        this.clienteId = clienteId;
    }

    public String getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId='" + clienteId + '\'' +
                ", " + super.toString() +
                '}';
    }
}
