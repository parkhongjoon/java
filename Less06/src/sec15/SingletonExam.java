package sec15;

public class SingletonExam {

	public static void main(String[] args) {

		//singleton ton1 = new Singleton(); Singleton이 private이기 떄문에 외부에서 생성 불가능
		//singleton ton2 = new Singleton();
		
		//정적메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
