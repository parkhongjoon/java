package sec02;

public class Phone {
	//�ʵ�
	 public String model;
	 public String color;
	 
	 public Phone(String model, String color) {
		 this.model = model;
		 this.color = color;
		 System.out.println("Phone(String model, String color) �θ� ������ ����");
	 }
	 
	//������ - ������ ������ �⺻������ Phone(){} ���� �ʵ忡 ����� �ذŸ� {}�ȿ� ���
	//�޼ҵ�
	 public void bell() {
		 System.out.println("���� �︳�ϴ�.");
	 }
	 
	 public void sendVoice(String message) {
		 System.out.println("�� : " + message);
	 }
	 
	 public void receiveVoice(String message) {
		 System.out.println("���� : " + message);
	 }
	 public void hangUp() {
		 System.out.println("��ȭ�� �����ϴ�.");
	 }
}
