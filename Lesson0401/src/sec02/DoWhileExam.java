package sec02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {

		System.out.println("�޼����� �Է��Ͻÿ�.");
		System.out.println("���α׷��� ���� �Ϸ��� q�� �Է� �ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while( ! inputString.equals('q'));
	}

}
