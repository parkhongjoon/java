package sec05;

public class CarEx {

	public static void main(String[] args) {

		//Car ��ü ����
		Car myCar = new Car(); 
		
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�õ����� : " + myCar.start);
		System.out.println("����ӵ� : " + myCar.speed);
		
		//Car ��ü�� �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ��� " + myCar.speed);
	}

}
