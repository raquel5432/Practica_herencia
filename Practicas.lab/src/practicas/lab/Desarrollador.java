/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
public class Desarrollador extends Empleado {
 private String lenguaje;
    private String nivel;
    private String herramientas;
    private int    cantidadProyectos;

    public Desarrollador(String nombre, int edad, String documento,
                         String direccion, String telefono,
                         double salario, String idEmpleado,
                         String fechaContratacion, String tipoContrato, String area,
                         String lenguaje, String nivel,
                         String herramientas, int cantidadProyectos) {
        super(nombre, edad, documento, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);
        this.lenguaje          = lenguaje;
        this.nivel             = nivel;
        this.herramientas      = herramientas;
        this.cantidadProyectos = cantidadProyectos;
    }
    
    public String getLenguaje()    { return lenguaje; }
    public void   setLenguaje(String lenguaje) { this.lenguaje = lenguaje; }

    public String getNivel()    { return nivel; }
    public void   setNivel(String nivel) { this.nivel = nivel; }

    public String getHerramientas()    { return herramientas; }
    public void   setHerramientas(String h) { this.herramientas = h; }

    public int  getCantidadProyectos() { return cantidadProyectos; }
    public void setCantidadProyectos(int n) { this.cantidadProyectos = n; }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " [Desarrollador " + nivel + "] " +
                           "está programando en " + lenguaje +
                           " usando " + herramientas + ".");
    }
    
    @Override
    public String toString() {
        return super.toString() +
               " | Lenguaje: "  + lenguaje +
               " | Nivel: "     + nivel +
               " | Proyectos: " + cantidadProyectos;
    }
    
}
