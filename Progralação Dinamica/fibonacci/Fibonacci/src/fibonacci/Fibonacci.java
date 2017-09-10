/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Vinicius
 */
public class Fibonacci {

   public static int somaFibonacci(int n){
       int v[] =new int[n];
       int k = 0;
      
        if(n<2){
            
            return n;
        } else {
            v[0]=0;
            v[1]=1;
            for(int i=2;i<n;i++){
                
                v[i]= v[i-1] + v[i-2];
                k=i;
             
            }
          
            return v[k];
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       int soma= somaFibonacci(25);
       System.out.println("SOMA "+soma);
    }
    
}
