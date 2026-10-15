public class Operadores {

    public static void main(String[] args) {
        // 1. División entera vs decimal
        int resultadoEntero = 5 / 2;
        double resultadoDecimal = 5.0 / 2;
        
        System.out.println("División entera (5 / 2): " + resultadoEntero);
        System.out.println("División decimal (5.0 / 2): " + resultadoDecimal);

        // Probando la trampa común
        double otroResultado = 5 / 2;
        System.out.println("Otro resultado (double con enteros): " + otroResultado);

        System.out.println("-----------------------------------");

        // 2. Ejemplo del operador residuo (%)
        int totalMinutos = 135;
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;
        
        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes: " + minutos);
    }
}