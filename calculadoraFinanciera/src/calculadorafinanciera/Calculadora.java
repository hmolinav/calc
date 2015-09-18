
package calculadorafinanciera;

public class Calculadora {
   public double prestamo;
   public double porcentaje;
   public int meses;
    //constructor
    public Calculadora(){
        prestamo = 0;
        porcentaje = 0;
        meses = 0;
  
    }
    //Constructor
    public Calculadora(double prestamo, double porcentaje, int meses){
        this.prestamo = prestamo;
        this.porcentaje = porcentaje;
        this.meses = meses;
    }
    //menu de opciones
    public static void menuOpciones(){
        System.out.println();
        System.out.println("\t\t\t\t\t1  ahorros");
        System.out.println("\t\t\t\t\t2  Creditos");
        System.out.println("\t\t\t\t\t3  Limpiar pantalla");
        System.out.println("\t\t\t\t\t4  Salir");
        System.out.print("\t\t\t\t\tIngresa una opcion \n\t\t\t\t\t(NO USAR LETRAS NI CARACTERES ESPECIALES): ");
        
    }
    //Este metodo solo crea 50 iteraciones en blanco
    public static void limpiarPantalla(){
        for (int i = 0; i < 50; i++) {
            System.out.println("                                                                                     ");
        }
    }
    public static void Encabezado(){
        System.out.println("\t\t\t\t\t\tCALCULADORA DE AHORRO Y CREDITO\n");
        System.out.println("\t\t\t\t\t0909-14-7817 Perla Ruby López Choj");
        System.out.println("\t\t\t\t\t0909-14-2571 Henry Geovanni Molina Vernales");
        System.out.println("\t\t\t\t\t0909-14-2253 Jenry Oswaldo Mazariegos Aragon");
        System.out.println("\t\t\t\t\t0909-11-3138 Cindy Mabel Villanueva Galdamez");   
    }
}
