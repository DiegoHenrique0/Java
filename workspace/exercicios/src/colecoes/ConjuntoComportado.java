package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sem criterio de orde
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("Diego");
		listaAprovados.add("Ana");
		listaAprovados.add("Fabiana");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);			
		}
		
		//Com criterio de ordem
		SortedSet<String> listaDeAprovados = new TreeSet<>();
		listaDeAprovados.add("Diego");
		listaDeAprovados.add("Ana");
		listaDeAprovados.add("Fabiana");
		listaDeAprovados.add("Pedro");
		
		System.out.println("\nListe segundo a ordem \n");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);			
		}
		
	}

}
