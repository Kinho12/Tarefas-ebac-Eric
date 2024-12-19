package exemplosMod12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class tarefaMod12 {	
	
	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Map<String, List<String>> gruposPorSexo = new HashMap<>();

    
    gruposPorSexo.put("Masculino", new ArrayList<>());
    gruposPorSexo.put("Feminino", new ArrayList<>());

    int entradas = 6;
    int i = 0; 
    while (i < entradas) { 
        System.out.println("Digite o nome das pessoas: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo (M para masculino, F para feminino): ");
        String sexo = scanner.nextLine().toUpperCase();

        
        if (sexo.equals("M")) {
            gruposPorSexo.get("Masculino").add(nome);
            i++; 
        } else if (sexo.equals("F")) {
            gruposPorSexo.get("Feminino").add(nome);
            i++; 
        } else {
            System.out.println("Sexo inválido. Tente novamente.");
        }
    }

    
    System.out.println("\nLista de pessoas por sexo:");
    System.out.println("*******Masculino: ********\n" + gruposPorSexo.get("Masculino"));
    System.out.println("*******Feminino: *********\n" + gruposPorSexo.get("Feminino"));

    scanner.close();
}

}
