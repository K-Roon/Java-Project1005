package work_1019_01;

public class work_01 {

	public static void main(String[] args) {
		// -(1/2)+(2/3)... -(9/10)
		int i = 1;
		float sum = 0;
		do {
			i++;
			if (i%2 == 1) sum -=((float)i/(i+1));	// 1/2=0
			else sum +=((float)i/(i+1));
			
		} while (i<9);
		System.out.println(sum);
	}

}
