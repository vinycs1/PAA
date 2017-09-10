
public class MatrizPesos {
	public int [][] arestas;
	public Object [] id;
	
	public MatrizPesos(int n){
		arestas = new int[n][n];
		id=  new Object[n];
	}
	
	public int tamanho(){
		return id.length;
	}

	public void setId(int vertice,Object no){
		id[vertice] = no;
		
	}
	
	public Object getId(int vertice){
		return id[vertice];
	}
	
	public void addAresta(int origem, int destino,int peso){
		arestas[origem][destino]=peso;
	}
	public boolean eAresta(int origem, int destino){
		return arestas[origem][destino]>0;
	}
	
	public void removeAresta(int origem, int destino){
		arestas[origem][destino]=0;
	}
	
	public int getPeso(int origem, int destino){
		return arestas[origem][destino];
		
	}
	
	public int [] vizinhos(int vertice){
		int total =0;
		for(int i=0;i<arestas[vertice].length;i++){
			if(arestas[vertice][i]>0){
				total++;
			}
		}
		
		final int[] fim = new int [total];
		total=0;
		for(int i=0;i<arestas[vertice].length;i++){
			if(arestas[vertice][i]>0){
				fim[total++] =i;
			}
		}
		
		return fim;
		
	}
	
}
