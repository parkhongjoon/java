package Exam132.package2;

import Exam132.package1.A;

public class C {
	//�޼ҵ带 ����� �ҷ���
	public void methodB() {
		//A Ŭ������ ��ü�� ����
		A a = new A();
		
		//a�� �ʵ带 ����
		a.field1 = 11; // public �ʵ�� �� Ŭ�������� ���氡��
//		a.field2 = 21; // default �ʵ�� ���� Ŭ�����̹Ƿ� ���� ����
//		a.field3 = 31; private �ʵ�� �ܺ� Ŭ�������� ������ �Ұ���
		
		//�޼ҵ� ȣ��
		a.method1();
		//a.method2(); default �ʵ�� �ٸ� ��Ű�� �̹Ƿ� ���� ����
		//a.method3(); private �޼ҵ�� �ܺ� Ŭ�������� ������ �Ұ���
	}
}
