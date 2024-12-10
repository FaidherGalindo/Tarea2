package ejercicior15;
import java.util.Scanner;
public class EjercicioR15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del peso de la esfera 1: ");
        double pesoEsfera1 = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del peso de la esfera 2: ");
        double pesoEsfera2 = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del peso de la esfera 3: ");
        double pesoEsfera3 = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del peso de la esfera 4: ");
        double pesoEsfera4 = scanner.nextDouble();
        
        Esferas pesos = new Esferas(pesoEsfera1,pesoEsfera2,pesoEsfera3,pesoEsfera4);
        pesos.ComparadorPesos();


    }
    
}
