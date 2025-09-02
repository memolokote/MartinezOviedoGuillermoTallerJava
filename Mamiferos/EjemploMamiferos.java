package Mamiferos;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = new Leon("Sabana Africana", 1.2, 2.1, 190, "Panthera leo", 7.5, 80, 10, 114);
        mamiferos[1] = new Tigre("Selva India", 1.1, 2.3, 220, "Panthera tigris", 8.0, 65, "Bengala");
        mamiferos[2] = new Guepardo("Sabana Africana", 0.9, 1.5, 72, "Acinonyx jubatus", 6.5, 120);
        mamiferos[3] = new Lobo("Bosques de Alaska", 0.8, 1.6, 60, "Canis lupus", "gris", 4.5, 6, "Ártico");
        mamiferos[4] = new Perro("Sabana Africana", 0.75, 1.2, 30, "Lycaon pictus", "moteado", 4.0, 340);

        for (Mamifero animal : mamiferos) {
            System.out.println("---- " + animal.getNombreCientifico() + " ----");
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println();
        }
    }
}

