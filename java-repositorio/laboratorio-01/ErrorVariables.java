public class ErrorVariables {

    public static void main(String[] args) {
        // Error 1: "20" estaba entre comillas (String), se corrige quitando las comillas para que sea int.
        int edad = 20; 
        
        // Error 2: Faltaba el punto y coma (;) al final de la línea.
        double precio = 85000.0; 
        
        // Error 3: "true" estaba entre comillas (String), se corrige quitando las comillas para que sea boolean.
        boolean activo = true; 

        System.out.println(edad);
        System.out.println(precio);
        System.out.println(activo);
    }
}
