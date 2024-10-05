package work;

public class work_02 {
	public static void main(String[] args) {
//		System.out.println("Hi!!");
//		int a;
//		a=10;
//		double b=10.1;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println("a="+a+", b="+b);
		
//		int a=10;
//		int b=a+10;
//		System.out.println(a);
//		System.out.println(b);
		
//		int a=10;
////	int b =10.1;
//		int b=(int)10.6;
//		double c=12.3;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(a+b);
//		System.out.println(a+c);
		
//		char a='A';
//		System.out.println(a);
////	char b="B";   // '':단일문자(char), "":문자열(String)
////	System.out.println(b);
//		String c="ABCD";
//		System.out.println(c);
////	String d='A'; // '':단일문자(char), "":문자열(String)
////	System.out.println(d);
//		System.out.println("abcd1234가나다라!?,.");
//		System.out.println("ab\"cd\"12\\34%\n가나\t다라!?,.");		

		// ++, --, +=, -+, *=, /+....
//		int a=10;
//		System.out.println("a:" + a);
//		System.out.println("a++:" + a++);
//		System.out.println("++a:" + ++a);
//		int b=3;
//		System.out.println(a/b);
//		System.out.println(a%b);
//		System.out.println((double)(a/b));
//		System.out.println((double)a/b);
//		System.out.println(a/(double)b);
//		double c=3.0;
//		int d=11;
//		System.out.println(d/c);
//		System.out.println(d%c);
		
//		String str="ABCD";
//		System.out.println(str);
//		System.out.println(str+str);
//		System.out.println(str+str+str);
//		System.out.println(str+str+str+12);
//		System.out.println(str+str+str+12+"34");
//		System.out.println(str+str+"\n"+str+12+"34");
		
//		boolean a=true;
//		boolean b=false;
//		System.out.println(a);
//		System.out.println(b);
		
		//삼항연산
		//조건식?값1(연산식):값2(연산식2)
		//A?B:C
		//A가 참이면 B, 거짓이면 C
		//80이상이면 합격, 미만이면 불합격
//		int score=75;
//		String pass=score>=80?"합격":"불합격";
//		System.out.println(pass);
//		System.out.println(score>=80?"합격":"불합격");
		
		// 6세이상 탑승가능
    	// 키 120 이상 탑승가능
		// 6세 미만이지만 키가 120 이상이면서 보호자 동반하에 탑승 가능
		// 심장관련 질환자 탑승 불가
		// 나이 age, 키 height, 보호자 동반여부 parent
		// 심장질환여부 hearchDease
		// &&, ||
//		int age=10;
//		int height=110;
//		boolean parent=false;
//		boolean hearchDease=false;
//		boolean take;
//		take=
//		((age>=6 && height>=120)
//		||(height>=120 && parent==true)) 
//		&& hearchDease==false;
////		(age>=6 && height>=120 && hearchDease==false)
////		||(age<6 && height>=120 && parent==true 
////		   && hearchDease==false);
//		System.out.println(take);
		
		// 제어문 : 조건문, 반복문
		// 조건문 : if, 중첩if, switch~case
		// 반복문 : for, while, do~while, 중첩반복문, 무한반복문
		// break, continue
		
		// if문
		// if(조건식){
		//		실행문; 조건식이 참일때 실행
		// }
		//
//		int score=75;
//		if(score>=80) {
//			System.out.println("합격");
////		System.out.println("수고하셨습니다.!!");
//		}
//		else {
//			System.out.println("불합격");
////		System.out.println("수고하셨습니다.!!");
//		}
//		System.out.println("수고하셨습니다.!!");
		
//		int score=85;
//		if(score>=80) System.out.println("합격");
//		else System.out.println("불합격");
//		System.out.println("수고하셨습니다.!!");
		
		// 90이상 A, 80이상 B, 70이상 C, 나머지 F
		int score =65;
		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else System.out.println("F");		
		
	}

}
