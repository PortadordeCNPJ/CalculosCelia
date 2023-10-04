package aulas.aulassala;

import java.util.Scanner;

public class Aulas210322 {

    public static void main(String[] args) {
        //teste para ver quais meses tem 30 e 31 dias

        int mes, ano = 2018, mundias = 0;

        Scanner meuteclado = new Scanner(System.in);
        System.out.println("Digite o  número do mês");
        mes = meuteclado.nextInt();

        switch (mes) {

//meses que vão até o dia 31           
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                mundias = 31;
                break;
            }

//meses que vão até o dia 30
            case 4:
            case 6:
            case 9:
            case 11: {
                mundias = 30;
                break;
            }

//mes de fevereiro, teste para ver se é ano bicisto ou não para adicionair 1 dia aos 28 dias
            case 2: {
                if (((ano % 4 == 0)
                        && !(ano % 100 == 0))
                        || (ano % 400 == 0)) {
                    mundias = 29;
                    break;
                } else {
                    mundias = 28;
                    break;
                }
            }

            default:
                System.out.println("mes invalido");
                break;
        }

        System.out.println("Este mes tem " + mundias + "dias");
    }
}
