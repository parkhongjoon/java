package sec06.exam03;

public class ChildEx {

	public static void main(String[] args) {

		//�ڽ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ
		Parent parent = new Child();
		
		//Parent Ÿ������ ���
		parent.field = "������1";
		parent.method1();
		parent.method2();
		
//		�θ� Ÿ������ ��ȯ�߱� ������ ���Ұ�
//		parent.field2; 
//		parent.method3(); 
//		
//		�ڽ� Ŭ���� Ÿ������ ���� Ÿ�Ժ�ȯ
		Child child = (Child) parent;
		child.field = "������1";
		child.method1();
		child.method2();
		
		child.field2 = "������2";
		child.method3();
	}

}
