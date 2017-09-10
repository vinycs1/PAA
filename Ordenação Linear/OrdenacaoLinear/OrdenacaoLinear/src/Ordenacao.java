
public class Ordenacao {
	
	

	public int[] countingSort(int[] A, int maior){
		
		int i,j;
		int B[] = new int[A.length];
		int C[]= new int[maior];
		for(i=0;i<maior;i++){
			C[i]=0;
		}
		for(j=1;j<A.length +1;j++){
			C[A[j-1]]= C[A[j-1]] +1;
		}
		for(i=1;i<maior+1;i++){
			C[i] =C[i] + C[i-1];
		}
		for(j=0;j<A.length;j++){
			B[C[A[j]]-1] = A[j];
			C[A[j]]= C[A[j]-1];
		}
		
		
		
		return B;
	}

}
