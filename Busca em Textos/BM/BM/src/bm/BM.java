/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bm;

/**
 *
 * @author Vinicius
 */
public class BM {
      
    public static Character [] stringToArray(String texto){
        if(texto ==  null){
            return null;
        }
        int tamanho =  texto.length();
        Character[] vetor = new Character[tamanho];
        for(int i=0;i<tamanho;i++){
            vetor[i]= texto.charAt(i);
        }
        return vetor;
    }

 public static int boyerMoore(Character [] texto,Character [] padrao){
 int alfabeto[] =  new int[256];
 for(int k=0;k<256;k++){
     alfabeto[k]=-1;
 }
  for(int k=1;k<padrao.length;k++){
     alfabeto[padrao[k-1]]=k;
 }
  

   int ocorrencias=0;
   int k =padrao.length;
   while(k<=texto.length){
       int i=padrao.length ,j=k;
        while(i>=1 && padrao[i] == texto[j]){
            i--;j--;
          if(i<i){
              ocorrencias++;
          }  
          if(k==texto.length){
              break;
          }
          k=k+ padrao.length - alfabeto[padrao[k+1]] +1;
        }
        
  }
   return ocorrencias;
 }
    
    public static void main(String[] args) {
        // TODO code application logic here
         
    }
    
}
