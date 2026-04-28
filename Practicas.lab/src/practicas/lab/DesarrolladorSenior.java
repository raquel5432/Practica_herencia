/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
public class DesarrolladorSenior extends Desarrollador implements Evaluador, Capacitador {

    private int     aniosExperiencia;
    private int     proyectosLiderados;
    private String  especializacion;
    private boolean capacidadMentoria;
    
    public DesarrolladorSenior(String nombre, int edad, String documento,
                               String direccion, String telefono,
                               double salario, String idEmpleado,
                               String fechaContratacion, String tipoContrato, String area,
                               String lenguaje, String nivel,
                               String herramientas, int cantidadProyectos,
                               int aniosExperiencia, int proyectosLiderados,
                               String especializacion, boolean capacidadMentoria) {
        super(nombre, edad, documento, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area,
              lenguaje, nivel, herramientas, cantidadProyectos);
        this.aniosExperiencia   = aniosExperiencia;
        this.proyectosLiderados = proyectosLiderados;
        this.especializacion    = especializacion;
        this.capacidadMentoria  = capacidadMentoria;
    }
    
    public int  getAniosExperiencia()    { return aniosExperiencia; }
    public void setAniosExperiencia(int a) { this.aniosExperiencia = a; }

    public int  getProyectosLiderados()    { return proyectosLiderados; }
    public void setProyectosLiderados(int p) { this.proyectosLiderados = p; }

    public String getEspecializacion()    { return especializacion; }
    public void   setEspecializacion(String e) { this.especializacion = e; }

    public boolean isCapacidadMentoria()    { return capacidadMentoria; }
    public void    setCapacidadMentoria(boolean c) { this.capacidadMentoria = c; }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " [Dev. Senior | " + especializacion + "] " +
                           "disena arquitectura en " + getLenguaje() +
                           ", lidera " + proyectosLiderados + " proyectos" +
                           (capacidadMentoria ? " y mentoriza al equipo." : "."));
    }
    
    @Override
    public void evaluar(String nombreEmpleado) {
        System.out.println(getNombre() + " realiza revisión técnica de codigo de: " +
                           nombreEmpleado + " (" + aniosExperiencia + " anos de experiencia aplicados)");
    }

    @Override
    public void capacitar(String tema) {
        System.out.println(getNombre() + " dicta sesion avanzada de \"" + tema +
                           "\" -- especializacion: " + especializacion);
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Experiencia: " + aniosExperiencia + " anios" +
               " | Lidero: "      + proyectosLiderados + " proyectos" +
               " | Esp.: "        + especializacion +
               " | Mentoria: "    + (capacidadMentoria ? "Si" : "No");
    }
}
