package Sec3;

import java.util.Scanner;

public class Scanner2Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int data = 0;
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ��� ");
			String sc = scanner.nextLine();
			int x = Integer.parseInt(sc);
			data += x;
			
			if(x == 0) {
				break;
			}
			System.out.println("���� " + data);		
			
		}
		System.out.println("---------- ��  ----------");
	}

}
