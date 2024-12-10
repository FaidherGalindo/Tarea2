package ejerciciop22;
import java.util.Scanner;
public class EjercicioP22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el valor de la hora trabajada del empleado: ");
        double valorDeLaHoraTrabajada = scanner.nextDouble();

        System.out.print("Ingrese el valor de la hora trabajada del empleado: ");
        double numeroDeHorasTrabajadas = scanner.nextDouble();
        
        Empleado empleado1 = new Empleado(nombre,apellido,valorDeLaHoraTrabajada,numeroDeHorasTrabajadas);
        empleado1.comparador();
    }
    
}