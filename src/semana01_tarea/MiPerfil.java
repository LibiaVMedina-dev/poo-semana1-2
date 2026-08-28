package semana01_tarea;

public class MiPerfil {
    public static void main(String[] args) {
        // Datos del estudiante (variables primitivas)
        String nombre = "Diana García";
        int edad = 20;
        double promedio = 15.5;
        boolean masde5cursos = true;

        // Muestro los datos en pantalla
        System.out.println("=================================");
        System.out.println("     MI PERFIL DE ESTUDIANTE     ");
        System.out.println("=================================");
        System.out.println("Nombre  : " + nombre);
        System.out.println("Edad    : " + edad + " años");
        System.out.println("Promedio: " + promedio + " / 20");
        System.out.println("Carga   : Más de 5 cursos: " + masde5cursos);
        System.out.println("=================================");
    }
}
/*
 * RESPUESTAS A LAS PREGUNTAS DE REFLEXIÓN:
 * 1. ¿Por qué usamos double y no int para el promedio?
 *    Usamos DOUBLE porque el promedio contiene decimales por ejemplo 15.5, El tipo INT 
 *    solo almacena enteros y perdería la precisión decimal.
 * 
 * 2. ¿Qué diferencia hay entre usar System.out.print() y System.out.println()?
 *    En SYSTEM.OUT.PRINT() imprime texto sin dar un salto de línea al final, 
 *    mientras que SYSTEM.OUT.PRINTLN() agrega automáticamente un salto de línea tras el mensaje.
 * 
 * 3. ¿Qué pasa si declaras una variable y no le asignas valor antes de usarla?
 *    En Java genera un error de compilación indicando que la variable no ha sido inicializada.
 */
