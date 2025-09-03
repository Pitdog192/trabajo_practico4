/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_practico.pkg4;

/**
 *
 * @author Arroquigarays
 */
public class Main {
    public static void main(String[] args) {
        // Usar el constructor completo
        Empleado emp1 = new Empleado(101, "Juan Pérez", "Programador", 200);
        
        // Usar el constructor reducido (id automático y salario por defecto)
        Empleado emp2 = new Empleado("Ana Gómez", "Diseñadora");
        
        // Asignarle luego un salario inicial (opcional)
        emp2.setSalario(40000);

        // Probar aumento con porcentaje
        emp1.actualizarSalario(10.0); // +10%
        
        // Probar aumento con cantidad fija
        emp2.actualizarSalario(3000); // +3000

        // Imprimir usando toString()
        System.out.println(emp1);
        System.out.println(emp2);

        // Ver total empleados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
