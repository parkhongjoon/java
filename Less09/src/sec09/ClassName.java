package sec09;

public class ClassName {

//�ν��Ͻ� ���
	int field1;
	void method1() {}
	
//���� ���
	static int field2;
	static void method2() {}
	
	//�������
	static {
		// field1 = 10; //���� ��Ͽ��� �ν��Ͻ� ����� ����Ϸ��� �ؼ� ������ ����
		// method1();	//���� ��Ͽ��� �ν��Ͻ� ����� ����Ϸ��� �ؼ� ������ ����
		field2 = 10; //���� ��Ͽ��� ���� ����� ��밡��
		method2();
	}
	
	//�����޼ҵ�
	static void method3() {
		// this.field1 = 10; // ���� �޼ҵ忡�� �ν��Ͻ� ��� this�� ����Ҽ� ����.
		// this.method1(); // 
		field2 = 10; //���� ��Ͽ��� ���� ����� ��밡��
		method2();
	}
}
