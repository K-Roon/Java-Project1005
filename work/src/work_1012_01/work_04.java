package work_1012_01;

public class work_04 {

	public static void main(String[] args) {
		// 소인수분해
		// 10=2*5, 8=2*2*2, 12=2*2*3
		// 입력받은 n을 소인수 분해
		// 12 : 2*2*3
		int a[]=new int[20];
		int n=12;
		int k=2;  // 나누는값
		int j=0;
		for(int i=0;i<20;i++) {
			if(n==1) break;
			else if(n%k!=0) k++;
			else if(n%k==0) {
				a[j]=k;
				n=n/k; // n/=k;
				j++;
			}				
		}
		for(int l=0;l<j;l++) {
			System.out.printf("%d",a[l]);
			if(l==j-1) break;
			System.out.printf("*");
			
		}
		
		

	}

}
