/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aulas.aulas2;

import java.util.Scanner;

/**
 *
 * @author guilherme.muller2
 */
public class Aulas2 {

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
