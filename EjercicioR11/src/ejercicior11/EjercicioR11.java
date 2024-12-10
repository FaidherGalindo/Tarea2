package ejercicior11;
import java.util.Scanner;
public class EjercicioR11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();
   
        Comparacion valores = new Comparacion(A,B,C);        
        valores.metodo();

    }
}
