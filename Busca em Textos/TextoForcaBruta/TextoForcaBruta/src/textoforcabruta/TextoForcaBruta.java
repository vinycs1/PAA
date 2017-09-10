/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoforcabruta;

/**
 *
 * @author Vinicius
 */
public class TextoForcaBruta {
    
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
    
    public static int busca_padrao(String texto, String padrao) {
       Character textoA[] = stringToArray(texto);
       Character padraoA[] = stringToArray(padrao);
       
      int tamanhoTexto = textoA.length;
      int tamanhoPadrao = padraoA.length;
      
      for (int i=0;i<tamanhoTexto-tamanhoPadrao;i++){
          int j=0;
          while((j<tamanhoPadrao) && (textoA[i+j]==padraoA[j])){
              j++;
          }
          if(j==tamanhoPadrao){
              System.out.println("achou");
              return i;
          }
           
      }
       System.out.println("não achou");
          return 0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       busca_padrao("kakakakakakakaaaaak","kakaka");
    }
    
}
