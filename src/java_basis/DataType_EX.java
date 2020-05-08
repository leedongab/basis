package java_basis;

public class DataType_EX {
	static int A = 10; // A변수의 데이터 값은 10 (연산가능)
	int A1 = 10; // A변수의 데이터 값은 10 (연산가능) main 생성자에서 사용 할려면
	static String B ="10"; // B변수의 데이터 값은 10(연산 불가능)형변환을 해야 연산 가능) "" 로 선언 해야한다.
	static boolean C = true; // C의 데이터 값은 참, 증명할 경우 많이 쓰이는 자료형
	//static 메모리 할당된다.
	public static void main(String[] args) {
		System.out.println(A+10); //값20
		System.out.println(A+10); //값20
		System.out.println(A-10);
		System.out.println(A/10);
		System.out.println(A*10);
		System.out.println(B+10); //1010 연산 불가능
		System.out.println(C);
	}

}
