package sec04;

public class StringExam {

	public static void main(String[] args) {

		
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		String name3 = new String("ȫ�浿");  //���ο� ������ ���� �ּҰ� �ٸ�
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name3 == name2);
		
		System.out.println(name1.equals(name3)); // "ȫ�浿"�̶�� ���ڿ��� ���Ƽ� equals ������ ���
		
		
	}

}
