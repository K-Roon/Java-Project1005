package work_1012_01;

public class work_01 {

	public static void main(String[] args) {
		// 1~100 정수
		// 3의 배수이면서 5의 배수인 수의 총합
		// 15,30,45,60,75,90
		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%3==0 && i%5==0) sum=sum+i;
//		}
//		System.out.println(sum);
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				if(i%5==0) {
					sum=sum+i;
				}
			} 
		}
		System.out.println(sum);
	}

}
