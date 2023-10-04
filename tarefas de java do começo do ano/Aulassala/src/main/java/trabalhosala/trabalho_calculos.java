package trabalhosala;

import java.util.Scanner;

public class trabalho_calculos {

    public static void main(String[] args) {

        //Programa para calcular a formula de bascara.
        double delta, b, a, c, x, x1, x2;

        Scanner meuteclado = new Scanner(System.in);

        //valores a serem digitados pelo usuario.
        System.out.println("Digite o valor de B: ");
        b = meuteclado.nextDouble();

        System.out.println("\nDigite o valor de A");
        a = meuteclado.nextDouble();

        System.out.println("\nDigite o valor de C");
        c = meuteclado.nextDouble();

        //calculo para achar o valor de Delta.    
        delta = (b * b) + ((- 4 * a) * c);

        //calculo para achar a raiz quadrada.
        x = Math.sqrt(delta);

        //calculo para determinar o valor de X1.
        x1 = (-(b) + x) / (2 * a);
        System.out.printf("O valor de X1 é: " + x1);

        //calculo para determinar o valor de X2.
        x2 = (-(b) - x) / (2 * a);
        System.out.printf("\nO valor de X2 é: " + x2);

    }

}
