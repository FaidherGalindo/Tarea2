package ejercicior12;
public class Empleado {

    // Atributos
    public String nombre;
    public String apellido;
    public double horasTrabajadas;
    public double valorHoraTrabajada;
    public double horasExtras=0;

    // Constructor
    public Empleado(String nombre,String apellido, double horasTrabajadas, double valorHoraTrabajada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
     }

    
    // Método para calcular el salario bruto
    public double calcularSalario() {
        if (horasTrabajadas>40){
            horasExtras=horasTrabajadas-40;
            if (horasExtras>8){
                return ((horasExtras-8)*valorHoraTrabajada*3)+(8*valorHoraTrabajada*2)+(40*valorHoraTrabajada);
            }
            else{
                return (horasExtras*valorHoraTrabajada*2)+(40*valorHoraTrabajada);
            }
        }
        else{
            return horasTrabajadas*valorHoraTrabajada;
        }
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("-------------Datos del empleado------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("El trabajador " + nombre + " "+apellido+ " devengo $"+calcularSalario());
        System.out.println("-------------------------------------------------");
    }
}