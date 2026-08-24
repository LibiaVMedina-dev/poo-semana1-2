package semana01_tarea;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Pido el numero al usuario
        System.out.print("Ingresa un número (1-10): ");
        int num = sc.nextInt();

        // Valido que el numero este entre 1 y 10
        if (num < 1 || num > 10) 
            {
            System.out.println("Error: El número debe estar comprendido entre 1 y 10.");
            } 
            else {
            // Muestro la tabla de multiplicar del 1 al 12
            System.out.println("\n=== TABLA DEL " + num + " ===");
            for (int i = 1; i <= 12; i++) {
                System.out.printf("%d  x  %2d  =  %2d\n", num, i, (num * i));
            }

            // Muestro las tablas del 1 al 5 en paralelo
            System.out.println("\n=== TABLAS DEL 1 AL 5 EN PARALELO ===");
            
            // Cabecera de los titulos
            for (int t = 1; t <= 5; t++) {
                System.out.print("TABLA " + t + "\t\t");
            }
            
            System.out.println();

            // Bucles anidados para la tabla paralela
            for (int i = 1; i <= 12; i++) {
                for (int t = 1; t <= 5; t++) {
                    System.out.printf("%d x %2d = %2d\t", t, i, (t * i));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
