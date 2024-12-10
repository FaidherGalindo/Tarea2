package ejercicior12;
import java.util.Scanner;
public class EjercicioR12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Aca para solicitar datos al usuario

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();
        
        
        // Se crea un objeto "empleado" con los datos ingresados
        Empleado empleado = new Empleado(nombre, apellido, horas, valorHora);

        // Aca para mostrar la información del empleado
        empleado.mostrarInformacion();
        
    }
    
}
