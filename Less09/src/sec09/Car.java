package sec09;

public class Car {

	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	 void run() {
		simulate();
	 }
	 
	//정적 메소드
	 static void  simulate() {
		 Car sp = new Car();
		 sp.speed = 200;
		 
		 System.out.println(sp.speed);
	 }
	 
}
