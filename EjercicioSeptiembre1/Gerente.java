package EjercicioSeptiembre1;


public class Gerente extends Empleado {
    private double presupuesto;
  

    public Gerente(String nombre, String email, double sueldo, double presupuesto) {
        super(nombre, email, sueldo);
        this.presupuesto = presupuesto;
       
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    // setter solicitado para presupuesto
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "presupuesto=" + presupuesto +
                ", " + super.toString() +
                '}';
    }
}

