package sec15;

public class SingletonExam {

	public static void main(String[] args) {

		//singleton ton1 = new Singleton(); Singleton�� private�̱� ������ �ܺο��� ���� �Ұ���
		//singleton ton2 = new Singleton();
		
		//�����޼ҵ带 ȣ���ؼ� �̱��� ��ü�� ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		
	}

}
