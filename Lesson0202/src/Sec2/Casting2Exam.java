package Sec2;

public class Casting2Exam {

	public static void main(String[] args) {

		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte rs = byteVal1 + byteVal2; ������ ���� int�� ��ȯ�ؾ��� int�� �⺻Ÿ��//
		int rs = byteVal1 + byteVal2;
		System.out.println(rs);
		
		char charVal1 = 'A';
		char charVal2 = 1;
		
		//char charVal3 = charVal1 + charVal2; // ������ ���� ������ ������ int��
		int charVal3 = charVal1 + charVal2;
		System.out.println("�����ڵ�� " + charVal3); //A �����ڵ� = 65
		System.out.println("���� ���ڴ� " + (char) charVal3); //��� ���� =  ABCD ���ĺ���
		
		int intVal3 = 10;
		int intVal4 = 4;
		int intVal5 = intVal3 / intVal4;
		System.out.println(intVal5);
		
		double doubleVal = intVal3 / (double) intVal4; // ������ȯ �Ƚ��ѵ� ����
		System.out.println(doubleVal);
	}

}
