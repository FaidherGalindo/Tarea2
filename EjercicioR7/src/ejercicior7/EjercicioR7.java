package ejercicior7;
import java.util.Scanner;

public class EjercicioR7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
   
        Comparacion valores = new Comparacion(A,B);        
        valores.metodo();

    }
}
