package Quimica;

public class Quimica {

   
    public String Calculo_de_comparacao_atomos(int massa1, int massa2, int prot1, int prot2, int neut1, int neut2, int eletr1, int eletr2) {
        //fisica Guilherme de S 3C
        String retorno = "";
        if (massa1 == massa2) {
            if (prot1 == prot2) {
                retorno = "ISOTOPOS";
            } else {
                retorno = "ISOBAROS";
            }

        } else {
            if (prot1 == prot2) {
            } else {
                if (neut1 == neut2) {
                    retorno = "ISOTONOS";
                } else {
                    if (eletr1 == eletr2) {
                       retorno = "ISOELETRONICOS";
                    }
                }
            }

        }
        return retorno;
    }
     
}