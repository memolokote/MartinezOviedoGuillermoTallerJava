import java.util.Scanner;

public class ManejoDeNumeros{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        String opcion = "";
            while(flag){
                System.out.println("seleccione una opcion entre actualizar, eliminar, crear, listar y salir: ");
                opcion = entrada.nextLine();
                switch (opcion) {
                    case "actualizar":
                        System.out.println("Usuario se actualizó exitosamente");
                        break;
                    case "eliminar":
                        System.out.println("Usuario se eliminó correctamente");
                        break;
                    case "crear":
                        System.out.println("Usuario se creó correctamente");
                        break;
                    case "listar":
                        System.out.println("Usuario se listó correctamente");
                        break;
                    case "salir":
                        System.out.println("Haz salido con éxito!");
                        flag = false;
                        break;
                    default:
                        System.out.println("SELECCIONE UNA OPCION VÁLIDA");
                        break;
                }
            }
            entrada.close();
    }
}