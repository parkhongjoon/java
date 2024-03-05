package Exam132.package2;

import Exam132.package1.A;

public class C {
	//메소드를 만들어 불러옴
	public void methodB() {
		//A 클래스의 객체를 만듬
		A a = new A();
		
		//a의 필드를 변경
		a.field1 = 11; // public 필드는 이 클래스에서 변경가능
//		a.field2 = 21; // default 필드는 같은 클래스이므로 변경 가능
//		a.field3 = 31; private 필드는 외부 클래스에서 변경이 불가능
		
		//메소드 호출
		a.method1();
		//a.method2(); default 필드는 다른 패키지 이므로 변경 가능
		//a.method3(); private 메소드는 외부 클래스에서 변경이 불가능
	}
}
