import java.util.ArrayList;

public class Grafo {
	//45vertices 
	int nnos=45; //numero de nos
	int adjacencias[][] = new int [nnos][nnos]; 
	int vertices[] = new int[nnos]; 
	public ArrayList<Integer> ordemvisita = new ArrayList<>();
	Character c[] = new Character[nnos];
	int pi[] = new int[nnos];
	int d[] = new int[nnos];
	int f[] = new int[nnos];
	public static int tempo;
	Pilha t =  new Pilha();
	
	
	
	
	public void zeros(){
		for(int i=0;i<nnos;i++){
			for(int j=0;j<nnos;j++){
				this.adjacencias[i][j] = 0;
			}
		}
	}
	
	public void setVertices(){
		for(int i=0;i<nnos;i++){
			this.vertices[i] = i;
		}
	}
	
	public int[] getArestas(int i){
		int A[] = new int [nnos];
		for(int j=0;j<nnos;j++){
			A[j] = this.adjacencias[i][j];
		}
		return A;
		
	}
	
	public void imprimeGrafo(){
		for(int i=0;i<nnos;i++){
			 for(int j=0;j<nnos;j++){
				 System.out.print(this.adjacencias[i][j]);
			 }
			 System.out.println();
			 
		 }
	}
	
	
	public int grauentrada(int j ){
		int grau=0;
		for(int i=0;i<nnos;i++){
			grau = grau + this.adjacencias[i][j];
		 }
		return grau;
		
	}
	
	
	public void busca_profundidade(){
		for(int i=0;i<nnos;i++){
			c[i] = 'w'; //pintar todos de branco
			pi[i] = 99;
		}
			tempo = 1;
			for(int i=0;i<nnos;i++){
				
				if (c[i] == 'w'){
					
					visita(i);
					
				}
		}
			
	}

	public void visita(int u){	
		ordemvisita.add(u);
		c[u] ='g'; //gray
		d[u]= tempo;
		tempo+=1;
		
		int[] Arestas = getArestas(u);
		for(int v =0;v<Arestas.length;v++){
			
			if(Arestas[v]==1 && c[v]=='w' ){
					pi[v]=u;
					visita(v);
				}
			
		}
		
		c[u]= 'b';
		f[u]=tempo; 
		tempo+=1;
		t.insere(u);
	}	
	
	
	public Pilha khan(){
		Pilha S = new Pilha();
		Pilha L = new Pilha();
		int v=0;
		
		int l[] = new int[nnos];
		
		for(int i=0;i<nnos;i++){
			l[i] = grauentrada(i);
		
			if(l[i]==0){
				S.insere(i);
				}
		}
		
		v= S.tamanho();
		
		
		
		while(S.tamanho() !=0){
			
			v=S.remove();
			
			L.insere(v);
			
			int[] Arestas = getArestas(v);	
			
			
			for(int j=0;j<Arestas.length;j++){
				
				if(Arestas[j]==1){		
					l[j] = l[j] -1;
					if(l[j]==0){
					S.insere(j);
					}
				}
			}
		
		}
		L.imprimePilha();
		return L;
	}
	
	public void DFS(Grafo g){
		g.busca_profundidade();
		g.t.imprimePilha();
	}
}
