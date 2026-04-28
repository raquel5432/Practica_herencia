/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
public class Persona {
    private String nombre;
    private int edad;
    private String documento;
    private String direccion;
    private String telefono;
    
    public Persona(String nombre, int edad, String documento,
                   String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // GETTERS Y SETTERS (FUERA del constructor)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Edad: " + edad +
               " | Doc: " + documento;
    }
}
