package Exam131.package1;

public class A {
	//�ʵ弱��
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//public ���� �������� ������ ����
	public A(boolean b) {};
	
	//default ���� �������� ������ ����
	A(int b) {}
	
	//private ���� �������� ������ ����
	private A(String s) {}
}
