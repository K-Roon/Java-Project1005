package work_1006_01;

import java.util.Scanner;

public class factoria {

	public static void main(String[] args) {
		// 1!+2!+3!+4!+....10!
		// 5!=1*2*3*4*5
		int res=1;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
//			res=res*i;
			res*=i;
			sum+=res;
		}
		System.out.printf("%d!=%d \n",n,res);
		System.out.printf("1!+2!+...+%d!=%d \n",n,sum);

	}

}
