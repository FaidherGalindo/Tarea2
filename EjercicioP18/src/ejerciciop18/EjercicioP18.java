package ejerciciop18;
import java.util.Scanner;
public class EjercicioP18 {
    // Método principal para probar la clase Empleado
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        // Aca para solicitar datos al usuario
        System.out.print("Ingrese el codigo del empleado: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        double porcentaje = scanner.nextDouble();

        
        
        // Se crea un objeto "empleado" con los datos ingresados
        Empleado empleado = new Empleado(codigo, nombre, apellido, horas, valorHora, porcentaje);

        // Aca para mostrar la información del empleado
        empleado.mostrarInformacion();
    }
}
