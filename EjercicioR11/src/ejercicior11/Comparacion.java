package ejercicior11;
public class Comparacion {
    
    public double A;
    public double B;
    public double C;    
    // Constructor
    public Comparacion(double A,double B,double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
        
    // Método para calcular el perimetro
    public void metodo() {
        if (A>B && A>C){
            System.out.println(A+" es el numero mayor");
        }
        else if (B>A && B>C){
            System.out.println(B+" es el numero mayor");
        }
        else {
            System.out.println(C+" es el numero mayor");
        }
     }
}

