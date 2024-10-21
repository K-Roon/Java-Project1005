package work_1012_01;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("홍길동",1,"경영학");
//		s.name="홍길동";
//		s.grade=1;
//		s.department="경영학";
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.department);
	}
}

class Student{
	String name;
	int grade;
	String department;
	// 생성자
	// 클래스명(매개변수...){
	//	 초기화 실행문 (객체생성시 초기화)
	//	.....
	//	}
	Student(String n, int g, String d){
		name=n;
		grade=g;
		department=d;
	}	
	Student(){
	}
	
	
}
