package semana01_tarea;

import java.util.Random;
import java.util.Scanner;

public class AnalizadorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // Arreglos para guardar los datos de los 3 estudiantes
        String[] nombres = new String[3];
        double[] promedios = new double[3];
        int aprobados = 0;
        int desaprobados = 0;
        double sumaPromedios = 0;

        System.out.println("=== REGISTRO DE ESTUDIANTES ===\n");

        // Registro de los 3 estudiantes con bucle for
        for (int i = 0; i < 3; i++) {
            System.out.println("-- Estudiante " + (i + 1) + " --");
            
            // Pido nombre completo (uso nextLine si es la primera iteracion o sc.nextLine despues de limpiar)
            System.out.print("Nombre completo: ");
            nombres[i] = sc.nextLine();

            // Pido las 2 notas
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            sc.nextLine(); // Limpio el buffer del scanner

            // Calculo promedio simple
            double prom = (n1 + n2) / 2.0;
            promedios[i] = prom;
            sumaPromedios += prom;

            // Uso de Math para nota maxima y minima
            double max = Math.max(n1, n2);
            double min = Math.min(n1, n2);

            // Uso de Random para generar codigo aleatorio de 5 digitos (10000 a 99999)
            int codigo = 10000 + rd.nextInt(90000);

            // Determino estado y contabilizo
            String estado;
            if (prom >= 11) {
                estado = "Aprobado ";
                aprobados++;
            } else {
                estado = "Desaprobado";
                desaprobados++;
            }

            // resultado de cada alumno
            System.out.println("Nombre: " + nombres[i] + "  |  Código: #" + codigo);
            System.out.println("Nota 1: " + (int)n1 + "  |  Nota 2: " + (int)n2);
            System.out.println("Promedio: " + prom + "  |  Estado: " + estado);
            System.out.println("Máx: " + (int)max + "  |  Mín: " + (int)min);
            System.out.println();
        }

        // Busco mejor y peor promedio del aula
        double mejorProm = promedios[0];
        double peorProm = promedios[0];
        String mejorAlumno = nombres[0];
        String peorAlumno = nombres[0];

        for (int i = 1; i < 3; i++) {
            if (promedios[i] > mejorProm) {
                mejorProm = promedios[i];
                mejorAlumno = nombres[i];
            }
            if (promedios[i] < peorProm) {
                peorProm = promedios[i];
                peorAlumno = nombres[i];
            }
        }

        double promedioAula = sumaPromedios / 3.0;

        // Muestro el Reporte General
        System.out.println("=== REPORTE GENERAL ===");
        System.out.printf("Promedio del aula : %.1f\n", promedioAula);
        System.out.println("Mejor promedio    : " + mejorProm + "  (" + mejorAlumno + ")");
        System.out.println("Peor promedio     : " + peorProm + "  (" + peorAlumno + ")");
        System.out.println("Aprobados: " + aprobados + "  |  Desaprobados: " + desaprobados);

        sc.close();
    }
}
