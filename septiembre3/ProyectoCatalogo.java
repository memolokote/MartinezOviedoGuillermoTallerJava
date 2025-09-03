package septiembre3;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];

        productos[0] = new IPhone(25000, "Apple", "Negro", "iPhone 14");
        productos[1] = new TvLcd(34000, "Sony", 55);
        productos[2] = new Libro(18000, new Date(), "Eric Gamma", "Elementos Reusables POO", "Alguna editorial");
        productos[3] = new Libro(14000, new Date(), "Martin Fowler", "UML Gota a Gota", "Alguna editorial");
        productos[4] = new Comics(16000, new Date(), "Stan Lee", "Spiderman", "Marvel", "Spiderman");

        for (IProducto p : productos) {
            System.out.println("Precio lista: " + p.getPrecio());
            System.out.println("Precio venta: " + p.getPrecioVenta());

            if (p instanceof IElectronico) {
                IElectronico e = (IElectronico) p;
                System.out.println("Fabricante: " + e.getFabricante());
            }

            if (p instanceof ILibro) {
                ILibro l = (ILibro) p;
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Editorial: " + l.getEditorial());
            }

            if (p instanceof Comics) {
                Comics c = (Comics) p;
                System.out.println("Personaje: " + c.getPersonaje());
            }

            System.out.println("-----------------------------");
        }
    }
}

