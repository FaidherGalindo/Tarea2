package ejerciciop21;
/*
Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo. 
*/
public class Triangulo {
   
    public double lado1;
    public double lado2;
    public double lado3;
    
    // Constructor
    public Triangulo(double lado1,double lado2,double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    
    // Método para calcular el perimetro
    public double perimetro() {
        return lado1+lado2+lado3;
    }

    // Método para calcular el semiperimetro
    public double semiperimetro() {
        return perimetro()/2;
    }

    // Método para calcular el area usando la formula de heron
    public double area() {
        double s = semiperimetro();
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }


    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("--------------Datos del triangulo----------------");
        System.out.println("-------------------------------------------------");
        System.out.println("perimetro: " + perimetro());
        System.out.println("semiperimetro: " + semiperimetro());
        System.out.println("area: " + area());
        System.out.println("-------------------------------------------------");
    }    
    
    
}
