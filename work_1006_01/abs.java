package work_1006_01;

public class abs {

	public static void main(String[] args) {
		// abs  => Math.abs
//		System.out.println(3.14);
//		System.out.println(-3.14);
//		int a=10, b=-10;
//		System.out.printf("Math.abs(a):%d\n",Math.abs(a));
//		System.out.printf("Math.abs(b):%d\n",Math.abs(b));
//		System.out.printf("Math.abs(3.14):%.2f\n",Math.abs(3.14));
//		System.out.printf("Math.abs(-3.14):%.2f\n",Math.abs(-3.14));

		// 가장 가까운 숫자 찾기
		// 1,3,7,9 => 4와 가장 가까운 수 찾기
		int c[]= {1,3,7,9};
		int d=4;
		int idx=0;
		int sel=Math.abs(c[0]-d);
		for(int i=1;i<4;i++) {
			if(sel > Math.abs(c[i]-d)) {
				sel=Math.abs(c[i]-d);
				idx=i;
			}
		}
		System.out.printf("%d와 가장 가까운 수 : %d\n",d,c[idx]);
	}

}
