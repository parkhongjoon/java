package sec09;

public class CarEX02 {
//  Car Ŭ���� ������ 
//  �ν��Ͻ� �ʵ� speed
//  �ν��Ͻ� �޼ҵ� run()
//  �ν��Ͻ� �޼ҵ�run() 
//  �� run() �޼ҵ�� speed + "���� �޸��ϴ�." ��� ��µǴ� �޼ҵ��̴�
//   
//  �����޼ҵ� simulate������� simulate����
//  speed �� 200���� �ʱ�ȭ ���� run ()���Ѷ�
//  
  
  
  // �ν��Ͻ� �ʵ� ����
  int speed;
  //�ν��Ͻ� �޼ҵ� ����
    void run () {
    System.out.println(speed + "���� �޸��ϴ�.");
    }
   
    static void simulate() {
       //��ü����
       Car myCar = new Car();
       
       //�ν��Ͻ� ���
       myCar.speed = 200;
       myCar.run();
    }

	 public static void main(String[] args) {

	      simulate();
	      
	      Car myCar = new Car();
	      myCar.speed = 50;
	      myCar.run();

		 
	 }
}
