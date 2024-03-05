package sec05;

public class ThrowExceptionSample {
	
	public static void main(String[] args) {
		//실행 역역에서 대신 에러 처리를 해줘야 함
		try {
			method1();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//에러처리를 직접해서 바로 사용가능
		method2();
	}
	
	//에러를 실행 영역으로 떠넘김
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
	
	
	//직접 에러처리
	public static void method2() {
		try {
			Class.forName("java.lang.Integer2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
