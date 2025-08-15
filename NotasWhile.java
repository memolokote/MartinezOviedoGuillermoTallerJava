import java.util.Scanner;

public class NotasWhile{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        int notas1 = 0;
        double promedio6=0;
        int contador1=0;
        double promedioMayor=0;
        int contador2=0;
        
        for(int i =0;i<20;i++){
            System.out.println("Ingrese las nota del alumno en una escala del 1 al 10: ");
            nota = entrada.nextDouble();
            //Si se agrega una nota menor a 1 se envia error y se termina el ciclo 
            if (nota < 1){
                System.out.println("error: la nota debe estar entre 1 y 10");
                return;
            }//si la nota es menor que 6 se aumenta el contador 1 y se suma la nota al promedio con menos que 6
            if(nota < 6){
                promedio6 +=nota;
                contador1 +=1;
            }
            if(nota >= 6){
                promedioMayor+=nota;
                contador2 +=1;
            }//finalemnte si la nota era uno se aumenta el contaodr de 1
            if(nota == 1){
                notas1 +=1;
            }
        }
        
        System.out.println("notas igual a 1: " + notas1);
        System.out.println("promedio de notas menor a 6: " + (promedio6/contador1));
        System.out.println("promedio de notas mayores o iguales a 6: " + (promedioMayor/contador2));
        entrada.close();
    }
}