package sec06.exam04;

public class CarEx {
	public static void main(String[] args) {
		
		//Car ��ü ����
		Car myCar = new Car();
		
		//Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run();
		
		//�ѱ� Ÿ�̾� ��ü ���� ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		//��ȣ Ÿ�̾� ��ü ���� ����
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
