
public class Principal {

	public static void main(String[] args) {
		final MatrizPesos G = new MatrizPesos(9);
		G.setId(0, "A");
		G.setId(1, "B");
		G.setId(2, "C");
		G.setId(3, "D");
		G.setId(4, "E");
		G.setId(5, "F");
		G.setId(6, "G");
		G.setId(7, "H");
		G.setId(8, "I");
		
		G.addAresta(0,1,4);
		G.addAresta(0,7,8);
		G.addAresta(1,2,8);
		G.addAresta(2,3,7);
		G.addAresta(2,8,2);
		G.addAresta(7,8,4);
		G.addAresta(7,6,1);
		G.addAresta(8,6,6);
		G.addAresta(2,5,4);
		G.addAresta(6,5,2);
		G.addAresta(1,7,11);
		G.addAresta(3,5,14);
		G.addAresta(3,4,9);
		G.addAresta(5,4,10);
		
		
		Dijkstra GG = new Dijkstra();
		final int [] ant = GG.dijkstra(G, 0);
		for(int i=0;i<9;i++){
			GG.imprimeCaminho(G, ant, 0, i);
		}

	}

}
