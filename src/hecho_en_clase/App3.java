package hecho_en_clase;

import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        String cadena = "Bienvenidos a la clase de Tecnicas de POO";
        //Char se usa para declarar letra 
        char letra = 'B';
        System.out.println((int)letra);
        System.out.println(cadena.charAt(0)); // Obtener el caracter en pos
        //Tamaño de la cadena
        System.out.println(cadena.length());
        //Colocar el texto en mayuscula
        System.out.println(cadena.toUpperCase());
        //Colocar el texto en miniscula
        System.out.println(cadena.toLowerCase());
        //Subsstring es para obtener parte de la cadena original
        //Colocar el texto en mayuscula
        System.out.println(cadena.substring(10,20));
        //Contains verifircar si existe el texto dentro de la cadena original
        System.out.println(cadena.contains("clase"));
        //Replace reemplaza una palabra / letra en la cadena original con otra
        System.out.println(cadena.replace("clase", "sesion"));
        //Trim remover espacios extra del inicio y final
        String cadena2 ="  Hola mi nombre es Libia  .";
        System.out.println(cadena2.trim());
        //comparar 2 strings
        String cadena3 = "Victor";
        String cadena4 = "Victor";
        String cadena5 =  new String("Victor");//Instanciando
        // = compara espacios de memoria
        System.out.println(cadena3 == cadena4); // true
        System.out.println(cadena3 == cadena5); // false por diferentes espacios de memoria
        // para comparar contenido de los string se usa aquals
        System.out.println(cadena3.equals(cadena5));

        System.out.println(" ");
        //Usando la CLASE RANDOM
        Random aleatorio = new Random(); //instanciar
        //generar un valor entero entre un rango
        System.out.println(aleatorio.nextInt(0,50));
        System.out.println(aleatorio.nextBoolean());
        System.out.println(aleatorio.nextDouble(0.0,1));

        //usando la CLASE MATH
        System.out.println(Math.pow(12, 2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(10.7));//resultado 11
        System.out.println(Math.round(10.5));//11
        System.out.println(Math.round(10.3));//10
        System.out.println(Math.floor(10.8)); //redondeao hacia abajo 10
        System.out.println(Math.ceil(10.2)); // redondeo hacia arriba 11
        System.out.println(Math.E); 
    }
    
}
