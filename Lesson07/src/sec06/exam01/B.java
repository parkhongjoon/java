package sec06.exam01;

/* Class B���� �޼ҵ带 ������ �� AŬ������ a�� ��üȭ �Ͽ� �ʵ�� �޼ҵ带
 * ȣ����Ѻ��� */
public class B {
	/**
	 * ���������� protected�� ���� ��Ű�� �������� public , default�� ���� �����Ӱ� ����� �����ϴ�.
	 */
	
	//�޼ҵ� ����

	public void method( ) {
		A a = new A(); // ---- ���� ��Ű�� �ȿ��� protected�� ��� ����
		a.field = "value";
		a.method();
	}
}
