package work_1006_01;

public class CarMain {

	public static void main(String[] args) {
		//1.클래스명 변수명(객체):객체선언
		//변수명(객체명)=new 클래스명();:초기화
		//2.클래스명 변수명(객체) = new 클래스명();
		//Scanner scan = new Scanner(System.in);
		//int n=scan.nextInt();
		Car tico = new Car(); // tico 객체
		Car pride = new Car(); // pride 객체
		
//		tico.color="화이트";
////		color="레드"; -- (x)
//		tico.company="대우";	
//		tico.type="경차";
//		pride.color="블랙";
//		pride.company="기아";
//		pride.type="소형";
//		
//		String color2=tico.color;
		
//		System.out.println(tico.color);
//		System.out.println(tico.company);
//		System.out.println(tico.type);
//		System.out.println(pride.color);
//		System.out.println(pride.company);
//		System.out.println(pride.type);
//		System.out.println(color2);
		
//		tico.go();
//		pride.go();
//		tico.back();
//		pride.back();
		
//		System.out.println(tico.color);
//		System.out.println(pride.color);
//		pride.color="레드";
//		System.out.println(pride.color);
//		System.out.println(tico.color);

		System.out.println(tico.company);
		System.out.println(pride.company);
		pride.company="삼성";
		System.out.println(pride.company);
		System.out.println(tico.company);
//		
		
		
	}

}
