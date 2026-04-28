/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
public class Gerente extends Empleado implements Evaluador, Capacitador {

    private String departamento;
    private int    personasACargo;
    private double presupuesto;
    private String frecuenciaReuniones;

    public Gerente(String nombre, int edad, String documento,
                   String direccion, String telefono,
                   double salario, String idEmpleado,
                   String fechaContratacion, String tipoContrato, String area,
                   String departamento, int personasACargo,
                   double presupuesto, String frecuenciaReuniones) {
        super(nombre, edad, documento, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);
        this.departamento        = departamento;
        this.personasACargo      = personasACargo;
        this.presupuesto         = presupuesto;
        this.frecuenciaReuniones = frecuenciaReuniones;
    }
    
    public String getDepartamento()    { return departamento; }
    public void   setDepartamento(String d) { this.departamento = d; }

    public int  getPersonasACargo()    { return personasACargo; }
    public void setPersonasACargo(int n) { this.personasACargo = n; }

    public double getPresupuesto()    { return presupuesto; }
    public void   setPresupuesto(double p) { this.presupuesto = p; }

    public String getFrecuenciaReuniones()    { return frecuenciaReuniones; }
    public void   setFrecuenciaReuniones(String f) { this.frecuenciaReuniones = f; }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " [Gerente] coordina " + personasACargo +
                           " personas en el depto. de " + departamento +
                           ". Reuniones: " + frecuenciaReuniones + ".");
    }

    @Override
    public void evaluar(String nombreEmpleado) {
        System.out.println(getNombre() + " evalua el desempeño de: " + nombreEmpleado +
                           " (Depto: " + departamento + ")");
    }

    @Override
    public void capacitar(String tema) {
        System.out.println(getNombre() + " imparte capacitación al equipo sobre: \"" + tema + "\"");
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Depto: "      + departamento +
               " | A cargo: "    + personasACargo +
               " | Presupuesto: L." + String.format("%.2f", presupuesto);
    }
    
}
