package work_1012_01;

public class PolyEx {

	public static void main(String[] args) {
		//형변환 : 자동형변화, 강제형변환
//		int a=10;
//		double b=a;  // 자동형변환
//		System.out.println(b);
//		
//		double c=10.1;
//		int d=(int)c;  // 자동형변환
//		System.out.println(d);
		
//		Parent1 p = new Parent1();
//		p.walk();
//		p.run();
////		p.eat();
//		Child1 c = new Child1();
//		c.walk();
//		c.eat();
//		c.run();
		
		Parent1 p1 = new Child1();
		p1.walk();
		p1.run();
//		p1.eat();
	}

}
