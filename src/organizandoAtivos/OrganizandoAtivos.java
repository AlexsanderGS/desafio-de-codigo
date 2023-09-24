package organizandoAtivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Descrição
 Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria, foi identificado 
 a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários. 
 Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos que será 
 informada pelos usuários. Os ativos são representados por strings que representam seus tipos, 
 como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros. */

public class OrganizandoAtivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> ativos = new ArrayList<>();

		// Entrada dos tipos de ativos
		int quantidadeAtivos = sc.nextInt();

		// Entrada dos códigos dos ativos
		for (int i = 0; i <= quantidadeAtivos; i++) {
			String codigoAtivo = sc.nextLine();
			ativos.add(codigoAtivo);
		}

		Collections.sort(ativos);
		for (String str : ativos) {
			System.out.println(str);
		}

		sc.close();
	}

}
