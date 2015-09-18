
package calculadorafinanciera;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Amortizacion{
    
    //El metodo amortizaciones maneja la parte de los creditos 
    public  void amortizaciones(double prestamo, double porcentaje, int meses){
        StringBuilder sb = new StringBuilder();
        double total1=0;
        double total2 = 0;
        double cuota = prestamo /meses;
        double intereses ;
        double cuotaMensual ;
        //Encabezado
        System.out.println("\t\t\t\t(CANTIDADES EXPRESADAS EN QUETZALES)\n");
        System.out.println("\tMES\t\t   SALDO\t\t    CUOTA FIJA\t\t    INTERES\t\t\t    MENSUALIDAD");
        //Iteración para realizar las operaciones
        for (int i = 0; i < meses; i++) {
            intereses = (prestamo * porcentaje)/12;
            cuotaMensual = cuota+intereses;
            //redondeamos los decimales usando BigDecimal
            //la variable intereses cambia a interes, capital cambia a cap, cuota cambia a cuot, cuotaMensual cambia a cmensual.
            BigDecimal interes = new BigDecimal(intereses);
            BigDecimal cap = new BigDecimal(prestamo);
            BigDecimal cuot = new BigDecimal(cuota);
            BigDecimal cmensual = new BigDecimal(cuotaMensual);      
            interes = interes.setScale(2,RoundingMode.HALF_UP);
            cap = cap.setScale(2,RoundingMode.HALF_UP);
            cuot = cuot.setScale(2,RoundingMode.HALF_UP);
            cmensual = cmensual.setScale(2,RoundingMode.HALF_UP);           
            //Concatenamos con StringBuilder
            sb.append("\t").append(i+1).append("\t\t   ").append(cap).append("\t\t    ").append(cuot).append("\t\t    ")
                    .append(interes).append("\t\t\t    ").append(cmensual).append("\n");          
            prestamo = prestamo - cuota;
            total1 = total1 + intereses;
            total2 = total2 + cuotaMensual;
        }
        double totales = cuota*meses;
        //Imprimimos en pantalla
        System.out.print(sb);
        //Imprimimos los totales y redondeamos los decimales con BigDecimal antes de que sean impresos
        //la variable contador cambia a cont1, la variable contador2 cambia a cont2, capital cambia a cap, totales cambia a tot.
        BigDecimal cont1 = new BigDecimal(total1);
        BigDecimal cont2 = new BigDecimal(total2);
        BigDecimal cap = new BigDecimal(prestamo);
        BigDecimal tot = new BigDecimal(totales);
        cont1 = cont1.setScale(2,RoundingMode.HALF_UP);
        cont2 = cont2.setScale(2,RoundingMode.HALF_UP);
        cap = cap.setScale(2,RoundingMode.HALF_UP);
        tot = tot.setScale(2,RoundingMode.HALF_UP);
        //Se imprimen los totales
        System.out.println("\tTOTALES\t\t   "+cap+"\t\t \t    "+tot+"\t\t    "+cont1+"\t\t\t    "+cont2);
        System.out.println();
    }
}
