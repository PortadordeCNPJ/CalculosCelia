package calculos;

import java.util.Scanner;

public class foracadecontato {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double F /*Força*/, m /*atrito*/, a /*aceleração*/, p /*Peso*/, g /*gravidade*/, c /*contato entre blocos*/;
        char opt;

        System.out.println("Calculo para descobrir a força de contração ou Contato");

        System.out.println("Digite C/S para COM Atrito ou SEM Atrito: ");
        opt = teclado.nextLine().charAt(0);

        if (Character.toUpperCase(opt) == 'C') {
            System.out.println("");
        } else if ((Character.toUpperCase(opt) == 'S') || (Character.toUpperCase(opt) == 's')) {

        } else {
            System.out.println("Opção inválida, por favor digite novamente apenas 'S ou C' .");
        }

    }
}
