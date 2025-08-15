import java.util.Scanner;
public class Menor {

    public static void main(String[] args){
        int cantidad =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a comparar: (al menos 10) ");
        cantidad = entrada.nextInt();
        int numero=0;
        int menor = 0;
        //si no se escriben al menos 10 numeros se seguira pidiendo un numero hasta que se escriba 10 o mas 
        while (cantidad < 10){
            System.out.println("favor de ingresar al menos 10 numeros enteros");
            System.out.println("Ingrese la cantidad de numeros a comparar: (al menos 10) ");
            cantidad = entrada.nextInt();
        }   // se entra al for la cantidad ingresada
            for(int i=0;i< cantidad;i++){
                System.out.println("ingrese un numero a comparar: ");
                numero= entrada.nextInt();
                //la primera vez que se entra al for se asigna el valor de numero a menor
                if(i == 0){
                    menor = numero;
                }else if (numero < menor){ //se cambia el valor de menor si el numero actual es menor
                    menor = numero;
                }
            }
        if (menor < 10){ //ultimas comparaciones
            System.out.println("el numero menor es menor que 10");
        }else {
            System.out.println("el numero menor es mayor o igual a 10");
        }

     
     
        //System.out.println("Hola "+ nombre + " tienes " + edad +" años");
        entrada.close();
    }
}