package sec02;

public class SmartPhone extends Phone{ //Phone ��ӹ���

	//�ʵ�
		public boolean wifi;
	//������
		public SmartPhone(String model, String color) {
			super(model, color); //�θ� ������ ȣ��
			System.out.println("SmartPhone(String model, String color) �����ڰ� ����");

		}	
	//�޼ҵ�
		public void setwifi(boolean wifi) {
			this.wifi = wifi;
			System.out.println("���������� ���¸� �����߽��ϴ�.");
		}
		
		public void internet() {
			System.out.println("���׳ӿ� ���� �մϴ�.");
		}
	
}


