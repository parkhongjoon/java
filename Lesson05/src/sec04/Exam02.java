package sec04;


public class Exam02 {
	public static void main(String[] args) {
		
//		 �ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�. �ڹٸ� java�� ����
//		 String num1 = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
//
//		 System.out.println(num1);
//		 
//		 String num2 = num1.replace("�ڹ�","java");
//		 
//		 System.out.println(num2);
		
//		1.Hello,World! ���� World�� ���� �Ͻÿ�.
//		2.Hello �� ���� �Ͻÿ�.
		
		String num1 = "Hello,World!";
		
		System.out.println(num1);
		
		String num2 = num1.substring(6,11);
		
		System.out.println(num2);
		
		String num3 = num1.substring(0,5);
		
		System.out.println(num3);
		

	}
}