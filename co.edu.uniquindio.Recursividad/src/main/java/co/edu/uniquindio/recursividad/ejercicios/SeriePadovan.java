package co.edu.uniquindio.recursividad.ejercicios;

import java.util.Scanner;

public class SeriePadovan {

    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        return padovan(n - 2) + padovan(n - 3);
    }
    

    public static void mostrarSerieCompleta(int n) {
        System.out.println("\n--- Serie de Padovan hasta P(" + n + ") ---");
        for (int i = 0; i <= n; i++) {
            System.out.print("P(" + i + ") = " + padovan(i));
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SERIE DE PADOVAN");

        System.out.print("Ingrese el término de la serie que desea calcular (n >= 0): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero válido.");
            scanner.close();
            return;
        }
        
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Error: El número debe ser mayor o igual a 0.");
            scanner.close();
            return;
        }
        
        System.out.println("\nCalculando P(" + n + ")...");
        int resultado = padovan(n);
        System.out.println("P(" + n + ") = " + resultado);
        if (n <= 20) {
            mostrarSerieCompleta(n);
        }
        scanner.close();
    }
}
