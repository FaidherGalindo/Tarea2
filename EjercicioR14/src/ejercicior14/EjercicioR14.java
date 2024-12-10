package ejercicior14;
import java.util.Scanner;
public class EjercicioR14 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de las ventas del departamento 1: ");
        double ventasDepa1 = scanner.nextDouble();

        System.out.print("Ingrese el valor de las ventas del departamento 2: ");
        double ventasDepa2 = scanner.nextDouble();

        System.out.print("Ingrese el valor de las ventas del departamento 3: ");
        double ventasDepa3 = scanner.nextDouble();

        System.out.print("Ingrese el salario de los vendedores: ");
        double salarioVendedores = scanner.nextDouble();

            
        Ventas salarios = new Ventas(ventasDepa1,ventasDepa2,ventasDepa3,salarioVendedores);
        salarios.mostrarInformacion();
    }
}    