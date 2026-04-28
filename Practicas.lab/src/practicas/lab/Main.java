/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas.lab;

/**
 *
 * @author alira
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Desarrollador dev1 = new Desarrollador(
            "Ana Torres", 27, "0801-1995-12345", "Col. Kennedy, Tegucigalpa", "9999-1111",
            42000, "EMP-001", "2022-03-15", "Tiempo completo", "Backend",
            "Java", "Intermedio", "IntelliJ, Maven, Git", 8
        );

        Desarrollador dev2 = new Desarrollador(
            "Luis Portillo", 24, "0501-1999-67890", "Col. Palmira, Tegucigalpa", "8888-2222",
            35000, "EMP-002", "2023-07-01", "Tiempo completo", "Frontend",
            "JavaScript", "Junior", "VS Code, React, npm", 3
        );

        Gerente gerente1 = new Gerente(
            "Carlos Mena", 45, "0101-1978-11111", "Res. Las Lomas, San Pedro Sula", "7777-3333",
            95000, "EMP-003", "2018-01-10", "Tiempo completo", "Dirección",
            "Tecnología e Innovación", 15, 2500000.0, "Semanal"
        );

        Gerente gerente2 = new Gerente(
            "María Ramos", 38, "0801-1985-22222", "Col. Rubén Darío, Tegucigalpa", "6666-4444",
            87000, "EMP-004", "2020-05-20", "Tiempo completo", "Producto",
            "Desarrollo de Producto", 8, 1200000.0, "Quincenal"
        );

        DesarrolladorSenior senior1 = new DesarrolladorSenior(
            "Laura Paz", 34, "0801-1989-33333", "Col. Lomas del Guijarro, Tegucigalpa", "5555-5555",
            78000, "EMP-005", "2019-09-05", "Tiempo completo", "Arquitectura",
            "Java", "Senior", "IntelliJ, Docker, Kubernetes, AWS", 22,
            10, 7, "Microservicios y Cloud", true
        );

        DesarrolladorSenior senior2 = new DesarrolladorSenior(
            "Roberto Soto", 31, "0501-1992-44444", "Col. Trejo, San Pedro Sula", "4444-6666",
            72000, "EMP-006", "2021-02-14", "Tiempo completo", "Seguridad",
            "Python", "Senior", "PyCharm, Django, Terraform", 17,
            8, 4, "Ciberseguridad y DevSecOps", true
        );

        List<Empleado> plantilla = new ArrayList<>();
        plantilla.add(dev1);
        plantilla.add(dev2);
        plantilla.add(gerente1);
        plantilla.add(gerente2);
        plantilla.add(senior1);
        plantilla.add(senior2);

        System.out.println("------------------------------------------");
        System.out.println("       REPORTE DE ACTIVIDAD LABORAL       ");
        System.out.println("------------------------------------------");

        for (Empleado e : plantilla) {
            e.trabajar();
        }

        System.out.println("\n------------------------------------------");
        System.out.println("          SESION DE EVALUACIONES          ");
        System.out.println("------------------------------------------");

        for (Empleado e : plantilla) {
            if (e instanceof Evaluador evaluador) {
                evaluador.evaluar("Juan Herrera");
            }
        }

        System.out.println("\n------------------------------------------");
        System.out.println("        SESION DE CAPACITACIONES          ");
        System.out.println("------------------------------------------");

        for (Empleado e : plantilla) {
            if (e instanceof Capacitador capacitador) {
                capacitador.capacitar("Buenas prácticas de desarrollo seguro");
            }
        }

        System.out.println("\n------------------------------------------");
        System.out.println("           RESUMEN DE NOMINA              ");
        System.out.println("------------------------------------------");

        double totalNomina = 0;
        for (Empleado e : plantilla) {
            System.out.printf("  %-20s  L. %,10.2f%n", e.getNombre(), e.getSalario());
            totalNomina += e.getSalario();
        }
        System.out.println("  ----------------------------------------");
        System.out.printf("  %-20s  L. %,10.2f%n", "TOTAL NOMINA", totalNomina);

        System.out.println("\n------------------------------------------");
        System.out.println("          FICHAS DE EMPLEADOS             ");
        System.out.println("------------------------------------------");

        for (Empleado e : plantilla) {
            System.out.println(e);
            System.out.println("  ----------------------------------------");
        }
    }
}
