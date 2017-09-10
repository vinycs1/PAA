import java.util.ArrayList;
import java.util.Stack;

public class Tarjan {
	  private int V;    
	    private int preCount;
	    private int[] low;
	    private boolean[] visitado;      
	    private ArrayList<Integer>[] grafo;
	    private ArrayList<ArrayList<Integer>> compFConect;
	    private Stack<Integer> stack;
	 
	    public ArrayList<ArrayList<Integer>> getFConect(ArrayList<Integer>[] grafo) 
	    {
	        V = grafo.length;
	        this.grafo = grafo;
	        low = new int[V];
	        visitado = new boolean[V];
	        stack = new Stack<Integer>();
	        compFConect = new ArrayList<>();
	 
	        for (int v = 0; v < V; v++)
	              if (!visitado[v])
	                ordenacaoDFS(v);
	 
	        return compFConect;
	    }
	    
	    public void ordenacaoDFS(int v) 
	    {
	        low[v] = preCount++;
	        visitado[v] = true;
	        stack.push(v);
	        int min = low[v];
	        for (int w : grafo[v]) 
	        {
	            if (!visitado[w])
	                ordenacaoDFS(w);
	            if (low[w] < min) 
	                min = low[w];
	        }
	        if (min < low[v]) 
	        { 
	            low[v] = min; 
	            return; 
	        }        
	        ArrayList<Integer> comp = new ArrayList<Integer>();
	        int w;
	        do
	        {
	            w = stack.pop();
	            comp.add(w);
	            low[w] = V;                
	        } while (w != v);
	        compFConect.add(comp);        
	    }
}
