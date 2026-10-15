public class RetoProducto {
    public static void main(String[] args) {
        // Declaración de variables básicas del producto
        String nombre = "Mouse inalambrico";
        int codigo = 105;
        double precio = 78000.0;
        int cantidad = 12;
        char categoria = 'A';
        boolean activo = true;
        
        // Constante para el porcentaje de impuesto
        final double IMPUESTO = 0.19;

        // Salida estructurada de la ficha
        System.out.println("-------------------------");
        System.out.println("       PRODUCTO          ");
        System.out.println("-------------------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Activo: " + activo);
        System.out.println("Impuesto: " + IMPUESTO);
    }
}