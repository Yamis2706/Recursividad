package co.edu.uniquindio.recursividad.ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BuscarElemento {

    public static boolean buscarElemento(List<String> lista, String elemento, int indice) {
        if (indice >= lista.size()) {
            return false;
        }
        if (lista.get(indice).equals(elemento)) {
            return true;
        }
        return buscarElemento(lista, elemento, indice + 1);
    }


    public static boolean buscarElemento(List<String> lista, String elemento) {
        return buscarElemento(lista, elemento, 0);
    }


    public static void mostrarLista(List<String> lista, String nombre) {
        System.out.println("\n--- " + nombre + " ---");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "] " + lista.get(i));
        }
        System.out.println("Total de elementos: " + lista.size());
    }


    public static List<String> crearLista(Scanner scanner) {
        List<String> lista = new ArrayList<>();
        
        System.out.println("\n--- CREAR LISTA ---");
        System.out.print("Ingrese la cantidad de elementos de la lista: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero válido.");
            return lista;
        }

        int cantidad = scanner.nextInt();
        scanner.nextLine();
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
            return lista;
        }
        
        System.out.println("Ingrese los elementos uno por uno:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            String elemento = scanner.nextLine();
            lista.add(elemento);
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BUSCAR ELEMENTO EN UNA LISTA");
        System.out.println();
        
        List<String> lista = crearLista(scanner);
        
        if (lista.isEmpty()) {
            System.out.println("No se pudo crear la lista.");
            scanner.close();
            return;
        }
        
        mostrarLista(lista, "LISTA CREADA");
        System.out.print("\nIngrese el elemento que desea buscar: ");
        String elementoABuscar = scanner.nextLine();
        boolean encontrado = buscarElemento(lista, elementoABuscar);

        if (encontrado) {
            System.out.println("El elemento '" + elementoABuscar + "' SÍ está en la lista.");
        } else {
            System.out.println("El elemento '" + elementoABuscar + "' NO está en la lista.");
        }
        scanner.close();
    }
}
