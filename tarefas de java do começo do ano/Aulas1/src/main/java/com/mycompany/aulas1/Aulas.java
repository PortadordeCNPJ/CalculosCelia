package com.mycompany.aulas1;
import java.util.Scanner;
public class Aulas {
    public static void main(String[] args) {
        String nome;
        float altura;

        Scanner meuTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = meuTeclado.nextLine();
        System.out.println("Digite sua altura: ");
        altura = meuTeclado.nextFloat();
        meuTeclado.nextLine(); // Consumir a nova linha deixada no buffer

        System.out.println("Olá! Seja bem-vindo, " + nome + ". Para entrar, você deve ter 1,40m de altura. Sua altura é: " + altura);
    }
}