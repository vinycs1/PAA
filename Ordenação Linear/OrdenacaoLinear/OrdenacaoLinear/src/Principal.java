
public class Principal {

	public static int[] countingSort(int[] A, int maior){
		
		int i,j;
		int B[] = new int[A.length+1];
		int C[]= new int[maior + 1];
		
		for(i=0;i<maior;i++){
			C[i]=0;
		}
		for(j=1;j<A.length;j++){
			C[A[j-1]]= C[A[j-1]] +1;
		}
		for(i=1;i<maior+1;i++){
			C[i] =C[i] + C[i-1];
		}
		for(j=0;j<A.length;j++){
			B[C[A[j]]-1] = A[j];
			C[A[j]]= C[A[j]]-1;
		}
		
		for(j=0;j<A.length;j++){
			System.out.println(B[j]);
		}
		
		
		return B;
	}
	
	public static int[] radixSort(int []V){
		int i,j;
		int c=4;//numero de casas
		int k=9;// maior digito
		int M[][]= new int[V.length+1][4];
		int U[]= new int [V.length+1];
		int D[]= new int [V.length+1];
		int C[]= new int [V.length+1];
		int CM[]= new int [V.length+1];
		
		for(i=0;i<V.length;i++){
			M[i][3] = V[i]/10;
			M[i][2] = (V[i]%1000)/100;
			M[i][1] = (V[i]%100)/10;
			M[i][0] = V[i]%10;
		}
		
		if(c==4){
			for(i=0;i<V.length;i++)
				U[i]=V[i]%10;
			U= countingSort(U,k+1);
			c--;
			
		}
		if(c==3){
			for(i=0;i<V.length;i++)
				D[i]= (V[i]%100)/10;
			D=countingSort(D,k+1);
		c--;
		}
		if(c==2){
			for(i=0;i<V.length;i++)
				C[i]=(V[i]%1000)/100;
				C=countingSort(C,k+1);
				c--;
		}
		if(c==1){
			for(i=0;i<V.length;i++)
				CM[i]=V[i]/1000;
			CM=countingSort(CM,k+1);
			c--;
		}
			
		for(i=0;i<V.length;i++){
			V[i]=1000*CM[i] + 100*C[i] + 10*D[i] + U[i];
		}
		
		return V;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet1[] = {16, 3, 77, 79, 64, 42, 27, 68, 94, 83, 10,
				8, 82, 98, 96, 6, 83, 100, 53, 15, 79, 11, 61, 74, 65, 23,
				46, 97, 50, 49, 19, 81, 93, 43, 42, 33, 2, 61, 95, 95, 78,
				37, 23, 89, 67, 3, 53, 86, 2, 39, 100, 13, 65, 45, 70, 26,
				22, 56, 0, 37, 96, 79, 17, 10, 92, 89, 28, 22, 58, 7, 94,
				48, 91, 53, 82, 15, 34, 41, 31, 36, 29, 58, 50, 9, 79, 72,
				99, 61, 53, 28, 92, 39, 42, 0, 94, 100, 1, 85, 93, 63};
		
		double vet3[] = {0.89, 0.33, 0.29, 0.43, 0.25, 0.18, 0.38,
				0.98, 0.47, 0.88, 0.70, 0.28, 0.94, 0.52, 0.68, 0.91,
				0.74, 0.48, 0.98, 0.80, 0.68, 0.57, 0.92, 0.35, 0.96,
				0.39, 0.45, 0.53, 0.00, 0.49, 0.18, 0.36, 0.17, 0.75,
				0.69, 0.68, 0.86, 0.61, 0.91, 0.91, 0.64, 0.18, 0.49,
				0.06, 0.20, 0.01, 0.46, 0.66, 0.33, 0.48, 0.08, 0.26,
				0.35, 0.92, 0.06, 0.96, 0.20, 0.63, 0.42, 0.70, 0.60,
				0.06, 0.57, 0.76, 0.49, 0.46, 0.33, 0.09, 0.83, 0.30,
				0.67, 0.66, 0.00, 0.42, 0.34, 0.45, 0.84, 0.89, 0.84,
				0.12, 0.17, 0.21, 0.43, 0.16, 0.93, 0.12, 0.13, 0.83,
				0.18, 0.96, 0.65, 0.59, 0.36, 0.03, 0.12, 0.05, 0.05,
				0.56, 0.10, 0.51};
		
		int vet2[] = {3239, 6017, 5273, 4783, 3852, 4601, 8686,
				8461, 5336, 9559, 6441, 7488, 6429, 2379, 8420, 6897,
				1170, 1637, 3251, 2724, 8543, 8575, 1284, 5531, 7812,
				6587, 3229, 4359, 3082, 1554, 4664, 3502, 3016, 7260,
				5678, 4524, 5682, 8336, 7723, 9947, 2892, 4728, 4956,
				5953, 6331, 1566, 3199, 4218, 2812, 1577, 6022, 4994,
				2328, 8857, 5044, 1246, 3796, 5917, 5809, 6639, 7119,
				6257, 6532, 2136, 7359, 5510, 1519, 6925, 7001, 7352,
				6544, 5987, 9115, 2114, 9900, 5854, 5478, 1525, 4137,
				6128, 1597, 5336, 7337, 3335, 2744, 9357, 4515, 4298,
				8036, 4307, 6862, 5206, 2931, 2198, 3974, 5134, 9849,
				4493, 2255, 1602};
		
		radixSort(vet2);
	}

}
