package sec02;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		//��ü�� �����ؼ� ���
		SmartPhone myPhone = new SmartPhone("������", "��ũ���"); 
			
		//Phone���� ���� ��ӹ��� �ʵ带 �б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		
		//SmartPhone �ʵ�
		System.out.println("�������� ���� : " + myPhone.wifi);
		
		//Phone���� ���� ��� ���� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ���? ���� ���� ��ǰ�� �־� ��ȭ��Ǿ��.");
		myPhone.sendVoice("���� ���� �ٻ���. �����.");
		
		//SmartPhone �޼ҵ� ȣ��
		myPhone.setwifi(true);
		myPhone.internet();
	}

}
