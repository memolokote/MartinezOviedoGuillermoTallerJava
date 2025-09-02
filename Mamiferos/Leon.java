package Mamiferos;

public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras de " + habitat;
    }

    @Override
    public String dormir() {
        return "El León duerme en " + habitat + " tras rugir a " + potenciaRugidoDecibel + " dB";
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h persiguiendo a su presa";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " dB";
    }
}

