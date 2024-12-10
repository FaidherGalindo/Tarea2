package ejercicior13;
public class Descuento {

    // Atributos
    public double valorDeLaCompra;
    public String colorDeLaBolita;
    public double porcentajeDescuento = 0;

    // Constructor
    public Descuento(double valorDeLaCompra, String colorDeLaBolita) {
        this.valorDeLaCompra = valorDeLaCompra;
        this.colorDeLaBolita = colorDeLaBolita;
    }
    
    // Métodos
    public double ValorAPagar() {
        if (colorDeLaBolita.equals("blanca")){
            porcentajeDescuento =0;
        
        }
        else if (colorDeLaBolita.equals("verde")) {
            porcentajeDescuento =10;
        }
        else if (colorDeLaBolita.equals("amarilla")){ 
            porcentajeDescuento =25;
        }
        else if (colorDeLaBolita.equals("azul")){ 
            porcentajeDescuento =50;
        }
        else { 
            porcentajeDescuento =100;
        }
        return valorDeLaCompra*(1-porcentajeDescuento/100);        
    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("El ciente debe pagar $" + ValorAPagar());
        System.out.println("-------------------------------------------------");
    }
}    
    

