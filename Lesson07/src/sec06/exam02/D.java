package sec06.exam02;

import sec06.exam01.A;

public class D extends A{
	//������ ����
	public D() {
		//A ������ ȣ��
		super();
	}
	
	//�޼ҵ� ����
	public void method1() {
		//A �ʵ� ����
		this.field = "value";
		
		//A �޼ҵ� ȣ��
		this.method();
	}
	
	//�޼ҵ� ����
	public void method2() {
		/**
		 * ����� �޾Ҿ procted ���������ڰ� �ִ� Ŭ������ ���� ��ü�� ����� ��� �� ���� ����.
		 */
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
