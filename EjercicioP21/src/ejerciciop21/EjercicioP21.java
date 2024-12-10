package ejerciciop21;
import java.util.Scanner;
public class EjercicioP21 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el valor del primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el valor del segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el valor del tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();
   
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

        // Aca para mostrar la información del triangulo
        triangulo.mostrarInformacion();
       
    }
}
