package ejerciciop23;
import java.util.Scanner;
public class EjercicioP23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Se pretende encontrar las soluciones de la ecuacion de grado 2: Ax^2+Bx+C\n");
        System.out.print("Tenga encuenta que al ser una ecuaicon de grado 2, A debe ser diferente de 0\n");
        System.out.print("Si A=0 ya no seria una ecuacion de grado 2, seria una ecuacion lineal\n\n");
        
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();
        
        EcuacionGrado2 coeficientes = new EcuacionGrado2(A,B,C);
        coeficientes.comparador();
    }
    
}
