package sec08;

public class ArrayStringEX {

	public static void main(String[] args) {

		String[] strArr = new String[3];
		strArr[0] = "Java"; //���� ��ü�� �ּ�����
		strArr[1] = "Java"; //���� ��ü�� �ּ�����
		strArr[2] = new String("Java"); // ���ο� �ּҿ� ����
		
		System.out.println("0�� :" + strArr[0]);
		System.out.println("1�� :" + strArr[1]);
		System.out.println("2�� :" + strArr[2]);
		
		System.out.println(strArr[0]==strArr[1]); //true ���� �ּ�
		System.out.println(strArr[0]==strArr[2]); //false ���ڿ��� ������ �ٸ� �ּҿ� ���� 
		
		System.out.println(strArr[0].equals(strArr[2])); //���ڿ��� ����,�ٸ��� equals()���
		
		
	}

}
