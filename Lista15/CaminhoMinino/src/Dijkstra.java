import java.util.ArrayList;

public class Dijkstra {

		public static int []dijkstra(MatrizPesos G,int s){
			final int [] distancia = new int[G.tamanho()];
			final int [] anterior = new int [G.tamanho()];
			final boolean [] visitados = new boolean[G.tamanho()];
			
			for(int i=0;i<distancia.length;i++){
				distancia[i] =Integer.MAX_VALUE; //infinito
			}
			
			distancia[s]=0; //distancia do vertice inicial é zero
			
			for(int i=0;i<distancia.length; i++){
				final int proximo = menorVertice(distancia,visitados);
				visitados[proximo] = true;
				
				final int []n = G.vizinhos(proximo);
				for(int j=0; j<n.length;j++){
					final int v=n[j];
					final int d= distancia[proximo] + G.getPeso(proximo, v);
					if(distancia[v] > d){
						distancia[v] = d;
						anterior[v] = proximo;
					}
				}
				
			}
			
	
			return anterior;
		}
		
		public static int menorVertice(int [] distancias, boolean []v){
			int x= Integer.MAX_VALUE;
			int y=-1;
			for(int i=0; i<distancias.length;i++){
				if(!v[i] && distancias[i] <x){
					y=i;
					x=distancias[i];
					}
				}
			
			return y;
		}
		
		public static void imprimeCaminho(MatrizPesos G, int [] anterior, int inicio, int fim){
			final java.util.ArrayList caminho = new java.util.ArrayList();
			int x = fim;
			
			while(x!=inicio){
				caminho.add(0, G.getId(x));
				x=anterior[x];
				
			}
			caminho.add(0, G.getId(inicio));
			System.out.println(caminho);
		}	
}
