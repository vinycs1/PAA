/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3parte2;

/**
 *
 * @author Vinicius
 */
public class Lista3parte2 {
     public static int[] mergesort(int[]array,int [] array2, int [] array3){
        if(array.length<=1){
            return array;
        }
         //inicio
        int[] metade1= new int[array.length/2]; 
        int[] metade2= new int[array.length - metade1.length];
        
           //termino
        int[] metade3= new int[array.length/2];
        int[] metade4= new int[array.length - metade1.length];
        
        //atividades
        int[] metade5= new int[array.length/2];
        int[] metade6= new int[array.length - metade1.length];
        //inicio
        System.arraycopy(array, 0, metade1, 0,metade1.length);
        System.arraycopy(array,metade1.length,metade2,0,metade2.length);
        //termino
        System.arraycopy(array2, 0, metade3, 0,metade3.length);
        System.arraycopy(array2,metade3.length,metade4,0,metade4.length);
        //atividades
        System.arraycopy(array3, 0, metade5, 0,metade5.length);
        System.arraycopy(array3,metade5.length,metade6,0,metade6.length);
        
        mergesort(metade1,metade3,metade5);
        mergesort(metade2,metade4,metade6);
        
        
        merge(metade1,metade2,metade3,metade4,metade5,metade6,array,array2,array3);
        return array;
        
}
 
    public static void merge(int[] metade1, int[] metade2,int[]metade3,int[]metade4,int[]metade5,int[]metade6, int []resultado,int[] resultado2,int[] resultado3){
        int i =0;//metade1
        int j=0;//metade2
        int k=0;//resultado
        
        while(i<metade1.length && j<metade2.length){
            if(metade3[i]<metade4[j]){
            resultado[k] = metade1[i];
            resultado2[k] = metade3[i];
            resultado3[k] = metade5[i];
            i++;
            }else{
                resultado[k] = metade2[j];
                resultado2[k] = metade4[j];
                resultado3[k] = metade6[j];
                j++;
            }
            k++;
        }
        
        
        
       System.arraycopy(metade1,i,resultado,k,metade1.length-i);
       System.arraycopy(metade2,j,resultado,k,metade2.length - j);
         
       System.arraycopy(metade3,i,resultado2,k,metade3.length-i);
       System.arraycopy(metade4,j,resultado2,k,metade4.length - j);
       
       System.arraycopy(metade5,i,resultado3,k,metade5.length-i);
       System.arraycopy(metade6,j,resultado3,k,metade6.length - j);
       
       
        
    }
    
    public static int[] seleciona_atividades(int[] s, int[] f,int[] a){
        int [] resultado =  new int[a.length];
        resultado[0] = a[0];
         
        int i=1;
        for(int m=2;m<a.length;m++){
            if(s[m]>= f[i]){
                resultado[m] = a[m];
                i=m;
            }
        }
        for (int p=0;p<resultado.length;p++){
            System.out.print(" "+resultado[p]);
        }
        return resultado;
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int s[]={1,10,6,2};
        int f[]={5,13,7,4};
        int a[]={1,2,3,4};
        
        mergesort(s,f,a);
       
        
        seleciona_atividades(s,f,a);
        
        
    }
    
}
