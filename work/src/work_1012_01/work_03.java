package work_1012_01;

import java.util.Scanner;

public class work_03 {

	public static void main(String[] args) {
		// n값을 입력받아 n~n+100사이의 홀수의 합
		 int sum=0;
		 System.out.printf("n값을 입력하세요 : ");
		 Scanner scan = new Scanner(System.in);
		 int n=scan.nextInt();
		 for(int i=n;i<=n+100;i++) {
			 if(i%2==1) {
				 sum+=i;
			 }				 
		 }
		 System.out.printf("홀수의 합:%d \n",sum);

	}

}
