package work_1019_01;

public class work_06 {

	public static void main(String[] args) {
		
		int[][] a = new int [5][5];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < 5; j++) {
				sum++;
				a[i][j] = sum;
				
			}
		}
			
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[i][j]);
			}System.out.println();
		}
	}

}
