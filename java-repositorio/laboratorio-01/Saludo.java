import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada de la terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine(); // Lee una línea de texto

        System.out.println("Hola, " + nombre);

        // Cerramos el scanner al terminar de usarlo
        scanner.close();
    }
}
