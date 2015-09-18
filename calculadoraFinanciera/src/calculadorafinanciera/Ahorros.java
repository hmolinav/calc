package calculadorafinanciera;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ahorros {

    //El metodo AhorroConLibreta maneja la parte de los ahorros de la calculadora
    public static void AhorrosConLibreta(double prestamo, double porcentaje, int meses) {
        StringBuilder sb = new StringBuilder();
        double total = 0;
        //CREAOMOS EL ENCABEZADO
        System.out.println();
        System.out.println("\t\t\t\t(CANTIDADES EXPRESADAS EN QUETZALES)\n");
        System.out.println("\tMES\t\t    SALDO\t\t\t    INTERES GANADO\t\t    TOTAL");
        //creamos una iteracion para calcular los datos
        //el bucle itera la cantidad de meses y va guardando los datos en una variable tipo StringBuilder
        for (int i = 0; i < meses; i++) {
            double intGanado = (prestamo * porcentaje);
            total = prestamo + intGanado;
            //redondeamos los decimales usando BigDecimal
            BigDecimal interes = new BigDecimal(intGanado);
            BigDecimal tot = new BigDecimal(prestamo);
            BigDecimal totInt = new BigDecimal(total);
            interes = interes.setScale(2, RoundingMode.HALF_UP);
            tot = tot.setScale(2, RoundingMode.HALF_UP);
            totInt = totInt.setScale(2, RoundingMode.HALF_UP);
            //concatenamos con StringBuilder
            prestamo = prestamo + intGanado;
            sb.append("\t").append(i + 1).append("\t\t    ").append(tot).append("\t\t\t    ")
                    .append(interes).append("\t\t\t    ").append(totInt).append("\n");
        }
        //Imprimimos en pantalla la variable sb que es de tipo StringBuilder donde tenemos guardadas las iteraciones
        System.out.print(sb);
        System.out.println();
        System.out.print("Tu saldo total dentro de " + meses + " meses será de ");
        System.out.printf("%.2f", total);
        System.out.println();
    }

}
