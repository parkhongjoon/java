package Exam02;

public class KF21Airplane extends Airplane {
	//��� ���� ����� static final�� ����
	public static final int normal = 1;
	public static final int supersonic = 2;
	
	//���¼��� �ʵ�
	public int flyMode = normal;

	@Override
	public void fly() {
		if(flyMode == supersonic) {
			System.out.println("������ ������ �մϴ�.");
		}else {
			//�θ� Ŭ���� Airplane�� method fly() ȣ���ؼ� ���
			super.fly();
		}
		
	
	}
	
}
