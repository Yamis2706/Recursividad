package co.edu.uniquindio.recursividad.ejercicios;

import java.util.Scanner;

public class TrianguloCaracter {


    public static void imprimirTriangulo(int altura, int filaActual, char caracter) {
        if (filaActual > altura) {
            return;
        }
        imprimirEspacios(altura - filaActual);
        imprimirCaracteres(filaActual * 2 - 1, caracter);
        System.out.println();
        imprimirTriangulo(altura, filaActual + 1, caracter);
    }


    public static void imprimirEspacios(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        System.out.print(" ");
        imprimirEspacios(cantidad - 1);
    }
    

    public static void imprimirCaracteres(int cantidad, char caracter) {
        if (cantidad <= 0) {
            return;
        }
        System.out.print(caracter);
        imprimirCaracteres(cantidad - 1, caracter);
    }
    

    public static void imprimirTriangulo(int altura, char caracter) {
        System.out.println("\n--- TRIÁNGULO DE CARACTERES ---");
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Caracter seleccionado: '" + caracter + "'");
        System.out.println();
        imprimirTriangulo(altura, 1, caracter);
        System.out.println("\n--- TRIÁNGULO FINALIZADO ---");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("IMPRIMIR TRIÁNGULO DE CARACTERES");
        System.out.print("Ingrese la altura del triángulo (N > 0): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero válido.");
            scanner.close();
            return;
        }
        
        int altura = scanner.nextInt();
        if (altura <= 0) {
            System.out.println("Error: La altura debe ser mayor a 0.");
            scanner.close();
            return;
        }
        
        scanner.nextLine();
        
        System.out.print("Ingrese el caracter para dibujar el triángulo: ");
        String inputCaracter = scanner.nextLine();
        if (inputCaracter.length() != 1) {
            System.out.println("Error: Debe ingresar exactamente un caracter.");
            scanner.close();
            return;
        }
        
        char caracter = inputCaracter.charAt(0);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Carácter: '" + caracter + "'");
        imprimirTriangulo(altura, caracter);
        scanner.close();
    }
}
