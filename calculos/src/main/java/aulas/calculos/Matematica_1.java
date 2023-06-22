package aulas.calculos;

import java.util.ArrayList;

public class Matematica_1 {
    
    //Guilherme de Souza Muller 3C
    
    public void main(String[] args) {
        ArrayList<Double> resultados = Baskara(12, 2, -14);
        System.out.println("hello world");
    }

    public ArrayList<Double> Baskara(double b, double a, double c) {
        //física Guilherme de S 3C
        
        double delta, x, x1, x2;
        
        //calculo para achar o valor de Delta.
        delta = ((b * b) - (4 * (a * c)));

        //calculo para achar a raiz quadrada.
        x = Math.sqrt(delta);

        //calculo para determinar o valor de X1.
        x1 = (-(b) + x) / (2 * a);

        //calculo para determinar o valor de X2.
        x2 = (-(b) - x) / (2 * a);
        
        

        ArrayList<Double> resultado = new ArrayList<Double>();
        resultado.add(x1);
        resultado.add(x2);

        return resultado;
    }

}
