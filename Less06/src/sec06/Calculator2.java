package sec06;

public class Calculator2 {
	//�ʵ� -- ����
	//������ -- �⺻������
	//method
	
	//������ ���� �޼ҵ带 ����
	void powerOn(){
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	//�� �Ű������� ���ϴ� �޼ҵ�
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	//�� ������ ������ �޼ҵ�
	double divide(int x , int y) {
		double result =(double) x / y;
		return result;
	}
	
	void autoCalculator(int x , int y) {
		powerOn(); //���� �޼ҵ带 ����ؼ� �׳� ��밡��
		int rs = plus(x , y);
		double rs2 = divide(x , y ); 
		System.out.println(x + "+" + y + "=" + rs);
		System.out.println(x + "+" + y + "=" + rs2);
		powerOff();

	}
}