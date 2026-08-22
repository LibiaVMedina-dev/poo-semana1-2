public class App {
    public static void main(String[] args)  {
        //Instanciar
        Estudiante irma = new Estudiante();
        irma.codigo = "N000001";
        irma.nombre = "Irma Bardales";
        irma.promedio = 16.5;
        irma.edad = 20;
        irma.mostrardatos();
        
        Estudiante juan =new Estudiante();
        juan.codigo = "N000002";
        juan.nombre = "Juan Quiroz";
        juan.promedio = 15;
        juan.becado = true;
        juan.mostrardatos();
        
        Estudiante pedro =new Estudiante();
        pedro.codigo = "N000003";
        pedro.nombre = "Pedro Rivera";
        pedro.promedio = 18;
        pedro.sexo = 'M';
        pedro.mostrardatos();
        
    }
}

