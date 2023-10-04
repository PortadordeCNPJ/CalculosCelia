package aulas.aulassala;

import java.util.Scanner;

public class Aula2803 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // programa para saber se a pessoa pode ou não entrar no brinquedo com base na sua altura.

        String nome;
        float altura, peso;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite a sua altura: ");
        altura = teclado.nextFloat();

        System.out.println("Digite o seu peso: ");
        peso = teclado.nextFloat();

        if ((altura > 120) && (altura < 200)) {
            System.out.println("Sua altura é adequada para o brinquedo!");
        } else {
            System.out.println("Você não tem altura para entrar no brinquedo.");
        }
    }
}
