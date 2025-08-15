public class PruebaStrings {
    public static void main(String[] args) {
        //        0123456789...         length() - 1
        String nombre = "  Eloy SaNchez SalmorAn  ";
        String nombre1 = "Eloy Sanchez Salmoran hola Eloy Sanchez hola Salmoran";
    
        System.out.println("length(): " + nombre.length());
        System.out.println("==: " + (nombre == nombre1)); // No es recomendable para comparar objetos
        System.out.println("equals(String b): " + (nombre.equals(nombre1)));
        System.out.println("equalIgnoreCase(String b): " + (nombre.equalsIgnoreCase(nombre1)));
        System.out.println("charAt(int i): " + (nombre.charAt(20)));
    
        System.out.println("nombre: " + nombre);
        System.out.println("trim(): " + nombre.trim());
    
        System.out.println("substring(int a, int b): " + (nombre1.substring(5, 12)));
        System.out.println("substring(int i): " + nombre1.substring(5));
    
        System.out.println("indexOf(String cadena): " + nombre1.indexOf("hola"));
        System.out.println("lastIndexOf(String cadena): " + nombre1.lastIndexOf("hola"));
    
        System.out.println("startWith(String prefijo): " + nombre1.startsWith("R"));
        System.out.println("endWith(String sufijo): " + nombre1.endsWith("n"));
    
        System.out.println("toLowerCase(): " + nombre1.toLowerCase());
        System.out.println("toUpperCase(): " + nombre1.toUpperCase());
    }
    
}
