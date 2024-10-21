package work_1012_01;

public class Overloading {

	public static void main(String[] args) {
		Operator op = new Operator();
		System.out.println(op.add(1,2));
		System.out.println(op.add(1));
		System.out.println(op.add(1.1,2.2));
		System.out.println(op.add(1.1,2));
		System.out.println(op.add(1,2.2));
		System.out.println(op.add());
	}
}
class Operator{
	int add(int x, int y) {
		return x+y;
	}
	int add(int x) {
		return x;
	}
	double add(double x, double y) {
		return x+y;
	}
	double add(double x, int y) {
		return x+y;
	}
	double add(int x, double y) {
		return x+y;
	}
	String add() {
		return "홍길동";
	}
	
	
	
	
	
	
	
}
