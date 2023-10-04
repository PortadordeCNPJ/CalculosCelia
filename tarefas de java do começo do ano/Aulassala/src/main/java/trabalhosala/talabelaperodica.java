package trabalhosala;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openscience.cdk.interfaces.IElement;
import org.openscience.cdk.tools.periodictable.PeriodicTable;
import java.util.Scanner;
import org.openscience.cdk.config.Elements;
import org.openscience.cdk.config.Isotopes;

public class talabelaperodica {

    public static void main(String[] args) throws IOException {

        ArrayList<Object> listaDeMetais = new ArrayList<Object>();
        listaDeMetais.add("AlkaliMetals");
        listaDeMetais.add("TransitionMetals");
        listaDeMetais.add("AlkaliEarthMetals");
        listaDeMetais.add("Actinides");
        listaDeMetais.add("Lanthanides");
        listaDeMetais.add("Metals");
        
        ArrayList<Object> listaDeNaoMetais = new ArrayList<Object>();
        listaDeMetais.add("NonMetals");
        listaDeMetais.add("Metalloids");
        listaDeMetais.add("NonMetals");
        
        Scanner scanner = new Scanner(System.in);
        String elemento = scanner.next();

        if (listaDeMetais.contains(PeriodicTable.getChemicalSeries(elemento))) {
            System.out.println("É metal");
        }

//	
//	System.out.println(PeriodicTable.getChemicalSeries(elemento));
        System.out.println(PeriodicTable.getChemicalSeries("la"));
        //System.out.println(PeriodicTable.getChemicalSeries("He"));

//	System.out.println("Teste");
    }
}
