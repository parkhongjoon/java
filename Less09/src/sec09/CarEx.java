package sec09;

public class CarEx {
		
		//�ν��Ͻ� �ʵ� ����
		int speed;
		
		//�ν��Ͻ� �޼ҵ� ����
		void run() {
			System.out.println(speed + "���� �޸��ϴ�.");
		}
		
		 static void  simulate() {
			 //��ü ����
			 Car myCar = new Car();
		 
		 //�ν��Ͻ� ��� ���
		 myCar.speed = 200;
		 myCar.run();
}
			 public static void main(String[] args) {

				 simulate();
				 
				 Car myCar =  new Car();
				 myCar.speed = 100;
				 myCar.run();
				 
//		Car c1 = new Car();
//		
//		c1.run();
		

	
	}

}
