package work_1019_01;

public class work_04 {

	public static void main(String[] args) {
		int n = 1;
		int a[][] = new int [5][5];
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
				a[i][j] = n;
				n++;
			}
		}
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
			
		}
	}

}
