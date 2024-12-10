package ejerciciop19;
public class TrianguloEquilatero {

    public double lado;
    
    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    
    // Método para calcular el perimetro
    public double perimetro() {
        return lado*3;
    }

    // Método para calcular la altura
    public double altura() {
        return (lado*Math.sqrt(3))/2;
    }

    // Método para calcular el area
    public double area() {
        return (lado*((lado*Math.sqrt(3))/2))/2;
    }


    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("----------Datos del triangulo equilatero---------");
        System.out.println("-------------------------------------------------");
        System.out.println("perimetro: " + perimetro());
        System.out.println("altura: " + altura());
        System.out.println("area: " + area());
        System.out.println("-------------------------------------------------");
    }

    
}
