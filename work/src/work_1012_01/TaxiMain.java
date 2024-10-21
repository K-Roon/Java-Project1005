package work_1012_01;

public class TaxiMain {

	public static void main(String[] args) {
		Car c = new Car();
		Taxi t = new Taxi();
		c.color="흰색";
		t.color="검정";
		System.out.println(c.color);
		System.out.println(t.color);
		c.go();
		t.go();
		
	}

}
