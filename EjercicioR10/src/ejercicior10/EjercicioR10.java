package ejercicior10;
import java.util.Scanner;
public class EjercicioR10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el numero de inscripcion: ");
        double numero_de_inscripcion = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el patrimonio: ");
        double patrimonio = scanner.nextDouble();
        System.out.print("Ingrese el estrato social: ");
        double estrato_social = scanner.nextDouble();
        
        LiquidarMatricula estudiante = new LiquidarMatricula(numero_de_inscripcion,nombre,apellido,patrimonio,estrato_social);        
        estudiante.comparacion();      
        
    }
    
}
