public class PerfilAprendiz {
    public static void main(String[] args){
        String nombre = "Santiago";
        int edad = 20;
        int trimestre = 4;
        double promedio = 4.5;
        boolean activo = true;




        System.out.println("=== FICHA DEL APRENDIZ (INICIAL) ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Trimestre: " + trimestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);

        
        trimestre = 5;
        promedio = 4.8;

        
        System.out.println("\n=== FICHA DEL APRENDIZ (ACTUALIZADA) ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Trimestre actual: " + trimestre); 
        System.out.println("Promedio actual: " + promedio);   
        System.out.println("Activo: " + activo);
    }
}

    

