package pruebafiguras;

public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return (base * altura / 2);
    }
    
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al método calcular hipotenusa */
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    void determinarTipoTriangulo() {
        
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero"); /* Todos sus lados son iguales */
        
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); /* Todos sus lados son diferentes */
        
        else
            System.out.println("Es un triangulo isosceles"); /* De otra manera, es isósceles */
        }
}

