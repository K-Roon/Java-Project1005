package work_1012_01;

public class Child extends Parent{
	int number=2;
	Child(){
		System.out.println("자식객체생성");
	}
	void print() {
//		int number=1;
		System.out.println(number);
		System.out.println(this.number);
		// this=자식(필드)
		System.out.println(super.number);
		// super=부모(필드)
	}
}
