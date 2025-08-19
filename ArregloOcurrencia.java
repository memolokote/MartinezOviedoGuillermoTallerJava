import java.util.Scanner;

public class ArregloOcurrencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10]; 
        //mensaje de entrada
        System.out.println("Ingresa 10 números del 1 al 10:");
        // for para llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = sc.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println("Número inválido. Debe ser entre 1 y 10.");
                }
            } while (num < 1 || num > 10);

            arreglo[i] = num;
        }

        //vemos que numero se repitio más
        int numero1=0, numero2=0, numero3=0, numero4=0, numero5=0, numero6=0, numero7=0, numero8=0, numero9=0;
    
        for (int numero : arreglo) {
            switch (numero) {
                case 1: numero1++; break;
                case 2: numero2++; break;
                case 3: numero3++; break;
                case 4: numero4++; break;
                case 5: numero5++; break;
                case 6: numero6++; break;
                case 7: numero7++; break;
                case 8: numero8++; break;
                case 9: numero9++; break;
            }
        }
    
        int[] conteo = {numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9};
    
        int max = conteo[0];
        int maxNum = 1; 
        //en esta parte contamos el máximo y sacamos que número fue
        for (int i = 0; i < conteo.length-1; i++) {
            if (conteo[i] > max) {
                max = conteo[i];
                maxNum = i + 1; 
            }
        }
    
        System.out.println("Número más repetido: " + maxNum);
        System.out.println("Ocurrió " + max + " veces");
        sc.close();
    }

}   

