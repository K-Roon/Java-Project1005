package work_1006_01;
import java.util.Scanner;
//import java.util.Scanner;

public class work_01 {
	public static void main(String[] args) {
		// 90이상 A, 80이상 B, 70이상 C, 나머지 F
//		int score =65;
//		if(score>=90) System.out.println("A");
//		else if(score>=80) System.out.println("B");
//		else if(score>=70) System.out.println("C");
//		else System.out.println("F");
		
//		System.out.println("점수를 입력하세요 : ");
		// print, printf, println
//		System.out.print("점수를 입력하세요 : ");
//		Scanner scan = new Scanner(System.in);
//		// ctrl+shift+o : import 단축키
//		
//		int score = scan.nextInt();
//		if(score>=90) System.out.println("A");
//		else if(score>=80) System.out.println("B");
//		else if(score>=70) System.out.println("C");
//		else System.out.println("F");
		
		// 입력 받은 영어, 수학 점수가 둘다 90점 이상이면 통과
		// 하나라도 90미만이면 재시험
		// if, "통과","재시험" 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("영어점수를 입력하세요 : ");
//		int eng=scan.nextInt();
//		System.out.print("수학점수를 입력하세요 : ");
//		int mat=scan.nextInt();
//		if(eng>=90 && mat>=90) System.out.println("통과");
//		else System.out.println("재시험");
//		if(eng>=90) {
//			if(mat>=90) System.out.println("통과");
//			else System.out.println("재시험");
//		} 
//		else System.out.println("재시험");	
		
		
		// 입력 받은 영어, 수학 점수중 둘중에 하나라도 90점 이상이면 통과
		// 둘다 90미만이면 재시험
		// if, "통과","재시험" 출력
		
//		if(eng>=90) {
////			if(mat>=90) System.out.println("통과");
////			else System.out.println("통과");
//			System.out.println("통과");
//		} 
//		else {
//			if(mat>=90) System.out.println("통과");
//			else System.out.println("재시험");
//		} 
		
//		if(eng>=90 || mat>=90) System.out.println("통과");
//		else System.out.println("재시험");
		
//		// 배열
////		int data[5]= {1,2,3,4,5};   -- c언어
////		int data[]= {1,2,3,4,5};    -- c언어
//		int data[]= {1,2,3,4,5};	// 선언시 초기화1
//		int[] data1= {1,2,3,4,5}; 	// 선언시 초기화2
//		System.out.println(data[0]);
//		System.out.println(data1[0]);
//		int data2[];	// 배열선언1
//		int[] data3;	// 배열선언2
//		data2=new int[] {1,2,3,4,5}; // 배열선언후 대입
//		data3=new int[] {1,2,3,4,5}; // 배열선언후 대입
//		System.out.println(data2[0]);
//		System.out.println(data3[0]);
		
		// 구구단 
		// 원하는 단 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("원하는 단을 입력하세요 : ");
//		int dan=scan.nextInt();
//		for(int i=1;i<=9;i++) {
////			System.out.println(dan+"*"+i+"="+ dan*i);
//			System.out.printf("%d*%d=%d\n",dan,i,dan*i);			
//		}		
		
		// 선택정렬(최소값정렬), 오름차순 정렬
		// 5개 정수를 입력받아 배열에 저장
		// {3,5,1,4,2};
		// 결과 : 1 2 3 4 5
		// 정렬 : 이중 for문, if문
		// 출력 : for문 
		int data[]=new int[5];
		System.out.print("정수 5개를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data[i]=scan.nextInt();
		}
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(data[i] > data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}			
		}
		
		
		
		for(int k=0;k<5;k++) {
//			System.out.print(data[k]);
			System.out.print(data[k]+" ");
//			System.out.printf(data[k]+" ");
//			System.out.printf("%d ",data[k]);
//			System.out.print("%d ",data[k]);  // (x)
//			System.out.println("%d ",data[k]);  // (x)
//			System.out.println(data[k]+" ");
		}
		
		
		
		
		
	}

}
