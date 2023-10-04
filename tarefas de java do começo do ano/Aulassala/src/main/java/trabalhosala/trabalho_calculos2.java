package trabalhosala;

import java.util.Scanner;

public class trabalho_calculos2 {

    public static void main(String[] args) {

        //programa para calcular a Função horaria dos espaços.
        double saida, veloc, tempo, S;

        Scanner meuteclado = new Scanner(System.in);

        System.out.println("Digite a posição inicial de saída: ");
        saida = meuteclado.nextDouble();

        System.out.println("Digite à velocidade: ");
        veloc = meuteclado.nextDouble();

        System.out.println("Digite o tempo gasto: ");
        tempo = meuteclado.nextDouble();

        //Calculo para descobrir a posição em que o objeto se encontra.
        S = (saida + veloc) * tempo;

        System.out.println("A posição é igual à: " + S);

    }

}
