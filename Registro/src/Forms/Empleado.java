
package Forms;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de empleados
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Datos del empleado " + (i + 1) + ":");
            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  // Consumir la nueva línea

            Empleado empleado = new Empleado(nombres, apellidos, cargo, salario);
            empleados.add(empleado);
        }

        // Aumentar salario de empleados con salario menor a 12 mil
        for (Empleado empleado : empleados) {
            empleado.aumentarSalario(20);
        }

        // Mostrar los datos de los empleados
        System.out.println("\nDatos de los empleados después del aumento de salario:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        scanner.close();
    }

    private Empleado(String nombres, String apellidos, String cargo, double salario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void aumentarSalario(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
