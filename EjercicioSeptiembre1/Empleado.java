package EjercicioSeptiembre1;

public class Empleado extends Persona {
    private static int contadorEmpleado;
    private int empleadoId;
    private double sueldo;

    public Empleado(String nombre, String email, double sueldo) {
        super(nombre, email);
        this.empleadoId = contadorEmpleado++;
        this.sueldo = sueldo;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getSueldo() {
        return sueldo;
    }

    /**
     * Aumenta el sueldo en un porcentaje
     * Si pasas un valor negativo, reduce el sueldo.
     */
    public void aumentarSueldo(double porcentaje) {
        this.sueldo += this.sueldo * (porcentaje / 100.0);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "empleadoId='" + empleadoId + '\'' +
                ", sueldo=" + sueldo +
                ", " + super.toString() +
                '}';
    }
}

