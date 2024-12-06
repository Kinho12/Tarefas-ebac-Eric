package tarefaEbac11;

import java.util.Arrays;
import java.util.Scanner;

public class exemploOrdem {
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		
		// Solicita ao usuário os nomes separados por vírgula
		System.out.println("Digite os nomes separados por vírgula:");
		String entrada = scanner.nextLine();

		// Divide a string em um array de nomes, removendo espaços extras
		String[] nomes = entrada.split(",");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = nomes[i].trim();
		}

		// Ordena os nomes em ordem alfabética
		Arrays.sort(nomes);

		// Exibe os nomes ordenados
		System.out.println("Nomes em ordem alfabética:");
		      	for (String nome : nomes) {
		      		System.out.println(nome);
		        }

		        scanner.close();
		    
		}
	}






///////////Tarefa parte 2 -  separando por sexo;
package tarefaEbac11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class tarefa2 {

	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> gruposPorSexo = new HashMap<>();
        
        
        gruposPorSexo.put("Masculino", new ArrayList<>());
        gruposPorSexo.put("Feminino", new ArrayList<>());
        
        int entradas = 6;
       int i = 0;
        while (i < entradas) {
        	System.out.println("Digite o nome das pessoas: ");
        	String nomes = scanner.nextLine();
        	
        	System.out.println("Digite o sexo(M para masculino, F para feminino");
        	String sexo = scanner.nextLine().toUpperCase();
        	
        	if (sexo.equals("M")) {
        		gruposPorSexo.get("Masculino").add(nomes);
        		i++;
        	} else if (sexo.equals("F")) {
        		gruposPorSexo.get("Feminino").add(nomes);
        		i++;
        	} else System.out.println("Sexo inválido tente novamete");
        
        }
        System.out.println("\nLista de pessoas por sexo:");
        System.out.println("Masculino: " + gruposPorSexo.get("Masculino"));
        System.out.println("Feminino: " + gruposPorSexo.get("Feminino"));
	   
        
        scanner.close();
	}
}