package jurosCompostos;

import java.util.Locale;
import java.util.Scanner;

/* Desafio
 Imagine que você está desenvolvendo um aplicativo para um banco que deseja calcular os juros compostos de um investimento. 
 Seu objetivo é criar uma função que receba três parâmetros: o valor inicial do investimento, a taxa de juros anual 
 e o período de tempo em anos. A função deve calcular e retornar o valor final do investimento após o período determinado, 
 levando em consideração os juros compostos. */

public class JurosCompostos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorInicial = sc.nextDouble();
		double taxaJuros = sc.nextDouble();
		int periodo = sc.nextInt();

		double valorFinal = valorInicial;

		for (int i = 0; i < periodo; i++) {
			valorFinal += valorFinal * taxaJuros;
		}

		valorFinal = Double.parseDouble(String.format("%.2f", valorFinal));

		System.out.println("Valor final do investimento: R$ " + valorFinal);

		sc.close();

	}

}
