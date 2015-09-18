
package calculadorafinanciera;

import java.util.Scanner;

public class Impresiones extends Calculadora{
    
        double porcent=0;
        double interes = 0 ;
        
        
    public void imprimirAhrros(){
        Scanner sc= new Scanner(System.in);
        Ahorros ah = new Ahorros();
        System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\t\t\tIngresa tu ahorro: ");
                    prestamo = sc.nextDouble();
                    System.out.print("\t\t\t\t\t\tIngresa los meses: ");
                    meses = sc.nextInt();
                    System.out.print("\t\t\t\t\t\tInteres a calcular: ");
                    interes = sc.nextDouble();
                    porcentaje = interes /100;
                    System.out.println();
                    Calculadora datos = new Calculadora(prestamo,porcentaje,meses);
                    ah.AhorrosConLibreta(datos.prestamo, datos.porcentaje, datos.meses);
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
    }
    public void imprimirAmrotizacion(){
        Scanner sc= new Scanner(System.in);
        
        
        Amortizacion calculos = new Amortizacion();
        
       System.out.println("------------------------------------------------------------------------------"
                            + "-----------------------------------------");
                    System.out.print("\t\t\t\t\t\tIngresa tu Credito: ");
                    prestamo = sc.nextDouble();
                    System.out.print("\t\t\t\t\t\tIngresa los meses: ");
                    meses = sc.nextInt();
                    System.out.print("\t\t\t\t\t\tInteres a calcular: ");
                    interes = sc.nextDouble();
                    porcentaje = interes /100;
                    if(prestamo >= 500 && prestamo < 200000){
                    calculos.amortizaciones(prestamo, porcentaje, meses);
                    System.out.println("------------------------------------------------------------------------------"
                            + "-----------------------------------------");
                    }else{
                        System.out.println("\t\t\tLo siento no podemos darte un credito menor de Q500.00 ni mayor de Q200,000.00");
                    }
       
       
    }
    
}
