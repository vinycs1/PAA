import java.util.ArrayList;

public class Pilha {
	
	  public ArrayList<Integer> objetos = new ArrayList<>();

	  public void insere(int i) {
	    this.objetos.add(i);
	  }

	  public int remove() {
		int indiceultimo= this.objetos.size()-1;
		int ultimo = this.objetos.get(indiceultimo);
	     this.objetos.remove(indiceultimo);
	     return ultimo;
	  }

	  public int tamanho() {
		  if(objetos.size() ==0){
			  return 0;
		  }else {
			  return objetos.size();
		  }
	
	  }
	  
	 
	  
	  
	  public void imprimePilha(){
		  for(int i =0;i<objetos.size();i++){
			  System.out.print(this.objetos.get(i) + " ");
		  }
	  }
}
