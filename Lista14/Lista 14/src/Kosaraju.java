import java.util.ArrayList;
import java.util.Collections;

public class Kosaraju {
	
	 public void ordenacaoDFS(ArrayList<Integer>[] grafo, int v, boolean[] visitado, ArrayList<Integer> comp) 
	    {
	        visitado[v] = true;
	        for (int i = 0; i < grafo[v].size(); i++)
	            if (!visitado[grafo[v].get(i)])
	                ordenacaoDFS(grafo, grafo[v].get(i), visitado, comp);
	        comp.add(v);
	    }
	    public ArrayList<Integer> ordena(ArrayList<Integer>[] grafo, boolean[] visitado) 
	    {        
	        int V = grafo.length;
	        ArrayList<Integer> ordenado = new ArrayList<Integer>();
	 
	        for (int i = 0; i < V; i++)
	            if (!visitado[i])
	                ordenacaoDFS(grafo, i, visitado, ordenado);
	        return ordenado;
	    }
	    public ArrayList<Integer>[] transposta(ArrayList<Integer>[] grafo)
	    {
	        int V = grafo.length;
	        ArrayList<Integer>[] g = new ArrayList[V];
	        for (int i = 0; i < V; i++)
	            g[i] = new ArrayList<Integer>();
	        for (int v = 0; v < V; v++)
	            for (int i = 0; i < grafo[v].size(); i++)
	                g[grafo[v].get(i)].add(v);
	        return g;
	    }

	    public ArrayList<ArrayList<Integer>> getFConect(ArrayList<Integer>[] grafo)
	    {
	        int V = grafo.length;
	        boolean[] visitado = new boolean[V];
	        ArrayList<Integer> ordenado = ordena(grafo, visitado);       
	        ArrayList<Integer>[] grafoT = transposta(grafo);        
	        visitado = new boolean[V];
	        Collections.reverse(ordenado);

	        ArrayList<ArrayList<Integer>> FConect = new ArrayList<>();
	        for (int i = 0; i < ordenado.size(); i++)
	        {
	            int v = ordenado.get(i);
	            if (!visitado[v]) 
	            {
	                ArrayList<Integer> comp = new ArrayList<>();
	                ordenacaoDFS(grafoT, v, visitado, comp);
	                FConect.add(comp);
	            }
	        }
	        return FConect;
	    }
	    public static void main(String[] args)
	    {
	        Kosaraju k = new Kosaraju();
	        Tarjan t = new Tarjan();
	        int V;
	        V=9;
	        ArrayList<Integer>[] g = new ArrayList[V];
	        for (int i = 0; i < V; i++)
	            g[i] = new ArrayList<Integer>();
	        g[0].add(1);
	        g[0].add(2);
	        g[1].add(3);
	        g[1].add(4);
	        g[2].add(3);
	        g[3].add(0);
	        g[3].add(7);
	        g[4].add(5);
	        g[5].add(6);
	        g[5].add(7);
	        g[6].add(4);
	        g[7].add(8);
	        g[8].add(7);
	        String vertices = "a=0\nb=1\nc=2\nd=3\ne=4\nf=5\ng=6\nh=7\ni=8";
	        String[] linhas = vertices.split("\n");
	        
	        System.out.println("\n->Kosaraju: ");
	        ArrayList<ArrayList<Integer>> componentesK = k.getFConect(g);
	        System.out.println(componentesK);
	        
	        ArrayList<ArrayList<Integer>> componentesT = t.getFConect(g);
	        System.out.println("\n->Tarjan: ");
	        System.out.println(componentesT);
	        
	        System.out.println("\n->Vertices:\n");
	        for(int i=0;i<linhas.length;i++)
	            System.out.println(linhas[i]);
	           
	    }    

}
