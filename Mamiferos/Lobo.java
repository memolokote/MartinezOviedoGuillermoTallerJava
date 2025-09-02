package Mamiferos;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza en manada de " + numCamada + " individuos";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo corre ágilmente en " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con la manada";
    }
}

