package co.edu.uniquindio.recursividad.ejercicios;

import java.util.Scanner;

public class EliminarCaracter {
    

    public static String eliminarCaracter(String cadena, char caracter) {
        if (cadena.isEmpty()) {
            return "";
        }
        
        char primerCaracter = cadena.charAt(0);
        if (primerCaracter == caracter) {
            return eliminarCaracter(cadena.substring(1), caracter);
        }

        return primerCaracter + eliminarCaracter(cadena.substring(1), caracter);
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ELIMINAR CARACTER DE UNA CADENA");
        System.out.print("Ingrese una palabra o una oración: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Ingrese el caracter o letra a eliminar: ");
        String inputCaracter = scanner.nextLine();
        
        if (inputCaracter.length() != 1) {
            System.out.println("Error: Debe ingresar exactamente un carácter.");
            scanner.close();
            return;
        }
        
        char caracter = inputCaracter.charAt(0);
        
        System.out.println("\nPalabra u oración original: \"" + cadena + "\"");
        System.out.println("Caracter o letra a eliminar: '" + caracter + "'");
        
        String resultado = eliminarCaracter(cadena, caracter);
        System.out.println("Resultado: \"" + resultado + "\"");

        scanner.close();
    }
}
