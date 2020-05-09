package java_basis;

public class AccessModifier {
	// 접근 제한자에 관하여..
	//class 앞에 붙는 것은 접근 제한자라고 하는것이다.
	// 클래스에서 다른 클래스를 부를때나 메소드,변수에 대해 접근 권한을 주는 것이라고 생각하면된다.
	public AccessModifier() {}// AccessModifier class 생성자


	public void AccessModifier_public() {
		int a = 10; // 메소드 안에서만 사용 가능한 지역변수
		int b = 30;

		if(a==10) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("10이 아니에요");
		}

		System.out.println(a);


	}
	public static void main(String[] args) {
		AccessModifier a = new AccessModifier();
		a.AccessModifier_public();

	}


}

