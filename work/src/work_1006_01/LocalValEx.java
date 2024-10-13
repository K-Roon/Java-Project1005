package work_1006_01;

public class LocalValEx {

	public static void main(String[] args) {
		Local local = new Local();
		System.out.println(local.name);
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		Return obj = new Return();
		String name = obj.getName();
		System.out.println(name);
		System.out.println(obj.getName());	

	}

}

class Return{
	String getName() {
		return "홍길동2";
	}
}
class Local{
	String name="홍길동";
	void process() {
		String name="홍길동1";
		System.out.println(name);
	}
	void printAge1() {
		int age=10;
		System.out.println(age);
	}
	void printAge2() {
		int age=20;
		System.out.println(age);
	}
}





