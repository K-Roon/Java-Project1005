package work_1012_01;

public class work_02 {

	public static void main(String[] args) {
		// 100~500사이 자연수 중 
		// 홀수의 합
		// 짝수의 합
		// 10의 배수의 합	
		int sum1=0,sum2=0,sum3=0;
		for(int i=100;i<=500;i++) {   // i++ = i=i+1 = i+=1
			if(i%2==1) sum1+=i; // 홀수의 합
			if(i%2!=1) sum2+=i; // 짝수의 합
//			if(i%2==0) sum2+=i; // 짝수의 합
		}
		for(int i=100;i<=500;i+=10) {
			sum3+=i;  
		}
		System.out.printf("홀수의 합:%d \n", sum1);
		System.out.printf("짝수의 합:%d \n", sum2);
		System.out.printf("10의 배수의 합:%d \n", sum3);

	}

}
