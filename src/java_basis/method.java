package java_basis;

public class method {
	public method() { //생성자
		// TODO Auto-generated constructor stub
	}
	public void int_void(int b) {
		//바로 실행되는 메소드 //변수에 담아 사용할 필요가 없다.
		// 매개변수로 자료형이 int b 라는 변수로 활동 한다.
		int a = 20; // 지역 변수
		b += 10;
		System.out.println(b);
	}

	public int int_return(int b) {
		//리턴 메소드는 값을 돌려주는 역할을 한다.
		//
		// 즉 매개변수에 데이터가 담긴 형태로 되돌아 온다
		int a = 20; // 지역 변수

		b = a+10; // 여기서 변수 b 는 위에 있는 매개 변수와 동일

		return b;

	}

	public static void main(String[] args) {
		method ja = new method(); //위에 있는 클래스를 불러온다.

		ja.int_void(20);
		System.out.println("----------------------------------------");

		int a = ja.int_return(30);
		System.out.println(a);

	}

}
