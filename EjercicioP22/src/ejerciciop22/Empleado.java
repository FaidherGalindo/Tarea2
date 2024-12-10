package ejerciciop22;
public class Empleado {
    
    // Atributos
    public String nombre;
    public String apellido;
    public double valorDeLaHoraTrabajada;
    public double numeroDeHorasTrabajadas;
    
    // Constructor
    public Empleado(String nombre, String apellido,double valorDeLaHoraTrabajada,double numeroDeHorasTrabajadas) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.valorDeLaHoraTrabajada = valorDeLaHoraTrabajada;
        this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
    }
    
    
    //Metodos
    
    public double salarioNeto() {
        return valorDeLaHoraTrabajada*numeroDeHorasTrabajadas;
    }
    
    public void comparador() {
           
        if (salarioNeto()>450000){
            System.out.println("El nombre del empleado es: "+nombre+" "+apellido+" y su salario es de: "+salarioNeto());
        }
        else {
            System.out.println("El nombre del empleado es: "+nombre+" "+apellido);
            }
        }
}
