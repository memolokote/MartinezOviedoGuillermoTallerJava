package EjercicioSeptiembre1;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana Pérez", "ana.perez@empresa.com",  45000.0, 120000.0);

        // Imprimir datos completos (propios y heredados) vía toString()
        System.out.println(g);

        // Probar aumentar sueldo
        g.aumentarSueldo(10); // +10%
        System.out.println("Después de aumento del 10%: " + g.getSueldo());

        // Modificar presupuesto vía setter
        g.setPresupuesto(150000.0);
        System.out.println("Después de ajustar presupuesto: " + g.getPresupuesto());

        // Volver a imprimir todo
        System.out.println("Estado final del gerente: " + g);
    }
}
