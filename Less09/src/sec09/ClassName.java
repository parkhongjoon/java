package sec09;

public class ClassName {

//인스턴스 멤버
	int field1;
	void method1() {}
	
//정적 멤버
	static int field2;
	static void method2() {}
	
	//정적블록
	static {
		// field1 = 10; //정적 블록에서 인스턴스 멤버를 사용하려고 해서 컴파일 에러
		// method1();	//정적 블록에서 인스턴스 멤버를 사용하려고 해서 컴파일 에러
		field2 = 10; //정적 블록에서 정적 멤버는 사용가능
		method2();
	}
	
	//정적메소드
	static void method3() {
		// this.field1 = 10; // 정적 메소드에서 인스턴스 멤버 this는 사용할수 없다.
		// this.method1(); // 
		field2 = 10; //정적 블록에서 정적 멤버는 사용가능
		method2();
	}
}
