/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
public class Empleado extends Persona {
    private double salario;
    private String idEmpleado;
    private String fechaContratacion;
    private String tipoContrato;
    private String area;
    
    public Empleado(String nombre, int edad, String documento,
                    String direccion, String telefono,
                    double salario, String idEmpleado,
                    String fechaContratacion, String tipoContrato, String area) {
        
        super(nombre, edad, documento, direccion, telefono);
        this.salario           = salario;
        this.idEmpleado        = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato      = tipoContrato;
        this.area              = area;
    }
    
    public double getSalario()    { return salario; }
    public void   setSalario(double salario) { this.salario = salario; }

    public String getIdEmpleado()    { return idEmpleado; }
    public void   setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getFechaContratacion()    { return fechaContratacion; }
    public void   setFechaContratacion(String f) { this.fechaContratacion = f; }

    public String getTipoContrato()    { return tipoContrato; }
    public void   setTipoContrato(String tipoContrato) { this.tipoContrato = tipoContrato; }

    public String getArea()    { return area; }
    public void   setArea(String area) { this.area = area; }

    public void trabajar() {
        System.out.println(getNombre() + " [Empleado] está trabajando en el área de " + area + ".");
    }
    
    @Override
    public String toString() {
        return super.toString() +
               " | ID: "       + idEmpleado +
               " | Área: "     + area +
               " | Salario: L." + String.format("%.2f", salario) +
               " | Contrato: " + tipoContrato;
    }
    
}
