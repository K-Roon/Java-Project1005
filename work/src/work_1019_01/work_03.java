package work_1019_01;

public class work_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,3,5,7,9};
		int[] B = {2,4,8,12,16};
		int[] C = new int[A.length + B.length];
		
		for (int i = 0; i < A.length; i++) {
			C[i]=A[i];
		}
		for (int j=0;j<B.length;j++) {
			C[A.length+j]=B[j];
		}
		for (int k = 0; k < C.length; k++) {
			System.out.print(C[k] + " ");
		}
		
		for (int i = 0; i <C.length-1; i++) {
			for (int j=0;j < C.length -1-i;j++) {
				if(C[j] > C[j+1]) {
					int temp = C[j];
					C[j]=C[j+1];
					C[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("오름차순(버블정렬): ");
		for(int k = 0; k < C.length; k++) {
			System.out.print(C[k]+" ");
		}
	}

}
