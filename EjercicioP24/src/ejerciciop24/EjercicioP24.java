package ejerciciop24;
import java.util.Scanner;
public class EjercicioP24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Segun enunciado del ejercicio se espera que los pesos de las esferas sean todas distintas\n\n");
        System.out.print("Ingrese el peso de la esfera A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera C: ");
        double C = scanner.nextDouble();
        
        Comparador pesosEsferas = new Comparador(A,B,C);
        pesosEsferas.comparador();

    }
    
}
