package ejercicior13;
import java.util.Scanner;
public class EjercicioR13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorDeLaCompra = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("\nEntre estas opciones: blanca,verde,amarilla,azul,roja\n");
        System.out.print("Si se ingresa una opcion distinta a las disponibles, se asumira automaticamente como una bolita roja.\n\n");
        System.out.print("Ingrese el color de la bolita en minuscula: ");
        String ColorDeLaBolita = scanner.nextLine();
        
        Descuento cliente = new Descuento(valorDeLaCompra,ColorDeLaBolita);
        cliente.mostrarInformacion();
    }
}    

