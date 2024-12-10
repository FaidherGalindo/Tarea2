package ejerciciop19;
import java.util.Scanner;

/*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. 
 */
public class EjercicioP19 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el valor lado del triangulo quilatero: ");
        double lado = scanner.nextDouble();
   
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        // Aca para mostrar la información del triangulo
        triangulo.mostrarInformacion();
       
    }
}
