package semana01_tarea;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido la cantidad de alumnos
        System.out.print("¿Cuántos estudiantes vas a registrar?: ");
        int cantidad = sc.nextInt();

        // Creo los arreglos para guardar los datos
        String[] nombres = new String[cantidad];
        double[] notas = new double[cantidad];

        // Lleno los arreglos con un for
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.next();

            // Pido la nota y me aseguro que este entre 0 y 20
            System.out.print("Nota de " + nombres[i] + " (0-20): ");
            double notaInput = sc.nextDouble();

            while (notaInput < 0 || notaInput > 20) {
                System.out.print("Nota invalida. Ingresa un numero de 0 a 20: ");
                notaInput = sc.nextDouble();
            }
            notas[i] = notaInput;
        }

        // Variables para sacar las cuentas
        double suma = 0;
        double notaMayor = notas[0];
        double notaMenor = notas[0];
        String mejorAlumno = nombres[0];
        String peorAlumno = nombres[0];

        int aprobados = 0;
        int desaprobados = 0;

        // Recorro los datos para hacer las operaciones
        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];

            // Cuento aprobados (11 o mas)
            if (notas[i] >= 11) {
                aprobados++;
            } else {
                desaprobados++;
            }

            // Busco la nota mas alta
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
                mejorAlumno = nombres[i];
            }

            // Busco la nota mas baja
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
                peorAlumno = nombres[i];
            }
        }

        // Saco el promedio general
        double promedio = suma / cantidad;

        // Muestro los resultados por pantalla
        System.out.println("\n--- RESUMEN DE NOTAS ---");
        System.out.println("Promedio del grupo : " + promedio);
        System.out.println("Total aprobados    : " + aprobados);
        System.out.println("Total desaprobados : " + desaprobados);
        System.out.println("Nota más alta      : " + notaMayor + " (" + mejorAlumno + ")");
        System.out.println("Nota más baja      : " + notaMenor + " (" + peorAlumno + ")");

        // Lista completa
        System.out.println("\n--- LISTA GENERAL ---");
        for (int i = 0; i < cantidad; i++) {
            String estado = (notas[i] >= 11) ? "Aprobado" : "Desaprobado";
            System.out.println(nombres[i] + " -> " + notas[i] + " [" + estado + "]");
        }

        sc.close();
    }
}
