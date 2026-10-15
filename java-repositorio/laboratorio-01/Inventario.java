public class Inventario {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        String producto = "Monitor";
        int unidades = 8;
        double precio = 720000.0;
        boolean disponible = true;

        // Constante (no debe cambiar)
        final double IVA = 0.19;

        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Producto: " + producto);
        System.out.println("Unidades: " + unidades);
        System.out.println("Precio: " + precio);
        System.out.println("Disponible: " + disponible);
        System.out.println("Impuesto (IVA): " + IVA);

        // Simulamos la actualización
        unidades = 5;
        precio = 699000.0;  

        System.out.println("\n=== ESTADO ACTUALIZADO ===");
        System.out.println("Producto: " + producto);
        System.out.println("Unidades actualizadas: " + unidades);
        System.out.println("Precio actualizado: " + precio);
        System.out.println("Disponible: " + disponible);

        // Si intentas descomentar la siguiente línea, el compilador arrojará un error 
        // porque una variable marcada como 'final' no puede ser modificada:
        // IVA = 0.20; 
    }
}