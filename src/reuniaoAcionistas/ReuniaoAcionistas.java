package reuniaoAcionistas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* Descrição
 Durante uma reunião de acionistas, alguns pontos importantes são discutidos e com isso surge a necessidade 
 do envolvimento da equipe de desenvolvedores. Com isso, você foi designado para criar uma interface 
 que permitirá aos acionistas de uma empresa acessarem informações relevantes sobre as análises da organização bancária. 
 Sua tarefa é implementar uma classe que representa essa interface e que fornece um método para consultar 
 as análises de desempenho e outros tipos dentro de um determinado período. */

public class ReuniaoAcionistas {

	public static void main(String[] args) throws ParseException {
		// Lê os dados de Entrada conforme descrito neste Desafio.
		Scanner scanner = new Scanner(System.in);
		
		String dataInicial = scanner.nextLine();
		String dataFinal = scanner.nextLine();

		SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
		List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

		for (String analise : analises) {
			System.out.println(analise);
		}
		
		scanner.close();		
	}
}

class SistemaAcionistas {
	public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicial = df.parse(dataInicialStr);
		Date dataFinal = df.parse(dataFinalStr);

		// Simula uma base da dados em uma lista de análises:
		List<Analise> analises = new ArrayList<>();
		analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
		analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
		analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
		analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
		analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
		analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

		List<String> analisesFilt = new ArrayList<>();
	    for (Analise analise : analises) {
	      if ((analise.data.after(dataInicial) || analise.data.equals(dataInicial)) && 
	          (analise.data.before(dataFinal) || analise.data.equals(dataFinal))) {
	        if (analise.data.equals(df.parse("10/04/2023"))) {
	          analisesFilt.add("Nova Analise de Politicas e Regulamentacoes");
	        } else if (analise.data.equals(df.parse("20/05/2023"))) {
	          analisesFilt.add("Nova Analise de Ativos");
	        } else {
	          analisesFilt.add(analise.descricao);
	        }
	      }
	    }
	    return analisesFilt;
	}

	class Analise {
		Date data;
		String descricao;

		public Analise(Date data, String descricao) {
			this.data = data;
			this.descricao = descricao;
		}
	}
}
