package semana01_tarea;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pido el nombre del alumno
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        // Variables para las notas
        double n1, n2, n3;

        // Reto adicional: Valido Nota 1 con do-while (0 a 20)
        do {
            System.out.print("Nota Evaluación 1 (30%): ");
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 20) {
                System.out.println("Error: La nota debe estar entre 0 y 20.");
            }
        } while (n1 < 0 || n1 > 20);

        // Valido Nota 2
        do {
            System.out.print("Nota Evaluación 2 (30%): ");
            n2 = sc.nextDouble();
            if (n2 < 0 || n2 > 20) {
                System.out.println("Error: La nota debe estar entre 0 y 20.");
            }
        } while (n2 < 0 || n2 > 20);

        // Valido Nota 3
        do {
            System.out.print("Nota Evaluación 3 (40%): ");
            n3 = sc.nextDouble();
            if (n3 < 0 || n3 > 20) {
                System.out.println("Error: La nota debe estar entre 0 y 20.");
            }
        } while (n3 < 0 || n3 > 20);

        // 2. Calculo el promedio ponderado (30%, 30% y 40%)
        double promedio = (n1 * 0.30) + (n2 * 0.30) + (n3 * 0.40);

        // 4. Evaluo el estado segun el promedio
        String estado;
        if (promedio >= 14) {
            estado = "Aprobado con distinción ";
        } else if (promedio >= 11) {
            estado = "Aprobado ";
        } else if (promedio >= 5) {
            estado = "En recuperación";
        } else {
            estado = "Desaprobado";
        }

        // 3 y 5. Muestro los resultados (Nombre en MAYUSCULAS con .toUpperCase())
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Estudiante : " + nombre.toUpperCase());
        System.out.printf("Promedio   : %.2f\n", promedio);
        System.out.println("Estado     : " + estado);

        sc.close();
    }
    
}
