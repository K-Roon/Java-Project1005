package work_1012_01;

public class ParamEx {

	public static void main(String[] args) {
		// 메서드 구조
		// public(접근제한자) void(리턴타입) go(메서드명)(매개변수){
		//		실행문.....;
		//		(return 값(연산식, 변수, 문자, 문자열....))
		//	}
		Param p = new Param();
		int res1=p.add1(10,20);
		System.out.println(res1);
		double res2=p.add2(10.1,20.1);
		System.out.println(res2);
		int res3=p.add3(1,3,5,7,9);
		System.out.println(res3);

	}
}

class Param{
	int add1(int x, int y) {
		int z1=x+y;
		System.out.println(z1);
		System.out.println(x+y);
		return z1; // return x+y;		
	}
	double add2(double x, double y) {
		double z2=x+y;
		System.out.println(z2);
		System.out.println(x+y);
		return z2; // return x+y;		
	}
	int add3(int ...x) {  // x[]....// int x, int y...
		int z3=0;
		for(int i=0;i<x.length;i++) {
			z3+=x[i];
		}
		System.out.println(z3);
		return z3; // return x+y;		
	}
	
	
}











