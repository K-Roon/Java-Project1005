package work_1006_01;

public class CarMain2 {

	public static void main(String[] args) {
		// 배열 객체로 생성
//		Car cars = new Car();
		Car[] cars = new Car[3];
		
		Car tico=new Car();
		tico.color="화이트";
		tico.company="대우";	
		tico.type="경차";
		
//		System.out.println(tico.length);
		System.out.println(cars.length);		

		for(int i=0;i<cars.length;i++) {
			cars[i]=tico;
		}
		System.out.println(tico.color);
		System.out.println(cars[0].color);
		System.out.println(cars[1].color);
		System.out.println(cars[2].color);
		cars[0].color="블랙";
		System.out.println(tico.color);
		System.out.println(cars[0].color);
		System.out.println(cars[1].color);
		System.out.println(cars[2].color);

	}

}
