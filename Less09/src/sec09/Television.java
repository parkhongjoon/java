package sec09;

public class Television {

	//���� ��� �ȿ��� �ν��Ͻ� ����� ����Ҽ�����.
	
	//�ν��ͽ� �ʵ�
	int pay = 20000000;
	String color;
	
	//�����ʵ�
	static String company = "LG"; //�����ʵ�� �Ϲ������� �ٷ� �ʱ�ȭ�� �Ѵ�.
	static String model = "OLED";
	static String info; //��������� �����ϴ� ���
	static {  
		info = company + "-" + model;
	}

	void method1(int getPay) {   // �ν��Ͻ� �޼ҵ�
		this.pay = getPay;
		this.color = "����";
		System.out.println(this.pay + ", " + this.color + info);
	}
	
	static void method2() {    // ���� �޼ҵ�
		System.out.println(info); // �ν��Ͻ� �޼ҵ�� ��ü�� �����Ǿ߸� ��밡�� �ϱ⶧���� ���� �޼ҵ忡�� ���Ұ�
								  // System.out.println(info+this.pay); ���Ұ�
	}
}
