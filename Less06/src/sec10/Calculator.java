package sec10;

public class Calculator {

	
//	�ʵ�� �޼ҵ�� ���� ����� ���� �ν��Ͻ� ��� , ���� ����� ���еȴ�.
//
//
//	instance ��� - ��ü�Ҽӵ� ���
//	static ��� - Ŭ������ ������ ���

	//�����ʵ�
	static double pi = 3.14159;
	
	//���� �޼ҵ�
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus(int x , int y) {
		return x - y;
	}
	
	//�ν��Ͻ� �޼ҵ�
	int multiply(int x, int y) {
		return x * y;
	}
	
	
}
