package ejercicior14;
public class Ventas {
// Atributos
    public double ventasDepa1;
    public double ventasDepa2;
    public double ventasDepa3;
    public double salarioVendedores;
    
      

    
        // Constructor
    public Ventas(double ventasDepa1,double ventasDepa2,double ventasDepa3,double salarioVendedores) {
        this.ventasDepa1 = ventasDepa1;
        this.ventasDepa2 = ventasDepa2;
        this.ventasDepa3 = ventasDepa3;
        this.salarioVendedores=salarioVendedores;
    }
    
    
// Métodos
    
    public double VentasTotales(){
        return ventasDepa1+ventasDepa2+ventasDepa3;    
    }
    
    
    public double PorcentajeVentas33(){
        return 0.33*VentasTotales();
    }
    
    public double ValorAPagarDepa1() {
                
        if (ventasDepa1<PorcentajeVentas33()){
            return salarioVendedores;
        }
        else{
            return salarioVendedores*1.2;
        }
    }
    public double ValorAPagarDepa2() {
        
        if (ventasDepa2<PorcentajeVentas33()){
            return salarioVendedores;
        }
        else{
            return salarioVendedores*1.2;
        }
    }
    public double ValorAPagarDepa3() {
        
        if (ventasDepa3<PorcentajeVentas33()){
            return salarioVendedores;
        }
        else{
            return salarioVendedores*1.2;
        }        
    }

    
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("El salario de los vendedores del departamento 1 es: $" + ValorAPagarDepa1());
        System.out.println("El salario de los vendedores del departamento 2 es: $" + ValorAPagarDepa2());
        System.out.println("El salario de los vendedores del departamento 3 es: $" + ValorAPagarDepa3());
        System.out.println("-------------------------------------------------");
    }
}