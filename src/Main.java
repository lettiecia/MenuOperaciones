/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

class Funciones {
    public void Suma() {
        float num1 = 10.5f;
        float num2 = 5.2f;
        float resultado = num1 + num2;
        System.out.printf("La suma de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Resta() {
        float num1 = 10.5f;
        float num2 = 5.2f;
        float resultado = num1 - num2;
        System.out.printf("La resta de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Multiplicacion() {
        float num1 = 10.5f;
        float num2 = 5.2f;
        float resultado = num1 * num2;
        System.out.printf("La multiplicación de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Division() {
        float num1 = 10.5f;
        float num2 = 5.2f;
        float resultado = num1 / num2;
        System.out.printf("La división de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Resultado() {
        System.out.println("---- Resultados ----");
        Suma();
        Resta();
        Multiplicacion();
        Division();
        System.out.println("--------------------");
    }
}

class Numeros {
    private Funciones funciones;

    public Numeros() {
        funciones = new Funciones();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---- Menú ----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    funciones.Suma();
                    break;
                case 2:
                    funciones.Resta();
                    break;
                case 3:
                    funciones.Multiplicacion();
                    break;
                case 4:
                    funciones.Division();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.mostrarMenu();
    }
}
