package hw;

public class Cal {
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
	
	int min(int x, int y) {
		int result2 = x-y;
		return result2;
	}
	
	double cro(int x, int y) {
		double result3 = (double)x * (double)y;
		return result3;
	}
	
	double divide(int x, int y) {
		double result4 = (double)x / (double)y;
		return result4;
	}
}