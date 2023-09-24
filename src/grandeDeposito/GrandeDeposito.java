package grandeDeposito;

import java.util.Locale;
import java.util.Scanner;

/* Desafio
 Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a realizar depósitos em suas contas.
 O programa deve solicitar ao cliente o valor do depósito e verificar se o valor é válido. 
 Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo da conta. Caso contrário, 
 o programa deve exibir uma mensagem de erro. O programa deve soliticar apenas uma vez o valor de depósito. */

public class GrandeDeposito {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor > 0) {
			System.out.println("Deposito realizado com sucesso!");
			System.out.printf("Saldo atual: R$ %.2f", valor);
		} else if (valor == 0) {
			System.out.println("Encerrando o programa...");
		} else {
			System.out.println("Valor inválido! Digite um valor maior que zero.");
		}

		sc.close();

	}

}
