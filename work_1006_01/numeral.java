package work_1006_01;

public class numeral {
	public static void main(String[] args) {
		// 진법 변환
		// 10진수 10을 2진수로 변환
		// 배열
		int a=10;
		int b=2;
		int mok, nmg;
		int res[]=new int[10];
		int i=0;
		for(;;) {
			mok=a/b;  // 5=10/2,
			nmg=a%b;  // 0=10%2,
			a=mok;
			res[i]=nmg;
			i++;
			if(mok==0) break;
		}
		for(int j=0;j<i;j++) {
			System.out.print(res[j]);
		}
		System.out.println();
		for(int j=i-1;j>=0;j--) {
			System.out.print(res[j]);
		}
	}

}
