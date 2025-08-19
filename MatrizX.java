import java.util.Scanner;

public class MatrizX {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.print("Ingresa el tamaño de la X: ");
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {          // filas
                for (int j = 0; j < n; j++) {      // columnas
                    if (j == i || j == n - i - 1) {
                        System.out.print("x");     // diagonal principal o secundaria
                    } else {
                        System.out.print("_");     // espacio vacío
                    }
            }
            System.out.println();
        }
        }while(n!=0);
        System.out.println("el número ingresado fue 0");

        sc.close();

    }

    
}
