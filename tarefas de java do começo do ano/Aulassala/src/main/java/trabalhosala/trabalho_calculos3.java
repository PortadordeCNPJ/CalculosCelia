package trabalhosala;

import java.util.Scanner;

public class trabalho_calculos3 {

    public static void main(String[] args) {
        //Programa para testar se um atomo é Isótopo, Isóbaro, Iaótonos, Isoeletrônicos.

        int massa1, massa2, prot1, prot2, neut1, neut2, eletr1, eletr2;

        Scanner mykeyboard = new Scanner(System.in);

        //Primeiro atomo para comparação
        System.out.println("Digite o número Protons: ");
        prot1 = mykeyboard.nextInt();

        System.out.println("Digite o número de Neutrons: ");
        neut1 = mykeyboard.nextInt();

        //calculo para o numero de massa;
        massa1 = prot1 + neut1;

        System.out.println("Digite o número de eletrons");
        eletr1 = mykeyboard.nextInt();

        //Segundo atomo para comparação
        System.out.println("Digite o número Atômico do segundo atomo: ");
        prot2 = mykeyboard.nextInt();

        System.out.println("Digite o número de Neutrons do segundo atomo: ");
        neut2 = mykeyboard.nextInt();

        //calculo para o numero de massa;
        massa2 = prot2 + neut2;

        System.out.println("Digite o número de eletrons do segundo atomo:");
        eletr2 = mykeyboard.nextInt();

        //teste para saber quais são Isótopo, Isóbaro, Iaótonos, Isoeletrônicos
        if (massa1 == massa2) {
            if (prot1 == prot2) {
                System.out.println("Esses atomos são ISOTOPOS");
            } else {
                System.out.println("Esse atomo é ISÓBAROS");
            }

        } else {
            if (prot1 == prot2) {
            } else {
                if (neut1 == neut2) {
                    System.out.println("Esses atomos são ISÓTONOS");
                } else {
                    if (eletr1 == eletr2) {
                        System.out.println("Esses atomos são ISOELETRÔNICOS");
                    }
                }
            }

        }
    }

}
