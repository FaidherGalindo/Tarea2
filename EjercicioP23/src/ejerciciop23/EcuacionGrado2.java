package ejerciciop23;
public class EcuacionGrado2 {

    // Atributos
    public double A;
    public double B; 
    public double C;
    
    // Constructor
    public EcuacionGrado2(double A,double B,double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    
    //Metodos
    
    public double determinante() {
        return B*B-4*A*C;
    }
    
    public void comparador() {
           
        if (determinante()<0){
            
            double parteReal = -B/(2*A);
            double parteImaginaria = Math.sqrt(-determinante())/(2*A);
            
            System.out.println("la solucion 1 es: "+parteReal+" + i * "+parteImaginaria);
            System.out.println("la solucion 2 es: "+parteReal+" - i * "+parteImaginaria);
        }
        else {
            
            double solucion1=-B/(2*A)+Math.sqrt(B*B-4*A*C)/(2*A);
            double solucion2=-B/(2*A)-Math.sqrt(B*B-4*A*C)/(2*A);
            
            System.out.println("\n\nla solucion 1 es: "+solucion1 );
            System.out.println("la solucion 2 es: "+solucion2);
            }
        }
}

