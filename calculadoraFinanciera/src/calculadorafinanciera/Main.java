package calculadorafinanciera;

import static calculadorafinanciera.Calculadora.Encabezado;
import static calculadorafinanciera.Calculadora.limpiarPantalla;

import java.util.Scanner;

public class Main {

    String compara;

    public static void main(String[] args) {
        CompararLetras cp = new CompararLetras();
        Scanner sc = new Scanner(System.in);
        //Declaramos variables
        double prestamo;
        double interes;
        double porcentaje;
        int meses;
        Amortizacion calculos = new Amortizacion();
        Ahorros ah = new Ahorros();

        System.out.println();
        Encabezado();
        do {
            //Inicializamos op en cero, si no lo hacemos entramos automaticamente al switch con el ultimo valor guardado
            cp.op = 0;
            //CompararLetras compara si lo que se ingresa es una letra o un numero
            cp.Abc();
            //switch de casos para acceder al menu
            switch (cp.op) {
                case 1:
                    //Ahorros
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\t\tIngresa tu ahorro: ");
                    prestamo = sc.nextDouble();
                    System.out.print("\t\t\t\t\tIngresa los meses: ");
                    meses = sc.nextInt();
                    System.out.print("\t\t\t\t\tInteres a calcular: ");
                    interes = sc.nextDouble();
                    porcentaje = interes / 100;
                    System.out.println();
                    if (prestamo <= 0) {
                        System.out.println("\t\t\t\t\tno se permiten numros negativos!");
                    } else {
                        if (prestamo < 200000000) {
                            Calculadora datos = new Calculadora(prestamo, porcentaje, meses);
                            ah.AhorrosConLibreta(datos.prestamo, datos.porcentaje, datos.meses);
                            System.out.println("----------------------------------------------------------------------------------------------------");

                        } else {
                            System.out.println("\t\t\t\t\tLo siento La cantidad es muy grande!");
                        }
                    }
                    break;
                case 2:
                    //Amortizaciones
                    System.out.println("------------------------------------------------------------------------------"
                            + "-----------------------------------------");
                    System.out.print("\t\t\t\t\tIngresa tu Credito: ");
                    prestamo = sc.nextDouble();
                    System.out.print("\t\t\t\t\tIngresa los meses: ");
                    meses = sc.nextInt();
                    System.out.print("\t\t\t\t\tInteres a calcular: ");
                    interes = sc.nextDouble();
                    porcentaje = interes / 100;
                    if (prestamo >= 500 && prestamo <= 200000) {
                        Calculadora ahorro = new Calculadora(prestamo, porcentaje, meses);
                        calculos.amortizaciones(ahorro.prestamo, ahorro.porcentaje, ahorro.meses);
                        System.out.println("------------------------------------------------------------------------------"
                                + "-----------------------------------------");
                    } else {
                        System.out.println("\t\t\tLo siento no podemos darte un credito menor de Q500.00 ni mayor de Q200,000.00");
                    }
                    break;
                case 3:
                    limpiarPantalla();
                default:
                    if (cp.op > 4) {
                        System.out.println("\t\t\t\t\t\tOpcion invalida!");
                    }
                    break;
            }
            //si op es igual a 4 salimos del programa
        } while (cp.op != 4);
        System.out.println("\t\t\t\t\t\tHas salido");
    }
}
