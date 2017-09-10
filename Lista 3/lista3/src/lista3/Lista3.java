/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Vinicius
 */

public class Lista3 {
    
    public static int[] mergesort(int[]array,int [] array2){
        if(array.length<=1){
            return array;
        }
         //PESO
        int[] metade1= new int[array.length/2]; 
        int[] metade2= new int[array.length - metade1.length];
        
           //VALOR
        int[] metade3= new int[array.length/2];
        int[] metade4= new int[array.length - metade1.length];
        //PESO
        System.arraycopy(array, 0, metade1, 0,metade1.length);
        System.arraycopy(array,metade1.length,metade2,0,metade2.length);
        //VALOR
        System.arraycopy(array2, 0, metade3, 0,metade3.length);
        System.arraycopy(array2,metade3.length,metade4,0,metade4.length);
        
        mergesort(metade1,metade3);
        mergesort(metade2,metade4);
        
        
        merge(metade1,metade2,metade3,metade4,array,array2);
        return array;
        
}
 
    public static void merge(int[] metade1, int[] metade2,int[]metade3,int[]metade4, int []resultado,int[] resultado2){
        int i =0;//metade1
        int j=0;//metade2
        int k=0;//resultado
        
        while(i<metade1.length && j<metade2.length){
            if((metade1[i]/metade3[i])<(metade2[j]/metade4[j])){
            resultado[k] = metade1[i];
            resultado2[k] = metade3[i];
            i++;
            }else{
                resultado[k] = metade2[j];
                resultado2[k] = metade4[j];
                j++;
            }
            k++;
        }
        
        
        
       System.arraycopy(metade1,i,resultado,k,metade1.length-i);
       System.arraycopy(metade2,j,resultado,k,metade2.length - j);
         
       System.arraycopy(metade3,i,resultado2,k,metade3.length-i);
       System.arraycopy(metade4,j,resultado2,k,metade4.length - j);
        
    }
    
    public static void mochilaFracionada(int []peso, int []valor,int totalmochila){
        int carga=0;
        int i=0;
        int n=peso.length;
        int pegosv[] = new int[n];
        int pegosp[] = new int[n];
        int temp;
        while((carga<totalmochila) && (i<=n)){
            if(peso[i] <= totalmochila-carga){
              
                pegosv[i] = valor[i];
                pegosp[i] = peso[i];
                carga = carga + peso[i];
               
                 
                
            } else{
               
                    temp = (totalmochila-carga);
                pegosp[i] =temp;
                pegosv[i] =(temp*valor[i])/peso[i];
                
                carga = carga +temp;
                
            
            }
            i++;
            
        }
        
        for(int k=0; k<pegosv.length;k++){
                  System.out.println("peso = " +pegosp[k]);
           System.out.println("valor = " +pegosv[k]);
        }
        
    }
    
    public static void main(String[] args) {
        
        
        int peso[]={30,20,10};
        int valor[]={120,100,60};
        
        mergesort(peso,valor);
       /* for(int k=0;k<peso.length;k++){
             System.out.println(peso[k]);
             System.out.println(valor[k]);
            
        }*/
        
         mochilaFracionada(peso,valor,40);
        // TODO code application logic here
    }
    
}
