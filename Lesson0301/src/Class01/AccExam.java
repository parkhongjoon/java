package Class01;

public class AccExam {

	public static void main(String[] args) {
		/*
		 * ����� 1�ִ�. �� ����� 10�������� ������.
		 * �� ������ 0.1
		 * 7������ �԰� ���� ������?
		 * 0.3
		 */
		int apple = 1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number*onePeace;
		System.out.println("��� �Ѱ����� ���� ���� " + resultApple + "�Դϴ�");
		
		int totalPeace = apple * 10;
		int resultApple2 = totalPeace - number;
		System.out.println("��� 10���� �߿� ���� ������ " + resultApple2);
		System.out.println("��� �� ������ ���� ���� " + resultApple2/10.0);
		
	}

}
