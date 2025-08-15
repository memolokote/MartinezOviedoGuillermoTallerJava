import java.util.Scanner;
public class Entrada {

    public static void main(String[] args){
        //Nombre de la clase  nombreObjeto = new nombreConstructor()
        String nombre1;
        String nombre2;
        String nombre3;
        String resultado = "";
        int edad;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre1 = entrada.nextLine();
        System.out.println("Ingrese el segundo nombre: ");
        nombre2 = entrada.nextLine();
        System.out.println("ingrese el tercer nombre: ");
        nombre3 = entrada.nextLine();
        resultado = resultado + nombre1.substring(1,2).toUpperCase() + "." +  nombre1.substring(nombre1.length()-2);
        
        System.out.println("resultado:" + resultado);
        System.out.println("nombre1:" + nombre1);
        //System.out.println("Hola "+ nombre + " tienes " + edad +" años");
        entrada.close();
    }
}
