package aulas.aulassala;

import java.util.Scanner;

public class Aulas2103 {

    //programa para testar se é Sr. ou Sra.
    public static void main(String[] args) {
        int idade;
        String nome;
        char sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite M/F para masculino ou feminino: ");
        sexo = teclado.nextLine().charAt(0);

        System.out.println("Digite a idade: ");
        idade = teclado.nextInt();

        if ((Character.toUpperCase(sexo) == 'M') || (Character.toUpperCase(sexo) == 'm')) {
            System.out.printf("Bom dia, Sr %s", nome);
            
        } 
        else 
            
        if ((Character.toUpperCase(sexo) == 'F') || (Character.toUpperCase(sexo) == 'f')) {
            System.out.printf("Bom dia, Sra %s", nome);
            
        }
        else 
            {System.out.println("Sexo invalido.");}
        
    }
}
