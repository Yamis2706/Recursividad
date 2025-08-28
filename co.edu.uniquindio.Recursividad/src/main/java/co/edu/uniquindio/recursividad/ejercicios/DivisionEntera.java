package co.edu.uniquindio.recursividad.ejercicios;

import java.util.Scanner;

public class DivisionEntera {


    public static int divisionRecursiva(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        if (dividendo == divisor) {
            return 1;
        }
        return 1 + divisionRecursiva(dividendo - divisor, divisor);
    }
    

    public static boolean divisionPosible(int dividendo, int divisor) {
        if (divisor == 0) {
            return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("DIVISIÓN ENTERA USANDO RESTAS SUCESIVAS");
        System.out.println();
        
        System.out.print("Ingrese el dividendo (número a dividir): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero válido para el dividendo.");
            scanner.close();
            return;
        }
        
        int dividendo = scanner.nextInt();
        
        System.out.print("Ingrese el divisor (número por el cual dividir): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero válido para el divisor.");
            scanner.close();
            return;
        }
        
        int divisor = scanner.nextInt();
        if (!divisionPosible(dividendo, divisor)) {
            System.out.println("Error: No se puede dividir por cero.");
            scanner.close();
            return;
        }
        
        System.out.println("\n--- OPERACIÓN A REALIZAR ---");
        System.out.println(dividendo + " ÷ " + divisor + " = ?");

        int cociente = divisionRecursiva(dividendo, divisor);
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Cociente: " + cociente);
        
        int residuo = dividendo - (cociente * divisor);
        if (residuo > 0) {
            System.out.println("Residuo: " + residuo);
        }
        
        System.out.println("Verificación: " + divisor + " × " + cociente + " + " + residuo + " = " + dividendo);

        scanner.close();
    }
}
