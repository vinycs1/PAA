
package lsc;

/**
 *
 * @author Vinicius
 */
public class Lsc {

    public static void maiorsub(Character []X, Character []Y){
        int c[][] = new int[X.length+1][Y.length+1];
        int b[][] = new int[X.length+1][Y.length+1];
        
        for(int i=0;i<=X.length;i++){
            c[i][0]=0;
        }
        for(int j=0;j<=Y.length;j++){
            c[0][j]=0;
        }
        
        for(int i=1;i<=X.length;i++){
            for(int j=1;j<=Y.length;j++){
                if(X[i-1]==Y[j-1]){
                    c[i][j] = c[i-1][j-1] +1;
                    b[i][j] = 0; // diagonal
                }else if(c[i-1][j]>=c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = 1; //cima
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = 2; // esquerda
                }
            }
        }
        
       /* for(int i=0;i<=X.length;i++){
            for(int j=0;j<=Y.length;j++){
                System.out.print(c[i][j]);
               
            }
            System.out.println();
        }
        
       */
        printlsc(b,X,X.length,Y.length);
        
    }
    
    public static int printlsc(int [][]b,Character[] X,int i, int j){
        if(i==0 || j==0){
            return 0;
        }
        if(b[i][j]==0){ //diagonal
            printlsc(b,X,i-1,j-1);
            System.out.print(X[i-1]);
        }else if(b[i][j]==1){//cima
            printlsc(b,X,i-1,j);
            
        }else{
            printlsc(b,X,i,j-1);
        }
       
        return 0;
    }
    
    public static Character[] toArray( String s ) {

   if ( s == null ) {
     return null;
   }

   int len = s.length();
   Character[] array = new Character[len];
   for (int i = 0; i < len ; i++) {
      array[i] = s.charAt(i);
   }

   return array;
}
    public static void main(String[] args) {
        Character X[] = toArray("ACCGTGGAAAAGGTTAAGGCCAGGATTTAACCGCGGGC");
        Character Y[] = toArray("ATCGCGGTTTAATCCGGATAGGTTGAAATGGTTGAAACA");
        
        
        maiorsub(X,Y);
    }
    
}
