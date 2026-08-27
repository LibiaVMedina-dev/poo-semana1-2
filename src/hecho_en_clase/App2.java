package hecho_en_clase;

import java.util.Scanner;

public class App2{
    public static void main(String[] args){
        double balance = 2000;
        double montoRetirar;
        String  dni;
        int tipoCliente = 0; //1 banca minorista, 2 Cliente Privado, 3 cliente Corporativo

        // Usar la CLASE SCANNER
        //Instanciar la clase scanner
        Scanner scanner = new Scanner(System.in);
        
        //Preguntar a usario su dni (string)
        System.out.println("Ingrese su DNI: ");
        dni = scanner.nextLine();//Leemos la informacion ingresasa por el usuario
        
        // Preguntar al usuario su tipo cliente(int)
        System.out.println("Ingrese su Tipo de cliente: ");
        tipoCliente = scanner.nextInt();
        
        // Preguntar al usuario su monto a retirar (double)
         System.out.println("Ingrese monto a retirar: ");
        montoRetirar = scanner.nextDouble();

        // Cerrar scanner
        scanner.close();
       
        System.out.println(" ============================== ");

       //Identificar a nuestro cliente
        switch (tipoCliente) {
            case 1:
                System.out.println("Cliente de Banca Minorista");
                break;
            case 2:
                System.out.println("Cliente Privado");
                break;
            case 3:
                System.out.println("Cliente Corporativo");
                break;        
            default:
                System.out.println("Tipo de Cliente no válido");
                break;
        }
       System.out.println("========== Retiro de Fondos ==========");
       //IF ELSE
       if(balance == 0){
        System.out.println("El cliente no tiene saldo.");
        //Terminar el programa
       }else if(montoRetirar > balance){
        System.out.println("Faltan fondos para completar el retiro.");
       }else{
        balance = balance - montoRetirar;
        System.out.println("El nuevo balance es: " + balance);
       }
       System.out.println(" ");
       
       //Proceso de Liquidación
       System.out.println("======== WHILE - Proceso de extractos Bancarios ========");
       int numeroExtractosAprocesar = 2;
       int contador = 1;
       while(contador <= numeroExtractosAprocesar){
            System.out.println( "Extracto " + contador + " procesado.");

            //Actualizar el contador es importante
            contador++; //contador = contador + 1;  
       } 
       System.out.println("\n======== Do WHILE - Proceso de extractos Bancarios ========");
       contador = 0;
       do{
            System.out.println("Extracto " + contador + " procedado");
            contador++;
       }while (contador <= numeroExtractosAprocesar); 
       
       System.out.println("\n======== Do FOR - Proceso de extractos Bancarios ========");
       for(contador = 1; contador <= 2; contador++){
            System.out.println("Extracto " + contador + " procedado");
       }
    }
}