package ejerciciop24;
public class Comparador {

// Atributos
    public double A;
    public double B; 
    public double C;
    
    // Constructor
    public Comparador(double A,double B,double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    
    //MetodoS
    public void comparador() {  
        if (A>B && A>C){
            System.out.println("la esfera de mayor peso es la esfera A");
        }
        
        else if (B>A && B>C){
            System.out.println("la esfera de mayor peso es la esfera B");
        }
         
        else {
            System.out.println("la esfera de mayor peso es la esfera C");
        }
}
}
