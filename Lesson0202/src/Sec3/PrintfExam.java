package Sec3;

public class PrintfExam {

	public static void main(String[] args) {

		int value = 123;
		System.out.printf("��ǰ�� ������ %d�� �Դϴ�. \n", value);
		System.out.printf("��ǰ�� ������ %6d�� �Դϴ�. \n", value);
		System.out.printf("��ǰ�� ������ %-6d�� �Դϴ�. \n", value);
		System.out.printf("��ǰ�� ������ %06d�� �Դϴ�. \n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f\n", 10, area);
		
		String name = "ȫ�浿";
		String job = "���ϳ�";
		System.out.printf("%d| %-10s| %-10s\n", 1, name, job);
	}

}
