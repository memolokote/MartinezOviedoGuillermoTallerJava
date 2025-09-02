package Mamiferos;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 String color, double tamColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro caza en grupo usando sus mordidas de " + fuerzaMordida + " psi";
    }

    @Override
    public String dormir() {
        return "El Perro de color " + color + " duerme bajo la sombra en " + habitat;
    }

    @Override
    public String correr() {
        return "El Perro corre velozmente en " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Perro ladra y aúlla para comunicarse";
    }
}

