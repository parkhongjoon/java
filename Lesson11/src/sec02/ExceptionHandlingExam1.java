package sec02;

public class ExceptionHandlingExam1 {
	
	//메소드
	public static void printLength(String data) {
		try {
				int rs = data.length();
				System.out.println("문자 수 : " + rs);
				
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
	}

	public static void main(String[] args) {

		printLength("자바의 예외처리");
		System.out.println();
		printLength(null);
		System.out.println("프로그램이 종료되었습니다.");
	}

}
