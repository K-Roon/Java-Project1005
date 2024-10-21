package work_1012_01;

public class MethodOrder {

	public static void main(String[] args) {
		MethodEx me = new MethodEx();
//		me.one();
//		one();
		MethodEx.one(); // static:객체생성없이 클래스명으로 실행
		
	}
}
class MethodEx{
	static void one() { // static:객체생성없이 클래스명으로 실행
		two();
		System.out.println("one");
	}
	static void two() {
//		three();
		System.out.println("two");
	}
	void three() {
		System.out.println("three");
	}
}
