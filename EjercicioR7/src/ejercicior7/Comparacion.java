package ejercicior7;
public class Comparacion {
    
    public double A;
    public double B;
    
    // Constructor
    public Comparacion(double A,double B) {
        this.A = A;
        this.B = B;
    }
        
    // Método para calcular el perimetro
    public void metodo() {
        if (A>B){
            System.out.println(A+" es mayor que "+B);
        }
        else if (A==B){
            System.out.println(A+" es igual a "+B);
        }
        else {
            System.out.println(A+" es menor que "+B);
        }
     }
}
