package work_1019_01;

public class testing {
public static void main(String[] args) {
	String str = "ITISTESTSTRING";
    String[] result = str.split("T");
    for (int i = 0; i < result.length; i++) {
		System.out.print(result[i] + " ");
	}
    
}
}
