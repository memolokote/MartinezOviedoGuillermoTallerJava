package Mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 double tamGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " acecha silenciosamente a su presa en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme bajo la sombra en " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre corre con fuerza alcanzando " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge para marcar su territorio";
    }
}

