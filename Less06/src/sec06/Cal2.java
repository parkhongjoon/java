package sec06;

public class Cal2 {

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();
		
		//���ϰ��� ���� �޼ҵ带 ��� .�� ������ ������ �ҷ��ö� ���
		cal.powerOn(); //�ܺ� �޼ҵ忩�� ��ü�� �޾Ƽ� ���
		
		int rs = cal.plus(143, 145);
		System.out.println("143 + 145 = " + rs);
		
		double rs2 = cal.divide(120, 15);
		System.out.println("120 / 15 = " + rs2);
		
		cal.powerOff();
		
		cal.autoCalculator(111, 222);
	}

}