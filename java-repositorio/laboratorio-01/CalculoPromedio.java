public class CalculoPromedio {
    public static void main(String[] args) {
        // Calificaciones enteras
        int nota1 = 4;
        int nota2 = 5;
        int nota3 = 3;
        
        // Usamos 3.0 para forzar una división decimal y no perder precisión
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio final: " + promedio);
    }
}
