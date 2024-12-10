package ejercicior15;
public class Esferas {
    // Atributos
    public double pesoEsfera1;
    public double pesoEsfera2;
    public double pesoEsfera3;
    public double pesoEsfera4;
    
    // Constructor
    public Esferas(double pesoEsfera1,double pesoEsfera2,double pesoEsfera3,double pesoEsfera4) {
        this.pesoEsfera1 = pesoEsfera1;
        this.pesoEsfera2 = pesoEsfera2;
        this.pesoEsfera3 = pesoEsfera3;
        this.pesoEsfera4 = pesoEsfera4;
    }
    
    public void ComparadorPesos() {
           
        if (pesoEsfera1==pesoEsfera2 && pesoEsfera1==pesoEsfera3){
            System.out.println("La esfera 4 es la diferente");
            if (pesoEsfera1<pesoEsfera4){
                System.out.println("La esfera 4 tiene mayor peso");
            }
            else {
                System.out.println("La esfera 4 tiene menor peso");
            }
        }
        else if (pesoEsfera1==pesoEsfera2 && pesoEsfera1==pesoEsfera4){
            System.out.println("La esfera 3 es la diferente");
            if (pesoEsfera1<pesoEsfera3){
                System.out.println("La esfera 3 tiene mayor peso");
            }
            else {
                System.out.println("La esfera 3 tiene menor peso");
            }
        }
        
        else if (pesoEsfera1==pesoEsfera3 && pesoEsfera1==pesoEsfera4){
            System.out.println("La esfera 2 es la diferente");
            if (pesoEsfera1<pesoEsfera2){
                System.out.println("La esfera 2tiene mayor peso");
            }
            else {
                System.out.println("La esfera 2 tiene menor peso");
            }
        }
        
        else {
            System.out.println("La esfera 1 es la diferente");
            if (pesoEsfera2<pesoEsfera1){
                System.out.println("La esfera 1 tiene mayor peso");
            }
            else {
                System.out.println("La esfera 1 tiene menor peso");
            }
        }
    }
}
