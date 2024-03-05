package sec09;

public class Television {

	//정적 멤버 안에서 인스턴스 멤버는 사용할수없다.
	
	//인스터스 필드
	int pay = 20000000;
	String color;
	
	//정적필드
	static String company = "LG"; //정적필드는 일반적으로 바로 초기화를 한다.
	static String model = "OLED";
	static String info; //정적블록을 선언하는 방법
	static {  
		info = company + "-" + model;
	}

	void method1(int getPay) {   // 인스턴스 메소드
		this.pay = getPay;
		this.color = "빨강";
		System.out.println(this.pay + ", " + this.color + info);
	}
	
	static void method2() {    // 정적 메소드
		System.out.println(info); // 인스턴스 메소드는 객체가 생성되야만 사용가능 하기때문에 정적 메소드에서 사용불가
								  // System.out.println(info+this.pay); 사용불가
	}
}
