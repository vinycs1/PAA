

public class Principal {
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* "Introdução a IHC=0
		 * Programação I=1
		 * Álgebra Linear I=2
		 * Cálculo de uma Variável=3
		 * Mecânica Newtoniana=4
		 * Laboratório Mecânica Newtoniana=5
		 * Introdução a Arquitetura de Computadores=6
		 * Lógica para a Computação=7
		 * Porgramação II=8
		 * Cálculo a Várias Variáveis I=9
		 * O Homem e o Fenômeno Religioso=10
		 * Modelagem de Dados=11
		 * Estruturas de Dados Avançadas=12
		 * Software Básico=13
		 * Probabilidade e Estatística=14
		 * Equações Diferenciais e de Diferenças=15
		 * Optativa e Cristianismo=16
		 * Banco de Dados=17
		 * Programação Modular=18
		 * Estruturas Discretas=19
		 * Linguagens Formais e Autômatos=20
		 * Sistemas de Computação=21
		 * Sinais de Sistemas=22
		 * Engenharia de Requisitos=23
		 * Programação OO=24
		 * Análise de Algoritmos=25
		 * Semântica de Linguagens=26
		 * Compiladores=27
		 * Análise Numérica I=28
		 * Ética Cristã=29
		 * Modelagem de Software=30
		 * Optativa de Filosofia=31
		 * Inteligência Artificial=32
		 * Especificação e Análise Formal de Sistemas=33
		 * Redes de Comunicação de Dados=34
		 * Ética Profissional=35
		 * Teste de Software=36
		 * Projeto de Sistema de Software=37
		 * Princípios de Engenharia de Software=38
		 * Projeto Final I=39
		 * Seminários=40
		 * Computabilidade=41
		 * Optativas de Humanidade=42
		 * Projeto Final II=43
		 * Estágio Supervisionado=44"*/
		 Grafo g = new Grafo();
		 
		 g.adjacencias[1][8] = 1;
		 g.adjacencias[1][20] = 1;
		 g.adjacencias[1][28] = 1;
		 g.adjacencias[2][22] = 1;
		 g.adjacencias[3][9] = 1;
		 g.adjacencias[7][20] = 1;
		 g.adjacencias[7][32] = 1;
		 g.adjacencias[8][12] = 1;
		 g.adjacencias[8][13] = 1;
		 g.adjacencias[8][18] = 1;
		 g.adjacencias[9][14] = 1;
		 g.adjacencias[9][15] = 1;
		 g.adjacencias[9][22] = 1;
		 g.adjacencias[9][34] = 1;
		 g.adjacencias[10][16] = 1;
		 g.adjacencias[11][17] = 1;
		 g.adjacencias[11][30] = 1;
		 g.adjacencias[12][25] = 1;
		 g.adjacencias[12][26] = 1;
		 g.adjacencias[12][27] = 1;
		 g.adjacencias[12][32] = 1;
		 g.adjacencias[12][33] = 1;
		 g.adjacencias[13][21] = 1;
		 g.adjacencias[13][27] = 1;
		 g.adjacencias[16][29] = 1;
		 g.adjacencias[18][24] = 1;
		 g.adjacencias[18][36] = 1;
		 g.adjacencias[19][25] = 1;
		 g.adjacencias[20][26] = 1;
		 g.adjacencias[20][27] = 1;
		 g.adjacencias[20][33] = 1;
		 g.adjacencias[20][41] = 1;
		 g.adjacencias[21][34] = 1;
		 g.adjacencias[24][30] = 1;
		 g.adjacencias[24][38] = 1;
		 g.adjacencias[25][41] = 1;
		 g.adjacencias[29][35] = 1;
		 g.adjacencias[30][38] = 1;
		 g.adjacencias[39][43] = 1;
		
		 


	
		//System.out.println();

		g.DFS(g);
		
		//System.out.println(g.ordemvisita);
		
		
		
		
		
		
		
	

		


	
	}

}
