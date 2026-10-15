import java.util.Scanner;

public class CotizadorCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar datos de entrada al usuario
        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Descorcentaje de descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        System.out.print("Porcentaje de impuesto (%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        // 2. Realizar los cálculos por etapas usando variables intermedias
        double subtotal = precioUnitario * cantidad;
        
        // Convertimos el porcentaje ingresado a proporción decimal (ej: 10 / 100.0 = 0.10)
        double valorDescuento = subtotal * (descuentoPorcentaje / 100.0);
        double base = subtotal - valorDescuento;
        
        double valorImpuesto = base * (impuestoPorcentaje / 100.0);
        double totalFinal = base + valorImpuesto;

        // 3. Mostrar el resumen ordenado de la compra
        System.out.println("\n=============================");
        System.out.println("       COTIZADOR JAVA        ");
        System.out.println("=============================");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("-----------------------------");
        System.out.println("RESUMEN DE COMPRA");
        System.out.println("-----------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("TOTAL: $" + totalFinal);

        scanner.close();
    }
}
