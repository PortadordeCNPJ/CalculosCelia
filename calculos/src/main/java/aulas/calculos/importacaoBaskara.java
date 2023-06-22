package aulas.calculos;

import aulas.calculos.Matematica_1;
import static java.lang.Double.isNaN;
import java.util.ArrayList;

public class importacaoBaskara {

    public static void main(String[] args) {
         Matematica_1 matematica = new Matematica_1();
        ArrayList<Double> resultados = matematica.Baskara(-6, 2, 0);

        if (isNaN(resultados.get(0))) {
            System.out.println("Os valores são invalidos");
        } else {
            System.out.println("Os valores são: " + resultados.get(0) + " " + resultados.get(1));
        }
    }
}
