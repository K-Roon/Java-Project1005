package work_1006_01;
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// 입력받은 7개 점수(정수)에서 최대, 최소 제외한 나머지 점수
		// 평균점수
		// 1, 3, 4, 6, 7, 8, 9
		int sum=0;
		int max, min;
		int num[]=new int[7];
		System.out.print("정수 7개를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<7;i++) {
			num[i]=scan.nextInt();
			sum+=num[i];
		}
		max=num[0];
		min=num[0];
		for(int j=1;j<7;j++) {
			if(max < num[j]) max=num[j];
			if(min > num[j]) min=num[j];
		}
		System.out.println(sum-max-min);
		System.out.println((sum-max-min)/5.0);		

	}

}
