package work_1006_01;

import java.util.Scanner;

public class fibonacci_numbers {

	public static void main(String[] args) {
		// 피보나치 수열
		// 1(a) 1(b) 2(c=a+b) 3 5 8 13 21 34 55 89 ....
		// 1    a    b        c
		// n번째 값
		// n번째 수열의 합		
		Scanner s = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n=s.nextInt();
		int a=1, b=1;
		int c=0;
		int sum=2;
		for(int i=3;i<=n;i++) {
			c=a+b;
			sum+=c;
//			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.printf("%d번째 값:%d\n",n,c);
		System.out.printf("%d번째까지 합:%d\n",n,sum);
	}
}
