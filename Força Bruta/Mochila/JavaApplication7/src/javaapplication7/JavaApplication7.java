/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author vinyc
 */
public class JavaApplication7 {

   public static void teste(int n) { //n -> quantidade de objetos

		int linhas = (int) Math.pow(2, n);
		int v1[][] = new int[linhas][n]; //matriz com a ombinação de pesos
                int v2[][] = new int[linhas][n];//matriz com a ombinação de valores
                int peso[]={7,3,4,5}; //vetor com pesos
                int valor[]={42,12,40,25}; //vetor com valores
                int soma[]= new int[linhas]; //soma das combinações de pesos
                int soma2[]= new int[linhas];//soma das combinações de valores
                
                int capacidade=10; //capacidade da mochia
                
                for (int i = 0; i < linhas; i++) {   //preenche as duas matrizes com zeros
			for (int j = 0; j < n; j++) {
				v1[i][j]=0;
                                v2[i][j]=0;
			}	
		}

                // Gera todas as possíveis combinações(exercicio 6-lista 1)
		for (int j = 0; j < n; j++) {
			for (int i = (int) Math.pow(2, j); i < linhas; i += (int) Math.pow(2, j + 1)) {
				for (int k = 0; k < (int) Math.pow(2, j); k++) {
					v1[i + k][n - 1 - j] = 1;
                                        v2[i + k][n - 1 - j] = 1;
                               }
			}
		}
                /* Cada linha representa um objeto, assim cada matriz é preenchida com pesos e 
                valores respectivamente, gerando todas as possiveis combinaçoes
                de pesos e valores */
                for(int i=0;i<n;i++){
                     for(int j=0;j<(int) Math.pow(2,n);j++){
                             if(v1[j][i]==1){
                             v1[j][i]=peso[i];
                            }
                             if(v2[j][i]==1){
                             v2[j][i]=valor[i];
                            }
                        }
                  }
                
                //soma as linhas da matriz
                 for(int j=0;j<linhas;j++){
                     int total=0;
                     int totalvalor=0;
                        for(int i=0;i<n;i++){
                            total=total +v1[j][i];
                            totalvalor= totalvalor +v2[j][i];
                        }
                       soma[j]=total;// somas das combinações de pesos
                       soma2[j]=totalvalor;//soma das combinações de valores
                   }
                 
                 
                
                 int escolha=soma[0]; 
                 int escolhavalor=soma2[0];
                 int ind=0;
                 // Escolhe a melhor combinação para o problema
                 for(int i=1;i<linhas;i++){
                     if(soma[i]>=escolha && soma[i]<=capacidade && soma2[i]>=escolhavalor){
                         escolha=soma[i];
                         escolhavalor=soma2[i];
                         ind=i;
                     }
                 }
                 
                 System.out.println("Peso total: "+escolha);
                 System.out.println("Valor total: "+escolhavalor);
                 System.out.println();
                 
                 for(int i=0;i<n;i++){
                     System.out.print(+v1[ind][i]+" ");
                     
                 }
               
                 System.out.println();
                
                 
		/*for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", v1[i][j]);
			}
			System.out.println();
		}
                
                 System.out.println();
                  System.out.println("VALORES");
                for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", v2[i][j]);
			}
			System.out.println();
		}*/

	}
    public static void main(String[] args) {
        // TODO code application logic here
        teste(4);
    }
    
}
