public class Estudiante{
   //Atributos
    String codigo;
    String nombre;
    double promedio;
    int edad;
    boolean becado;
    char sexo;

    //Comportamiento - metodos
    public void mostrardatos(){
        System.out.println("Los datos del estudiante son: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Edad: " + edad);
        System.out.println("Es becado: " + becado);
        System.out.println("Sexo: " + sexo);
        System.out.println(" ");
    }

}
