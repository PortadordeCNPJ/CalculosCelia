package estudosParaProva;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class EstudosParaProva {

    public static void main(String[] args) {
        Pessoa TesteIMC = TesteIMC();
    }

    public static Pessoa TesteIMC() {
        Pessoa pessoa = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        double IMC, alturaTemp;

        System.out.println("Digite seu nome");
        pessoa.setNome(teclado.nextLine());

        System.out.println("Digite sua idade");
        pessoa.setIdade(teclado.nextInt());

        System.out.println("Digite sua altura");
        pessoa.setAltura(teclado.nextDouble());

        System.out.println("Digite seu peso");
        pessoa.setPeso(teclado.nextDouble());

        alturaTemp = pessoa.getAltura() / 100;
        IMC = pessoa.getPeso() / (alturaTemp * alturaTemp);

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        System.out.println("Olá " + pessoa.getNome() + ",seu IMC é: " + decimalFormat.format(IMC));

        if (IMC < 18.5) {
            System.out.println("MAGREZA \n Obesidade(grau) 0");

        } else if (IMC < 24.9) {
            System.out.println("NORMAL \n Obesidade(grau) 0");
        } else if (IMC < 29.9) {
            System.out.println("NORMAL \n Obsidade (grau 1)");
        } else if (IMC < 39.9) {
            System.out.println("NORMAL \n Obsidade (grau 2)");
        } else if (IMC >= 40.0) {
            System.out.println("NORMAL \n Obsidade (grau 3)");
        } else {
        }

        return pessoa;
    }

}
