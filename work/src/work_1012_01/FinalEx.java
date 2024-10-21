package work_1012_01;

public class FinalEx {

	public static void main(String[] args) {
		Final f = new Final();
		f.result();
//		f.number=200;
		f.result();
	}

}
class Final{
	final int number=100;  // final:상수
	void result() {
		System.out.println(number);
	}
}
