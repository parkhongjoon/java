package sec04;

import java.util.Scanner;

public class EmptyStringExam {

	public static void main(String[] args) {
//		�ֹι�ȣ 7�ڸ��� �޾Ƽ� �ڿ� ���ڸ��� ��,�� �Ǻ��Ͻÿ�
//		String hobby = "";
//		
//		if(hobby.equals("")) {
//			System.out.println("��̸� �� ã���ô°� �ǰ��� ���ƿ�.");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("�ֹι�ȣ ��6�ڸ�");
//		
//		String num1 = sc.nextLine();
//		
//		System.out.println("�ֹι�ȣ ��1�ڸ�");
//		
//		String num2 = sc.nextLine();
//		
//		if(num2.equals("2")) {
//			System.out.println("�����Դϴ�.");
//		}else {
//			System.out.println("�����Դϴ�.");
//		}
		
		
//		�ֹι�ȣ 7�ڸ��� �޾Ƽ� �ڿ� ���ڸ��� ��,�� �Ǻ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ֹι�ȣ 7�ڸ�");
			String gender = sc.nextLine();
		
			if(gender.length() == 7) {
				char s =gender.charAt(6);
				switch(s) {
					case '1' : case '3':
						System.out.println("����");
					break;
					case '2' : case '4':
						System.out.println("����");
					break;
				}
				break;
			}
		
		}
		System.out.println("����");
	}
}
