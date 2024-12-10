package ejerciciop18;
/*
 Se tiene la siguiente información de un empleado:
 · código del empleado,
 · nombres,
 · número de horas trabajadas al mes,
 · valor hora trabajada,
 · porcentaje de retención en la fuente.
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. 
*/

public class Empleado {

    // Atributos
    private String codigoDelEmpleado;
    private String nombre;
    private String apellido;
    private double horasTrabajadasMes;
    private double valorHoraTrabajada;
    private double porcentajeRetencion;

    // Constructor
    public Empleado(String codigoDelEmpleado, String nombre,String apellido, double horasTrabajadasMes, double valorHoraTrabajada, double porcentajeRetencion) {
        this.codigoDelEmpleado = codigoDelEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasTrabajadasMes = horasTrabajadasMes;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    
    // Método para calcular el salario bruto
    public double calcularSalarioBruto() {
        return horasTrabajadasMes * valorHoraTrabajada;
    }

    // Método para calcular el salario neto
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * porcentajeRetencion / 100);
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------------");
        System.out.println("-------------Datos del empleado------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Codigo del empleado: " + codigoDelEmpleado);
        System.out.println("Nombre: " + nombre + " "+apellido);
        System.out.println("Salario bruto: " + calcularSalarioBruto());
        System.out.println("Salario neto: " + calcularSalarioNeto());
        System.out.println("-------------------------------------------------");
    }


}
