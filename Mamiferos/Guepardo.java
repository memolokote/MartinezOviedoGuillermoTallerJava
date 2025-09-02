package Mamiferos;

public class Guepardo extends Felino {
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                    double tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza en solitario en las llanuras de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme bajo los arbustos en " + habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad máxima de " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos cortos para comunicarse";
    }
}

