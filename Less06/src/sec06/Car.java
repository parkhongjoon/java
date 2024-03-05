package sec06;

public class Car {
	
	/*
	 * -������ �����ε�-
	 * �Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ �ϴ� �� - �����ε� Overloading
	 * �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ� ���� '������ �����ε�'�̶�� �Ѵ�
	 * ������ �����ε��� 0~�ִ밪���� �����ϴ�
	 * �Ű������� ������ �������� Ÿ���� �޶�� �ϰ� �ƴϸ� �Ű������� ������ �޶���Ѵ�.
	 * */

	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
		this("�׷���","����", 300);
	}
	Car(String model) {
		this(model, "����", 300);
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
//	Car(String color, String model){
//		������ ���� Ÿ���̶� �Ұ���
//	}
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = 300;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
