package sec09;

public class Car {

	//�ν��Ͻ� �ʵ�
	int speed;
	
	//�ν��Ͻ� �޼ҵ�
	 void run() {
		simulate();
	 }
	 
	//���� �޼ҵ�
	 static void  simulate() {
		 Car sp = new Car();
		 sp.speed = 200;
		 
		 System.out.println(sp.speed);
	 }
	 
}
