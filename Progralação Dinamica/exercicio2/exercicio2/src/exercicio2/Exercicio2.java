/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Vinicius
 */
public class Exercicio2 {
    
   public static int mochiladinamica(int []w, int[] v,int capacidade){
        int qtditens = w.length;
        
        
        int V[][] = new int[qtditens +1][capacidade +1];
        for(int i=0;i<=capacidade;i++){
            V[0][i] = 0;
        }
        for(int i=1; i<=qtditens;i++){
            V[i][0] = 0;
        }
         for(int i=0;i<qtditens;i++){
             for(int j=0;j<=capacidade ;j++){
                 if(w[i]<=j){
                     if((v[i] + V[i][j-w[i]])>V[i][j]){
                         V[i+1][j] = (v[i] + V[i][j-w[i]]);
                     }
                     else{
                         V[i+1][j] =V[i][j];
                     }
                 }else{
                        V[i+1][j] =V[i][j];
                      }
             }
             
         }
         
         
         /*for (int i = 0; i <=qtditens; i++) {
			for (int j = 0; j <= capacidade; j++) {
				System.out.print(V[i][j]+" ");
			}
			System.out.println();
		}*/
         
         int  i = qtditens;
         int  k = capacidade;
         int j=0;
         int mochila[]= new int[qtditens];
         while(i>0 && k>0){
             if(V[i][k] != V[i-1][k]){
                 mochila[j]= i;
                 System.out.print(mochila[j]);
              }
             i--;
                k= k-w[i];
             j++;
         }
            return V[qtditens][capacidade]; 
         }
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]={5,4,7,7};
        int w[]={5,6,8,4};
        int capacidade =13;
       
       mochiladinamica(w,v,capacidade);
       
       
    




    }
    
}
