

public class Principal {
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* "Introdu��o a IHC=0
		 * Programa��o I=1
		 * �lgebra Linear I=2
		 * C�lculo de uma Vari�vel=3
		 * Mec�nica Newtoniana=4
		 * Laborat�rio Mec�nica Newtoniana=5
		 * Introdu��o a Arquitetura de Computadores=6
		 * L�gica para a Computa��o=7
		 * Porgrama��o II=8
		 * C�lculo a V�rias Vari�veis I=9
		 * O Homem e o Fen�meno Religioso=10
		 * Modelagem de Dados=11
		 * Estruturas de Dados Avan�adas=12
		 * Software B�sico=13
		 * Probabilidade e Estat�stica=14
		 * Equa��es Diferenciais e de Diferen�as=15
		 * Optativa e Cristianismo=16
		 * Banco de Dados=17
		 * Programa��o Modular=18
		 * Estruturas Discretas=19
		 * Linguagens Formais e Aut�matos=20
		 * Sistemas de Computa��o=21
		 * Sinais de Sistemas=22
		 * Engenharia de Requisitos=23
		 * Programa��o OO=24
		 * An�lise de Algoritmos=25
		 * Sem�ntica de Linguagens=26
		 * Compiladores=27
		 * An�lise Num�rica I=28
		 * �tica Crist�=29
		 * Modelagem de Software=30
		 * Optativa de Filosofia=31
		 * Intelig�ncia Artificial=32
		 * Especifica��o e An�lise Formal de Sistemas=33
		 * Redes de Comunica��o de Dados=34
		 * �tica Profissional=35
		 * Teste de Software=36
		 * Projeto de Sistema de Software=37
		 * Princ�pios de Engenharia de Software=38
		 * Projeto Final I=39
		 * Semin�rios=40
		 * Computabilidade=41
		 * Optativas de Humanidade=42
		 * Projeto Final II=43
		 * Est�gio Supervisionado=44"*/
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
