package sec06;

public class Calculator {

	//�ʵ� ����
	//������ �⺻
	
	//�޼ҵ�
	
	//������ ���� �޼ҵ� ���� sysout�տ� return�� ���� ��� void ����
	void powerOn(){
		System.out.println("������ Ų��.");
	}
	
	void powerOff() {
		System.out.println("������ ����");
	}
	
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}
