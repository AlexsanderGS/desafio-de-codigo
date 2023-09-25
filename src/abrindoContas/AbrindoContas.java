package abrindoContas;

import java.util.Locale;
import java.util.Scanner;

/* Desafio
 Você é um desenvolvedor em início de carreira e foi contratado por um banco para criar um sistema básico de 
 abertura de contas. Sua tarefa é implementar uma classe chamada "ContaBancaria" que represente uma conta bancária 
 com as seguintes informações: número da conta, nome do titular e saldo.   */

public class AbrindoContas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroConta = sc.nextInt();
		sc.nextLine(); // Consome a quebra de linha após a entrada do número da conta

		String nomeTitular = sc.nextLine();
		double saldo = sc.nextDouble();

		// TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
		
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
		/*contaBancaria.setTitular(nomeTitular);
		contaBancaria.setNumero(numeroConta);
		contaBancaria.setSaldo(saldo);*/

		System.out.println("Informacoes:");
		// TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
		System.out.println("Conta: " + contaBancaria.getNumero());
		System.out.println("Titular: " + contaBancaria.getTitular());
		System.out.printf("Saldo: R$ %.1f", contaBancaria.getSaldo());

		sc.close();
	}

}
