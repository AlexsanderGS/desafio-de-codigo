package herancaBancaria;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/* Desafio
 Após o sucesso no desenvolvimento do sistema básico de abertura de contas bancárias, o banco decidiu expandir 
 seus serviços para oferecer diferentes tipos de contas. Agora, além das contas bancárias comuns, 
 eles também oferecem contas poupança. Sua tarefa é implementar a herança e o polimorfismo no sistema, 
 criando uma classe "ContaPoupanca" que herde da classe "ContaBancaria" anteriormente criada. 
 A classe "ContaPoupanca" deve adicionar um novo atributo, taxa de juros, além dos atributos herdados.

 Dica: Utilize a herança para criar a classe "ContaPoupanca" que herde da classe "ContaBancaria" 
 e adicione o atributo "taxaJuros". Implemente o método "exibirInformacoes()" na classe "ContaPoupanca" para exibir 
 as informações adicionais. */

public class HerancaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String titular = scanner.next();
		int numeroConta = scanner.nextInt();
		double saldo = scanner.nextDouble();
		double taxaJuros = scanner.nextDouble();

		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

		System.out.println("Conta Poupanca:");
		contaPoupanca.exibirInformacoes();

		scanner.close();
	}
}

class ContaBancaria {
	protected int numero;
	protected String titular;
	protected double saldo;

	public ContaBancaria(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void exibirInformacoes() {
		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		System.out.println(titular);
		System.out.println(numero);
		System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
	}
}

class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;

	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Taxa de juros: " + taxaJuros + "%");
		
	}

}
