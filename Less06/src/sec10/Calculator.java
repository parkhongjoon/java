package sec10;

public class Calculator {

	
//	필드와 메소드는 선언 방법에 따라 인스턴스 멤버 , 정적 멤버로 구분된다.
//
//
//	instance 멤버 - 객체소속된 멤버
//	static 멤버 - 클레스에 고정된 멤버

	//정적필드
	static double pi = 3.14159;
	
	//정적 메소드
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus(int x , int y) {
		return x - y;
	}
	
	//인스턴스 메소드
	int multiply(int x, int y) {
		return x * y;
	}
	
	
}
