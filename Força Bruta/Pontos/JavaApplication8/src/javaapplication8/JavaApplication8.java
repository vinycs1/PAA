/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author vinyc
 */
public class JavaApplication8 {

    public static double distancia(double a, double b, double c, double d){ //distancia Euclidiana entre dois pontos
        // a e b são respectivamente x e y do primeiro ponto
        // c e d são respectivamente x e y do segundo ponto
        double x=(double) Math.pow((c-a),2);
        double z=(double) Math.pow((d-b),2);
        double distancia=(double) Math.sqrt(x+z);
        return distancia;
    }
    
    public static void test(double []X, double []Y,int n){
        
        double dis[]= new double[100];
        double d=999999;
        int k=0,l=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(distancia(X[i],Y[i],X[j],Y[j])<d){
                    d=distancia(X[i],Y[i],X[j],Y[j]);
                    k=i;
                    l=j;
                }
            }
         }
     
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(distancia(X[i],Y[i],X[j],Y[j])==d){
                    System.out.println(d);
                    System.out.println("Ponto: "+X[i]+" "+Y[i]);
                    System.out.println("Ponto: "+X[j]+" "+Y[j]);
                   
                   
                }
            }
         }
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double a= distancia(1,1,2,2);
        //System.out.println(a);
        double X[]={1,-1,60,70,80,90,100,2,3,0};
        double Y[]={1,-1,60,70,80,90,100,2,3,0};
       
        test(X,Y,10);
    }
    
}
