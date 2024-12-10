package ejercicior10;

public class LiquidarMatricula {
    public double numero_de_inscripcion;
    public String nombre;
    public String apellido;
    public double patrimonio;
    public double estrato_social;
    public double pago_matricula=50000;
    // Constructor
    public LiquidarMatricula(double numero_de_inscripcion,String nombre,String apellido,double patrimonio,double estrato_social) {
        this.numero_de_inscripcion = numero_de_inscripcion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.patrimonio = patrimonio;
        this.estrato_social = estrato_social;
    }

    // Método para calcular el perimetro
    public void comparacion() {
        if (patrimonio>2000000 && estrato_social>3) {
            pago_matricula=pago_matricula+0.03*patrimonio;
            System.out.println("El estudiante con numero de inscripcion: "+numero_de_inscripcion+ " y nombre: " +nombre+" "+apellido+ " debe pagar: "+pago_matricula);
        }
        else {
            System.out.println("El estudiante con numero de inscripcion: "+numero_de_inscripcion+ " y nombre: " +nombre+" "+apellido+ " debe pagar: "+pago_matricula);
        }
     }

    
}
