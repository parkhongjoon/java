package Sec3;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x�� ���� �Է��ϼ���. ");
		String strX = sc.nextLine();
		
		System.out.println("���� y�� ���� �Է��ϼ���. ");
		String strY = sc.nextLine();
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		int result = x + y;
		System.out.println("x + y=" + result );
		System.out.println("+++++++++Ten END++++++++++++");
	}

}
