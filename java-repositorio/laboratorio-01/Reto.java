public class Reto {
    public static void main(String[] args){
        int codigo = 204;
        String nombre = "Laptop gamer";
        char categoria = 'A';
        double precio = 3500000.0;
        int cantidad = 25;
        boolean activo = true; // Todo en minúscula para que coincida abajo
        
        final double IMPUESTO = 0.19;

        System.out.println("-------------------------");
        System.out.println("       PRODUCTO          ");
        System.out.println("-------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Activo: " + activo);
        System.out.println("Impuesto: " + IMPUESTO);
    }
}